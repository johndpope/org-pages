package leetcode;

import java.util.List;
import java.util.ArrayList;

public class Code_46 {
    /**
     * @param nums 给一个不重复整数集，输出所有可能组合
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        return null;
    }

    private void permutation(int[] nums, int index, int length) {
        while (index < length - 1) {

        }


    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
