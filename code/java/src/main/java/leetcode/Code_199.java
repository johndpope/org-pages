package leetcode;

import java.util.*;


public class Code_199 {
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer, Integer> rightSideViewMap = new HashMap<Integer, Integer>();
        int max_depth = -1;

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> depthStack = new Stack<Integer>();

        nodeStack.push(root);
        depthStack.push(0);

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int depth = depthStack.pop();
            if (node != null) {
                max_depth = Math.max(max_depth, depth);
                if (!rightSideViewMap.containsKey(depth)) {
                    rightSideViewMap.put(depth, node.val);
                }
                nodeStack.push(node.left);
                nodeStack.push(node.right);
                depthStack.push(depth + 1);
                depthStack.push(depth + 1);
            }
        }

        ArrayList<Integer> rightSideViewList = new ArrayList<Integer>();
        for (int i = 0; i <= max_depth; i++) {
            rightSideViewList.add(rightSideViewMap.get(i));
        }
        return rightSideViewList;

    }
}
