package dsa_questions;

public class Ques5 {

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == 0) {
            return binarySearch(nums, 0, nums.length - 1, target);
        }

        if (target >= nums[0]) {
            return binarySearch(nums, 0, pivot - 1, target);
        } else {
            return binarySearch(nums, pivot, nums.length - 1, target);
        }
    }
    public static int findPivot(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int mid = (l + r) / 2;

            if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static int binarySearch(int[] nums, int l, int r, int target) {
        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        int index = search(nums, target);
        System.out.println(index);
    }
}
