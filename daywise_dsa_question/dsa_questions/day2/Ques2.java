package dsa_questions;

public class Ques2 {
    public static int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
           sum += nums[i];
           if(sum<0){
               sum = 0;
           }
           max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
