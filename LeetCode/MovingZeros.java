package LeetCode;
public class MovingZeros {
 public void moveZeroes(int[] nums) {
        int count = 0; // Count of non-zero elements
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }
        for (int i = count; i < nums.length; i++) {
            nums[i] = 0;
        }   
    }
     
   public static void main(String[] args) {
        MovingZeros mz = new MovingZeros();
        int[] arr = {0,1,0,3,12};
        mz.moveZeroes(arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
