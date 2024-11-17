package com.programe.datastructure.leetcode.section1;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        /**
         * 15. 3Sum
         * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
         * and j != k, and nums[i] + nums[j] + nums[k] == 0.
         *
         * Notice that the solution set must not contain duplicate triplets.
         *
         * Example 1:
         * Input: nums = [-1,0,1,2,-1,-4]
         * Output: [[-1,-1,2],[-1,0,1]]
         * Explanation:
         * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         * The distinct triplets are [-1,0,1] and [-1,-1,2].
         * Notice that the order of the output and the order of the triplets does not matter.
         *
         *Example 2:
         * Input: nums = [0,1,1]
         * Output: []
         * Explanation: The only possible triplet does not sum up to 0.
         *
         * Example 3:
         * Input: nums = [0,0,0]
         * Output: [[0,0,0]]
         * Explanation: The only possible triplet sums up to 0.
         */
        int[] nums = {-2,0,0,2,2};
        printOutput(bruteForce(nums));
        printOutput(twoPointerApproach(nums));
        printOutput(threeSum(nums));
    }




    /**
     * TC-O(N^2)
     * @param nums
     * @return
     */
    public static List<List<Integer>> twoPointerApproach(int[] nums){
        int n = nums.length;
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++) {
            if(i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int x=i+1;
            int y=n-1;
            while(x<y) {
                int sum = nums[i]+nums[x]+nums[y];
                if(sum==0){
                    ArrayList<Integer> num = new ArrayList<>();
                    num.addAll(Arrays.asList(nums[i],nums[x],nums[y]));
                    result.add(num);
                    x++;y--;
                } else  if(sum<0) {
                    x++;
                } else {
                    y--;
                }
            }
        }
        return new ArrayList<>(result);
    }


    /**
     * Brute Appraoch - TC-O(N^3)
     * Note - solution is not for check duplicate tripplats  (Without sort)
     * @param nums
     * @return
     */
    public static List<List<Integer>> bruteForce(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i< n;i++) {
            if(i>0 && nums[i]==nums[i-1] ) {
                continue;
            }
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(nums[i]+nums[j]+nums[k]==0) {
                        ArrayList<Integer> num = new ArrayList<>();
                        num.addAll(Arrays.asList(nums[i],nums[j],nums[k]));
                        result.add(num);
                    }
                }
            }
        }
        return result;
    }


    /**
     * online approach Copy paste code
     */
    static List<List<Integer>> res;
    public static List<List<Integer>> threeSum(int[] nums) {
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int i) {init(); return res.get(i);}
            public int size() {init(); return res.size();}
            void init() {
                if (res != null) return;
                Arrays.sort(nums);
                res = new ArrayList<>();
                int n=nums.length, j=0, k=0, sum=0;
                for (int i=0; i<n-2; i++) {
                    if (i > 0 && nums[i] <= 0 && nums[i] == nums[i-1]) {
                        continue;
                    }
                    if (nums[i] > 0) break;
                    j=i+1; k=n-1;
                    while ( j < k ) {
                        sum = nums[i] + nums[j] + nums[k];
                        if (sum == 0) {
                            res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            while (j<k && nums[j] == nums[j+1]) j++;
                            while (j<k && nums[k] == nums[k-1]) k--;
                            j++; k--;
                        } else if (sum < 0){
                            j++;
                        } else {
                            k--;
                        }
                    }
                }
            }
        };
    }

    public static void printOutput(List<List<Integer>> list){
        System.out.print("\n\n[\n");
        for(List<Integer> l : list){
            System.out.print("[");
            for(int i : l) {
                System.out.print(i+",");
            }
            System.out.print("]\n");
        }
        System.out.print("]");
    }
}
