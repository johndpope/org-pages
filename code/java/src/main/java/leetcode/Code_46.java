package leetcode;

import java.util.List;
import java.util.ArrayList;

public class Code_46 {
    /**
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtrack(list, nums, 0);
        return list;

    }

    public List<List<Integer>> backtrack(List<List<Integer>> list, int[] nums, int start) {

        if (start >= nums.length) {
            List<Integer> tempList = convertArrayToList(nums);
            list.add(tempList);
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            backtrack(list, nums, start + 1);
            swap(nums, start, i);
        }

        return list;

    }

    private List<Integer> convertArrayToList(int[] nums) {

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        return list;

    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

}
