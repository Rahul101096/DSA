package sorting;//package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-1,-4,-2,8,6};
        int[] getSortedSquare = sortedSquares(nums);
        System.out.println("Array contains SqureRoot of elem: " + Arrays.toString(getSortedSquare));
    }
        public static int[] sortedSquares(int[] nums) {
            int[] res=new int[nums.length];
            int left=0;
            int right=nums.length-1;
            while(left<right) {
                for(int i=nums.length-1; i>=0; i--) {
                    if(Math.abs(nums[left])>Math.abs(nums[right])) {
                        res[i]=nums[left]*nums[left];
                        left++;
                    } else {
                        res[i] = nums[right] * nums[right];
                        right--;
                    }
                }

            }
            return res;
        }
    }

/*
import java.util.Arrays;


public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-1, -4, -2, 8, 6};
        int[] getSortedSquare = sortedSquares(nums);
        System.out.println("Array contains squares of elems: " + Arrays.toString(getSortedSquare));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 0, right = n - 1;
        int i = n - 1; // write index, fill from end

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i--] = nums[left] * nums[left];
                left++;
            } else {
                res[i--] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }
}
*/

