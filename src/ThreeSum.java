import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ThreeSum {

    public static void main(String args[]) {
        int[] nums={1,1,2,-1,-2,3,4};
        List<List<Integer>> res=threeSum(nums);
        System.out.println("Three Sum of the arr is : "+res);
    }

        public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            int n = nums.length;
            Arrays.sort(nums);

            for (int i = 0; i < n; i++) {
                // skip same first element to avoid duplicate triplets
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int target = -nums[i];       // 2Sum target

                int left = i + 1;
                int right = n - 1;

                // classic sorted 2Sum using two pointers
                while (left < right) {
                    int sum = nums[left] + nums[right];

                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                        left++;
                        right--;

                        // skip duplicates for second and third elements
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < target) {
                        left++;    // need a larger sum
                    } else {
                        right--;   // need a smaller sum
                    }
                }
            }
            return res;
        }
    }

