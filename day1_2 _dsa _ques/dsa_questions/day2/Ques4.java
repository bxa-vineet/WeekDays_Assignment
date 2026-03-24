package dsa_questions;
public class Ques4 {

    public static int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int lMax = 0, rMax = 0, ans = 0;

        while (l < r) {
            lMax = Math.max(lMax,height[l]);
            rMax = Math.max(rMax,height[r]);

            if (lMax<rMax) {
                ans+=(lMax-height[l]);
                l++;
            } else {
                ans+=(rMax-height[r]);
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = trap(height);

        System.out.println(result);
    }
}
