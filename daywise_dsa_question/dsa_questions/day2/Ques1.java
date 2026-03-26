
package dsa_questions;
public class Ques1 {
    public static void sortColors(int[] nums) {
        int c0 = 0, c1 = 0, c2 = 0;
        for (int n : nums) {
            if (n == 0) c0++;
            else if (n == 1) c1++;
            else c2++;
        }
        int i = 0;
        for (int j = 0; j < c0; j++) nums[i++] = 0;
        for (int j = 0; j < c1; j++) nums[i++] = 1;
        for (int j = 0; j < c2; j++) nums[i++] = 2;
    }

    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColors(nums);
        System.out.println(nums);
    }
}