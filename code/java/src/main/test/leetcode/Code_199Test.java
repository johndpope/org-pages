package leetcode;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.framework.TestCase;

import java.util.List;

/**
 * Code_199 Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>07/30/2018</pre>
 */
public class Code_199Test extends TestCase {
    public Code_199Test(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Method: rightSideView(TreeNode root)
     * Input: [1,2,3,null,5,null,4]
     * Output: [1, 3, 4]
     * 1            <---
     * /   \
     * 2     3         <---
     * \     \
     * 5     4       <---
     */
    public void testRightSideView() throws Exception {
//TODO: Test goes here...
        TreeNode root = new TreeNode(1);
        TreeNode treeNode = new TreeNode(2);
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(4);
        root.left = treeNode;
        root.right = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.right = treeNode3;
        Code_199 code_199 = new Code_199();
        List<Integer> integers = code_199.rightSideView(root);
        System.out.println(integers.toString());


    }


    public static Test suite() {
        return new TestSuite(Code_199Test.class);
    }
} 
