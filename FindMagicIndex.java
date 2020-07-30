//Two implementations, one with binary search and runtime of O(lgn) and another with linear time O(n) complexity. Both recursive.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] testNums = {1,2,2,3,4};
        int[] testNums2 = {};
        int[] testNums3 = {2,3,3,4,5,6,7,8,9,10,10};
        System.out.println(findMI(testNums));
        System.out.println(findMI(testNums2));
        System.out.println(findMI(testNums3));
        System.out.println(findMIBin(testNums));
        System.out.println(findMIBin(testNums2));
        System.out.println(findMIBin(testNums3));
    }



    public static int findMIBin(int[] nums){
        if(nums==null) return -1;
        return findMIBinHelper(nums, 0, nums.length-1);
    }

    public static int findMIBinHelper(int[] nums, int low, int high){
        if(low > high) return -1;
        //Find midpoint first
        int mid = (low+high)/2;
        //Found it? Return it!
        if(nums[mid] == mid){
            return mid;
        }
        //Search higher half of array.
        if(nums[mid] > mid)
            return findMIBinHelper(nums, mid + 1, high);
        //Search lower half of array
        else{
            return findMIBinHelper(nums, low, mid-1);
        }
    }

    public static int findMI(int[] nums){
        if(nums==null) return -1;
        return findMIHelper(nums, 0);
    }

    public static int findMIHelper(int[] nums, int currentIndex){
        if(currentIndex == nums.length) return -1;
        if(currentIndex == nums[currentIndex]) return currentIndex;
        currentIndex++;
        return findMIHelper(nums, currentIndex);
    }
}
