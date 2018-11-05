package leetcode;

public class Code_31 {
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;
        boolean change = false;
        //判断是否是最大序列
        while (index > 0 && !change) {
            if (nums[index] > nums[index - 1]) {
                change = true;
            }
            index--;
        }
        if (change) {
            int bigger_index = findBigger(nums, index);
            swap(nums, index - 1, bigger_index);
            reverseArray(nums, index, nums.length - 1);
        }
        reverseArray(nums, 0, nums.length - 1);
    }

    private void reverseArray(int[] nums, int start, int end) {
        if (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] nums, int start, int end) {
        int t = nums[start];
        nums[start] = nums[end];
        nums[end] = t;
    }

    private int findBigger(int[] nums, int index) {
        int t = nums[index - 1];
        while (index < nums.length) {
            if (t > nums[index]) {

                return index - 1;
            }
            index++;
        }
        return index;
    }
}
