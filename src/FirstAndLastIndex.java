import java.util.Arrays;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        int[] arr={2,6,8,7,7,4,7,9,3};
        int target=7;

         int first=findFirstIndex(arr, target);
         int last=findLastIndex(arr, target);
        int[] ans={first, last};
        //System.out.println(Arrays.toString(ans));
        //System.out.println(first);
        System.out.println(Arrays.toString(ans));
    }

    public static int findFirstIndex(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int first=-1;
        while(left<=right) {
            if(arr[left]==target && first==-1) {
                first=left;
                break;
            }
            left++;
        }
        return first;
    }

    public static int findLastIndex(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        int last=-1;
        while(left<=right) {
            if(arr[right]==target  && last==-1) {
                last=right;
                break;
            }
            right--;
        }
        return last;
    }


}
