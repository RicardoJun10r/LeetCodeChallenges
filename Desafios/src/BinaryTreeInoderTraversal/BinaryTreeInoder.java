package BinaryTreeInoderTraversal;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInoder {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = inorderTraversal(root);
        System.out.println(result); // Output: [1, 3, 2]
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

    static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return List.of();
        } else {
            List<Integer> list = new ArrayList<>();
            inorderTraversal(root, list);
            return list;
        }
    }

    static void inorderTraversal(TreeNode node, List<Integer> list) {
        if (node != null) {
            inorderTraversal(node.left, list);
            list.add(node.val);
            inorderTraversal(node.right, list);
        }
    }
}
