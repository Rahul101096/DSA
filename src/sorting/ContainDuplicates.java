package sorting;

public class ContainDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        boolean hasDuplicates = containsDuplicate(arr);
        System.out.println("Array contains duplicates: " + hasDuplicates);
    }
//    public static boolean containsDuplicate(int[] nums) {
//        int count=0;
//        boolean flag=false;
//        for(int i=0; i<nums.length-1; i++) {
//            for (int j=0; j<nums.length-1; j++) {
//                if(nums[i]==nums[j]) {
//                    count=count+1;
//                } else if(nums[i] != nums[j]){
//                    //count=0;
//                    flag=false;
//                }
//            }
//            if(count>1) {
//                flag = true;
//            }
//        }
//        return flag;
//
//    }
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true; // Found a duplicate
                }
            }
        }
        return false; // No duplicates found
    }
}
