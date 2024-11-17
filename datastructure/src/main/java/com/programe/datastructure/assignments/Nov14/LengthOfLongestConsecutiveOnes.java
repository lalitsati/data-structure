package com.programe.datastructure.assignments.Nov14;

public class LengthOfLongestConsecutiveOnes {
    public static void main(String[] args) {
        /**
         * Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the
         * length of the longest consecutive 1’s that can be achieved.
         *
         * Constraints
         * 1 <= length of string <= 1000000
         * A contains only characters 0 and 1.
         *
         * For Example
         *
         * Input 1:
         *     A = "111000"
         * Output 1:
         *     3
         *
         * Input 2:
         *     A = "111011101"
         * Output 2:
         *     7
         */
        String str = "111011101";
       // System.out.print("Longest consicutive string - "+solve(str));
        System.out.print("Longest Coniculltive String - "+optimizedSolution(str));

    }

    /**
     *
     * @param str
     */
    private static int optimizedSolution(String str) {
        //first handle edge case - find the number of 1 occurence in array
        int countOne=0;
        int n = str.length();
        int maxCount=0;
        for(int i=0;i<n;i++) {
            if(str.charAt(i)=='1'){
                countOne++;
            }
        }
        if(countOne==n) {
            return countOne;
        }

        //center approach with 0 value
        for(int i=0;i<n;i++){

            if(str.charAt(i)=='0') {
                //count 1 occuerence at left side of 0
                int j=i-1;
                int leftCount=0;
                while(j>=0 && str.charAt(j)!='0') {
                    leftCount++;
                    j--;
                }
                //count 1 occuerence at right side of 0
               int k=i+1;
                int rightCount=0;
                while(k<n && str.charAt(k)!='0') {
                    rightCount++;
                    k++;
                }
                //check swap
                int count = leftCount+rightCount+1;
                if(countOne==leftCount+rightCount) {
                   maxCount=count-1;
                   break;
                }
                if(count>maxCount) {
                    maxCount=count;
                }
            }
        }
        return maxCount;
    }




    /**
     *
     * @param str
     * @return
     */
    public static int solve(String str) {
        /**
         * 1. find the 0 position and mark is at center
         * 2. find all the 1 existed there right and left side till next or previous 0
         * 3. find the next one after finding next or previous 0 for swap
         * 4. if next or previous 1 will find then use this formula - length = left+right+1
         * 5. if not then length=left+right
         * 6. compare with the maxLength and assign it if maxLength is less the of its
         * 7. return maxLength
         *
         */
        int n = str.length();
        int leftIndex=0;
        int currentIndex=0;
        int rightIndex=0;
        int maxCount=0;
        for(int i=0;i<n;i++) {
            if(str.charAt(i)=='0'){
                currentIndex = i++;
                //find the right index
                while(i<n) {
                    if(str.charAt(i)=='0') {
                        rightIndex=i-1;
                        break;
                    } else {
                        i++;
                        rightIndex++;
                    }
                }
                //find the latest one at right end
                int count=(currentIndex-leftIndex)+(rightIndex-currentIndex);
                if(!findTheSwapIndex(str, i,n-1)) {
                    if(findTheSwapIndex(str,0,leftIndex)) {
                        if(count+1>maxCount){
                            maxCount=count+1;
                        }
                    } else {
                        if(count>maxCount) {
                            maxCount=count;
                        }
                    }
                } else {
                    if(count+1>maxCount){
                        maxCount=count+1;
                    }
                }
                leftIndex=currentIndex;
            } else {
                rightIndex++;
            }
        }
        if(maxCount==0) {
            if(leftIndex+rightIndex>maxCount) {
                maxCount=leftIndex+rightIndex;
            }
        }

        return maxCount;
    }

    private static boolean findTheSwapIndex(String str, int x, int y) {
        while(x<y) {
            if(str.charAt(x)=='1' || str.charAt(y)=='1') {
                return true;
            }
        }
        return false;
    }
}
