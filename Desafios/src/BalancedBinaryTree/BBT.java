package BalancedBinaryTree;

public class BBT {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                null),
                        null),
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4))));

        System.out.println(isBalanced(test));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            int left_side = height(root.left);
            int right_side = height(root.right);
            if (Math.abs(left_side - right_side) > 1) {
                return false;
            } else {
                return isBalanced(root.left) && isBalanced(root.right);
            }
        }
    }

    static int height(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            int left = height(node.left);
            int right = height(node.right);
            return Math.max(left, right) + 1;
        }
    }

}
