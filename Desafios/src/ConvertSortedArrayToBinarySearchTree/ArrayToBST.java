package ConvertSortedArrayToBinarySearchTree;

public class ArrayToBST {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 3, 4, 5 };
        TreeNode root = sortedArrayToBST(nums);
        print(root);
        System.out.println();
    }

    static void print(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            print(root.left);
            print(root.right);
        }
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

    static TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums, 0, nums.length);
    }

    static TreeNode insert(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        } else {
            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = insert(nums, start, mid);
            root.right = insert(nums, mid + 1, end);
            return root;
        }
    }

}
