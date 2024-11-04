package com.programe.datastructure.assignments.Oct23;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestMinMax {
    public static void main(String args[]) {
        /**
         * Q2. Closest MinMax
         *
         * Problem Description
         * Given an array A, find the size of the smallest subarray such that it contains at least one
         * occurrence of the maximum value of the array
         * and at least one occurrence of the minimum value of the array.
         *
         * Problem Constraints
         * 1 <= |A| <= 2000
         *
         * Input 2:
         * A = [2, 6, 1, 6, 9]
         *  Output - 3
         *  Explaination -
         *  Take the last 3 elements of the array.
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(833,979,181,437,279,292,140,439,396,908,444,363,102,52,36,58,115,41,107,858,976,830,863,387,984,159,180,507,780,529,156,613,861,689,402,492,333,542,931,730,803,727,445,905,779,834,315,895,875,774,105,203,605,968,590,941,480,770,800,260,652,956,225,865,998,628,357,331,522,641,413,325,368,859,582,148,693,898,395,920,672,500,124,629,821,714,571,653,837,371,913,841,680,490,58,678,470,767,361,993,408,775,318,129,986,901,629,31,151,24,951,175,876,427,805,697,494,376,350,331,99,615,524,779,458,934,809,928,701,171,921,110,946,592,591,284,845,220,315,996,244,266,171,472,46,328,170,540,704,872,223,156,840,747,287,298,681,97,578,382,620,500,844,566,444,435,850,289,7,517,637,603,135,160,76,181,489,598,721,545,822,944,701,662,691,341,312,724,438,891,459,58,391,655,976,187,443,178,476,450,695,465,54,830,977,482,12,466,80,733,364,902,30,417,565,721,758,229,798,196,120,609,606,863,264,934,50,707,112,878,510,807,343,916,990,321,398,354,139,478,87,503,380,117,921,297,191,31,527,341,580,647,950,186,863,566,121,913,274,585,792,136,745,487,52,735,160,450,89,652,928,528,507,660,998,780,310,541,812,837,234,392,836,536,930,51,102,51,965,728,637,109,864,734,948,916,469,461,718,910,113,646,790,620,659,788,753,969,681,565,158,915,957,346,451,239,398,906,291,715,634,280,824,499,14,124,767,835,585,838,745,50,836,535,23,495,676,776,816,709,341,974,625,650,673,428,889,423,334,532,138,969,164,314,820,178,790,939,365,376,777,462,426,614,350,801,461,26,577,278,87,918,604,64,920,277,493,810,52,179,342,190,500,507,856,672,37,647,612,755,375,741,217,153,707,567,955,169,945,532,799,33,803,403,97,723,33,942,533,437,122,228,980,622,87,836,647,476,835,611,231,210,352,449,716,412,368,671,933,666,555,732,699,358,487,148,82,872,443,967,310,565,195,290,539,634,478,186,111,314,797,694,876,502,495,592,914,864,615,847,530,171,931,581,881,418,81,963,291,524,283,953,441,830,243,981,465,721,519,928,35,669,622,264,523,118,856,437,334,824,636,864,347,919,797,228,689,230,544,980,755,827,285,196,9,528,529,474,250,49,754,637,718,377,253,593,847,462,30,181,286,18,397,633,289,194,861,978,424,757,311,531,584,596,728,594,125,257,420,727,658,175,716,728,904,322,321,751,784,703,932,70,73,329,55,362,875,268,341,651,26,652,183,962,600,263,908,77,872,329,156,531,856,873,611,760,547,933,511,331,988,795,401,62,476,808,424,351,76,117,354,454,121,889,417,722,504,325,799,377,654,308,260,862,533,223,622,80,156,485,411,497,280,164,559,756,972,335,459,400,453,166,855,926,55,272,648,560,597,800,289,604,108,901,466,993,124,441,73,633,278,484,130,559,648,689,667,972,376,479,372,181,997,227,108,52,499,108,964,449,260,253,405,720,506,223,713,631,664,786,264,943,270,394,854,270,435,873,242,163,704,615,345,701,194,453,106,46,913,70,495,174,676,900,894,182,475,608,165,140,394,429,435,17,175,641,287,962,866,882,126,923,849,471,976,43,276,82,89,189,505,936,363,533,188,610,715,664,218,233,804,964,662,591,333,838,584,621,152,802,855,278,725,704,101,702,99,377,784,189,919,641,125,634,174,666,244,242,330,814,475,486,131,137,429,464,327,13,437,480,815,292,110,893,348,212,595,448,589,731,989,860,373,466,495,547,132,91,789,462,906,264,948,37,754,377,853,433,742,291,913,558,935,24,803,284,236,750,732,177,481,721,390,206,187,885,106,320,328,247,134,234,864,83,623,970,812,477,403,555,120,317,465,55,693,620,691,281,370,423,810,203,496,200,410,36,437,868,356,766,115,842,352,331,277,976,301,90,805,57,997,277,726,814,684,419,434,376,52,804,799,862,7,648,415,769,684,852,637,392,970,105,234,323,436,512,651,90,954,808,147,951,85,873,765,769,644,199,145,696,355,297,910,362,945,677,132,981,530,121,373,852,226,607,175,15,471,178,457,425,986,956,376,71,829,493,193,825,44,690,873,399,987,783,114,284,461,598,265,343,719,638,195,298,598,723,665,69,901,122,847,240,78,223,663,259,69,856,84,113,899,957,865,886,92,979,523,553,929,140,248,648,131,796,298,729,871,963,150,772,85,997,364,515,573,28,774,642,236,858,107,135,167,324,374,260,303,897,165,584,37,766,585,520,562,883,249,433,847,752,557,284,101,922,800,674,302,926,668,538,137,128,674,304,452,48,916,108,297,82,692,686,848,277,207,762,161,808,547,360,560,104,996,662,378,796,688,680,75,357,219,212,485,245,516,289,645,433,397,942,867,90,628,67,719,187,829,232,996,376,592,556,832,941,570,211,89,259,243,164,616,814,376,453,411,893,742,56,678,140,998,897,582,979,964,301,166,145,534,162,521,478,71,353,419,641,916,509,900,512,673,868,326,402,673,738,647,416,794,677,908,145,574,842,124,538,495,290,683,29,805,556,860,876,261,631,517,178,492,418,690,518,638,368,920,312,458,567,80,605,244,988,750,818,182,226,708,677,868,743,59,673,651,919,549,912,902,419,442,395,837,484,265,475,853,185,139,663,104,219,620,348,207,722,518,741,948,578,419,169,673,478,842,324,749,744,588,3,163,31,398,352,515,15,179,720,200,319,736,304,538,356,4,98,79,874,839,379,804,610,548,477,88,391,153,189,487,742,193,650,125,943,354,640,959,533,713,511,852,449,816,391,805,172,841,884,47,680,616,851,291,164,681,731,907,186,921,394,928,466,396,53,409,750,46,720,284,759,232,488,208,400,231,365,924,72,602,323,105,218,527,396,382,208,479,642,394,752,388,675,218,785,80,980,887,126,700,523,237,284,12,797,684,243,163,961,316,765,284,421,335,811,169,717,19,0,711,766,753,100,441,971,237,521,303,124,0,356,648,589,640,12,387,677,255,550,638,923,667,922,
                696,2,734,217,71,105,218,783,871,971,235,664,294,472,538,950,948,890,306,948,479,946,960,866,623,568,768,613,843,435,536,892,789,622,109,861,727,679,996,951,2,231,967,649,55,505,599,3,395,905,304,875,851,264,93,827,184,862,792,380,649,680,272,439,302,733,652,382,413,648,685,767,231,652,416,286,158,367,641,905,272,297,132,476,562,226,655,98,440,447,478,89,128,102,528,782,836,532,164,601,180,849,720,763,502,489,401,12,856,43,917,129,340,402,605,254,628,260,705,420,59,535,509,187,638,390,970,826,922,486,779,455,688,499,218,542,988,620,554,845,15,823,326,707,225,931,314,205,543,19,625,602,554,487,142,544,229,464,722,151,950,501,958,638,1,529,180,341,149,86,538,516,910,864,223,487,147,537,45,690,908,22,645,815,509,139,711,90,603,434,594,553,935,552,544,288,81,724,982,582,163,520,98,425,385,674,912,884,563,309,927,472,332,572,639,193,63,350,284,666,784,878,571,72,782,115,360,216,192,342,798,355,215,249,780,952,923,44,836,486,706,763,310,38,687,949,583,750,652,219,768,436,449,340,508,584,807,221,800,351,563,598,58,130,199,838,82,122,235,919,961,941,34,623,331,722,925,266,824,577,838,593,13,287,285,874,871,92,95,23,796,10,974,854,141,173,45,223,648,632,494,609,925,529,584,256,603,509,874,427,86,712,372,452,352,657,326,575,102,421,599,898,783,573,104,924,98,149,500,746,781,994,707,706,875,292,314,830,801,541,258,240,253,630,692,957,640,370,533,94,791,484,344,574,409,448,851,507,950,351,606,83,697,313,790,925,957,456,755,111,997,365,351,603,348,395,912,988,765,445,434,908,281,778,834,42,578,685,550,528,388,156,612,438,821,754,363,779,562,470,890,560,836,241,515,184,988,427,524,753,225,958,661,858,88,495,901,666,533,451,547,921,959,511,359,132,617,74,911,179,545,801,91,381,394,606,917,382,386,441,487,963,399,148,821,839,996,722,505,529,525,404,450,484,915,162,617,532,236,880,712,781,34,155,514,428,114,431,163,500,872,2,463,623,151,284,462,499,359,320,28,884,724,830,721,640,992,338,524,229,570,236,362,604,392,877,33,858,660,548,358,533,550,173,508,53,809,971,904,168,291,932,405,15,115,126,7,107,816,532,688,386,120,403,991,864,632,376,722,292,924,80,825,826,605,334,232,415,657,136,935,300,421,340,315,536,466,675,995,282,207,36,669,327,439,12,192,423,388,266,715,664,699,893,490,304,579,74,71,236,211,7,536,984,699,203,872,518,878,867,152,437,903,173,117,694,185,661,117,573,927,185,237,626,78,80,931,657,154,2,245,717,361,133,701,413,688,573,931,567,793,83,356,48,257,473,95,794,134,564,368,414,749,957,40,179,37,323,188,544,678,433,613,391,918,315,804,607,240,735,526,385,171,882,434,780,708,881,574,194,445,294,608,547,252,1,726,641,324,915));
        System.out.printf("Size of Min and Max Sub-array element - {%d}",solve(list));

    }

    /**
     *
     * @param list
     * @return
     */
    public static int solve(ArrayList<Integer> list) {
        //find min and max element index in list
        int minValue=list.get(0),maxValue=list.get(0);
        int x=0, y=list.size()-1;
        int subArrLength=list.size();
        while(x<=y){
            int xValue=list.get(x);
            int yValue=list.get(y);

            //find the min value
            if(xValue<yValue && xValue<minValue) {
                minValue = xValue;
            } else if(yValue<minValue){
                minValue = yValue;
            }

            //find the max value
            if(xValue>yValue && xValue>maxValue) {
                maxValue = xValue;
            } else if(yValue>maxValue){
                maxValue = yValue;
            }
            x++;y--;
        }
       return findLenghOfSubArray(list, minValue, maxValue);
    }

    /**
     *
     * @param list
     * @param minValue
     * @param maxValue
     */
    private static int findLenghOfSubArray(ArrayList<Integer> list, int minValue, int maxValue) {
        boolean minFlag=false;
        boolean maxFlag=false;
        int count=0;
        int minCount=list.size();
        for(int i=0;i<list.size();i++) {

            if(list.get(i)==minValue) {
                minFlag=true;
                if(minFlag && maxFlag && count<minCount) {
                    minCount = count;
                }
                maxFlag=false;
                count=0;
            }
            if(list.get(i)==maxValue) {
                maxFlag=true;
                if(minFlag && maxFlag && count<minCount) {
                    minCount = count;

                }
                minFlag=false;
                count=0;
            }
            if(minFlag || maxFlag) {
                count++;
            }

        }
        return minCount+1;
    }
}
