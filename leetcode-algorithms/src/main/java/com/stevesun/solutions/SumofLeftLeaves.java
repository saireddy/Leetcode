package com.stevesun.solutions;

import com.stevesun.common.classes.TreeNode;

public class SumofLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int result = 0;
        if(root == null) return result;
        return dfs(root, result, false);
    }
    
    private int dfs(TreeNode root, int result, boolean left) {
        if(root.left == null && root.right == null && left) {
            result += root.val;
            return result;
        }
        int leftResult = 0;
        if(root.left != null){
            left = true;
            leftResult = dfs(root.left, result, left);
        }
        int rightResult = 0;
        if(root.right != null){
            left = false;
            rightResult = dfs(root.right, result, left);
        }
        return leftResult + rightResult;
    }
    
    private class Solution_more_concise{

        public int sumOfLeftLeaves(TreeNode root) {
            int sum = 0;
            if(root == null) return sum;
            if(root.left != null){
                if(root.left.left == null && root.left.right == null) sum += root.left.val;
                else sum += sumOfLeftLeaves(root.left);
            }
            if(root.right != null){
                sum += sumOfLeftLeaves(root.right);
            }
            return sum;
        }

    }
}
