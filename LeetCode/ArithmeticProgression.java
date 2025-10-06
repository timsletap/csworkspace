package LeetCode;
import java.util.Arrays;

public class ArithmeticProgression {
    public static boolean canMakeArithmeticProgression(int[] arr) {
       
        Arrays.sort(arr);
        int diff = 0;
        for(int i = 1; i < arr.length; i++){
            if(i == 1){
                diff = arr[i] - arr[i-1];
            }
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }
        return true; 
    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }
}
