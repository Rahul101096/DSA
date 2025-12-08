package sorting;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
public class CountMajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2}; // Example input array
        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);
    }
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        // Find the candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate; // Directly return the candidate
    }

}
