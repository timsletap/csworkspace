package LeetCode;

public class ProductArraySign {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(int x : nums){
          if(x == 0){
            return 0;
          } else if(x < 0){
            sign = -sign;
          }
    }
    return sign;
    }
    public static void main(String[] args) {
        ProductArraySign pas = new ProductArraySign();
        int[] nums = {-1,-2,-3,-4,3,2,1};
        int result = pas.arraySign(nums);
        System.out.println(result); // Output: 1
    }
}
