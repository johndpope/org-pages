package leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Code_46Test {
    @Test
    public void TestPermute() throws Exception{
        Code_46 code_46 = new Code_46();
        int[] s = {1,2,3,4};
        List<List<Integer>> permute = code_46.permute(s);
        System.out.println(Arrays.toString(permute.toArray()));
    }
}
