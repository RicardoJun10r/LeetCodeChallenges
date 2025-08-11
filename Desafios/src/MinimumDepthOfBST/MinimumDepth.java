package MinimumDepthOfBST;

public class MinimumDepth {
    public static void main(String[] args) {
        TreeNode test = new TreeNode(2,
                null,
                new TreeNode(3,
                        null,
                        new TreeNode(4,
                                null,
                                new TreeNode(5,
                                        null,
                                        new TreeNode(6)))));

        System.out.println(minDepth(test));
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

    static int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left = height(root.left);
            int right = height(root.right);
            if (left == 0) {
                return right + 1;
            } else if (right == 0) {
                return left + 1;
            } else {
                return Math.min(left, right) + 1;
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
