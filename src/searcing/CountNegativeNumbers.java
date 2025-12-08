package searcing;

public class CountNegativeNumbers {
    public static void main(String[] args) {
        int[][] arr = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int count = 0;
        /*for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<=arr[i].length-1; j++) {
                if(arr[i][j]<0) {
                    count=count+1;
                }
            }
        }*/

        for (int[] row : arr) {
            for (int num : row) {
                if (num < 0) {
                    count++;
                    //System.out.println(count);
                }
            }
        }
        System.out.println("The number of negative numbers in the array is: " + count);
    }
}

