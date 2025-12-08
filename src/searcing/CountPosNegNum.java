package searcing;

public class CountPosNegNum {
    public static void main(String[] args) {
        /*int[] numbers = {5,20,66,1314}; // Example array of integers
        int positiveCount = 0; // Counter for positive numbers
        int negativeCount = 0; // Counter for negative numbers

        // Loop through the array to count positive and negative numbers
        for (int number : numbers) {
            if (number > 0) {
                positiveCount++; // Increment positive count
            } else if (number < 0) {
                negativeCount++; // Increment negative count
            }
        }*/
        int posCount=0;
        int negCount=0;
        int[] nums = {5,20,66,1314};
        /*for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                posCount++;
            } else if(nums[i]<0) {
                negCount++;
            }
        }*/
        for (int num : nums) {
            if (num > 0) {
                posCount++;
            } else if (num < 0) {
                negCount++;
            }
        }
        if(posCount==negCount || posCount>negCount) {
            System.out.println("Positive numbers count: " + posCount);
        } else {
            System.out.println("Negative numbers count: " + negCount);
        }

        // Print the results
        /*System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);*/
    }
}
