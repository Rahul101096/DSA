package searcing;


public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={2,5,8,11,14,17,18};
        int target=15;
        int ans=ceiling(arr, target);
        System.out.println(ans);
        System.out.println(arr[ans]);
    }

    static int ceiling(int arr[], int target) {
        //if the target element is greater than than the greatest number in the array
         if(target>arr[arr.length-1]) {
             return -1;
         }
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(target> arr[mid]) {
                start=mid+1;

            } else if(target < arr[mid]) {
                end=mid-1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
