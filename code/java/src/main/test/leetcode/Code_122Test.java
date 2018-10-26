package leetcode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

/**
 * Code_122 Tester.
 *
 * @author <Authors manue1>
 * @version 1.0
 * @since <pre>Jul 25, 2018</pre>
 */
public class Code_122Test {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: maxProfit(int[] prices)
     */
    @Test
    public void testMaxProfit() throws Exception {
//TODO: Test goes here...
        Code_122 code_122 = new Code_122();
        int[] s = {7, 1, 5, 3, 6, 4};
        int profit = code_122.maxProfit(s);
        System.out.println(profit);
    }


} 
