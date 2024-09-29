package com.programe.datastructure.arrays;
import java.util.*;

public class TwoSumProblem {
    public static void main(String[] args) {
        //Given one Array and value of N
        //Value N should  be equal to sum of any two elements from array
        //ifUniqueElementsInsideArray();
        // ifDuplicateElementsInsideArray();
        findUniqueCombinationFromArray();

    }

    /**
     * find Unique combination
     */
    public static void findUniqueCombinationFromArray(){
        int[] num = {4,3,2,4,8,5,2,4,3};
        int n = 7;
        Map<Integer, Integer> tmpHash = new HashMap<Integer, Integer>();
        List<String> result = new ArrayList<String>();
        for(int i=0;i< num.length;i++) {
            int tmp = n-num[i];
            if((tmpHash.get(tmp)!=null && tmpHash.get(tmp)==0) ||
                    (tmpHash.get(num[i])!=null && tmpHash.get(num[i])==0)) continue;

            if(tmpHash.get(tmp)!=null && tmpHash.get(tmp)>0) {
                result.add(num[i]+"-"+tmp);
                tmpHash.put(tmp, (tmpHash.get(tmp)-1));
            } else {
                tmpHash.put(num[i], 1);
            }
        }
        System.out.println("Combination of index which having Two Sum ="+result );
    }


    /**
     * no any limitation inside array about duplicate elements
     */
    public static void ifDuplicateElementsInsideArray(){
        ////No any limitations about elements
        int[] num = {4,3,2,3,4,8,5,2,4};
        int n = 7;
        //Create on HasMap which will store Array elements and occuring count
        Map<Integer, Integer> tmpHash = new HashMap<Integer, Integer>();
        List<String> result = new ArrayList<String>();
        Set<String> resultSet = new HashSet<String>();
        // check 2 sum if existed inside array by treversiong
        for(int i=0;i< num.length;i++) {
            int tmp = n-num[i];
            if(tmpHash.get(tmp)!=null && tmpHash.get(tmp)>0) {
                result.add(num[i]+"-"+tmp);
                resultSet.add(num[i]+"-"+tmp);
                tmpHash.put(tmp, (tmpHash.get(tmp)-1));
            } else {
                if(tmpHash.get(num[i])!=null) {
                    tmpHash.put(num[i], (tmpHash.get(num[i])+1));
                } else {
                    tmpHash.put(num[i], 1);
                }
            }
        }
        System.out.println("Combination of index which having Two Sum ="+result +resultSet);
    }

    /**
     * UniqueElementsInsideArray (Two Sum Problem)
     */
    public static void ifUniqueElementsInsideArray(){
        ////in case of unique elements inside array
        int[] num = {5,8,6,7,2,9,4,3,1,0};
        int n=11;
        Map<Integer, Integer> tmpHash = new HashMap<Integer, Integer>();
        List<String> storeIndex = new ArrayList<String>();
        //traversing in array to get 1 by 1 elements value of X
        //find the Y value (Y=n-X)
        //if value of Y is not available inside HashMap then store value of X
        //if value of Y is available then get the index value from HashMap and store it Set -

        ////////////////////////// 'coding' ///////////////

        for(int i=0;i< num.length;i++) {
            int y = n-num[i];
            if(tmpHash.get(y)!=null) {
                storeIndex.add(i+","+tmpHash.get(y));
            } else {
                tmpHash.put(num[i], i);
            }
        }
        System.out.println("Combination of index which having Two Sum ="+storeIndex);
    }


}