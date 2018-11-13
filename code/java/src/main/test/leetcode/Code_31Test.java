package leetcode;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by manue1 on 2018/11/13.
 */
public class Code_31Test {
    @Test
    public void testNextPermutation () throws Exception{
        Code_31 code_31 = new Code_31();
        int [] s = {5,4,7,5,3,2};
        code_31.nextPermutation(s);
        System.out.println(Arrays.toString(s));


    }
}
