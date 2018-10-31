package leetcode;

import org.junit.Test;

import java.util.*;


public class Code_199 {
//    public List<Integer> rightSideView(TreeNode root) {
//        /**
//         * dfs 栈实现
//         */
//        HashMap<Integer, Integer> rightSideViewMap = new HashMap<Integer, Integer>();
//        int max_depth = -1;
//
//        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
//        Stack<Integer> depthStack = new Stack<Integer>();
//
//        nodeStack.push(root);
//        depthStack.push(0);
//
//        while (!nodeStack.isEmpty()) {
//            TreeNode node = nodeStack.pop();
//            int depth = depthStack.pop();
//            if (node != null) {
//                max_depth = Math.max(max_depth, depth);
//                if (!rightSideViewMap.containsKey(depth)) {
//                    rightSideViewMap.put(depth, node.val);
//                }
//                nodeStack.push(node.left);
//                nodeStack.push(node.right);
//                depthStack.push(depth + 1);
//                depthStack.push(depth + 1);
//            }
//        }
//
//        ArrayList<Integer> rightSideViewList = new ArrayList<Integer>();
//        for (int i = 0; i <= max_depth; i++) {
//            rightSideViewList.add(rightSideViewMap.get(i));
//        }
//        return rightSideViewList;
//
//    }

    /**
     * bfs 队列实现
     * @param root
     * @return
     */
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer, Integer> rightSideViewMap = new HashMap<Integer, Integer>();
        LinkedList<TreeNode> nodeQueue = new LinkedList<TreeNode>();
        LinkedList<Integer> depthQueue = new LinkedList<Integer>();
        nodeQueue.offer(root);
        depthQueue.offer(0);
        int max_depth = -1;

        //Queue使用时要尽量避免Collection的add()和remove()方法，而是要使用offer()来加入元素，使用poll()来获取并移出元素。
        // 它们的优点是通过返回值可以判断成功与否，add()和remove()方法在失败的时候会抛出异常。
        // 如果要使用前端而不移出该元素，使用element()或者peek()方法。
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            Integer depth = depthQueue.poll();
            if (node != null) {
                max_depth = Math.max(max_depth, depth);
                if (!rightSideViewMap.containsKey(depth)) {
                    rightSideViewMap.put(depth, node.val);
                }
                // 队列先进先出，需要线把right节点放入
                nodeQueue.offer(node.right);
                depthQueue.offer(depth + 1);
                nodeQueue.offer(node.left);
                depthQueue.offer(depth + 1);
            }
        }

        ArrayList<Integer> rightSideViewList = new ArrayList<Integer>();
        for (int i = 0; i <= max_depth; i++) {
            rightSideViewList.add(rightSideViewMap.get(i));
        }
        return rightSideViewList;
    }

//    /**
//     * 递归实现  保证每层最右节点第一个被处理
//     *
//     * @param root
//     * @return
//     */
//    public List<Integer> rightSideView(TreeNode root) {
//        ArrayList<Integer> rightSideViewList = new ArrayList<Integer>();
//        bfs(root, rightSideViewList, 0);
//        return rightSideViewList;
//    }
//
//    private void bfs(TreeNode root, List<Integer> rightSideViewList, int depth) {
//        if (root == null) return;
//        if (depth == rightSideViewList.size()) {
//            rightSideViewList.add(root.val);
//        }
//        bfs(root.right, rightSideViewList, depth + 1);
//        bfs(root.left, rightSideViewList, depth + 1);
//    }
}
