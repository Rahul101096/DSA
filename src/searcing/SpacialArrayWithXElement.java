package searcing;

public class SpacialArrayWithXElement {
    public static void main(String[] args) {
        int[] arr={0,4,3,0,4};
        System.out.println(new SpacialArrayWithXElement().specialArray(arr));


    }

    public int specialArray(int[] nums) {

        int count=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]>0) {
                count=count+1;
            } else if(nums[i]==0){
                count=count+0;
            } else {
                return -1;
            }
        }
        return count;
    }

}
