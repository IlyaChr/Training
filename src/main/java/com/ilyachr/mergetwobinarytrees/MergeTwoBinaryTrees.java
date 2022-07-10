package com.ilyachr.mergetwobinarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 617. Merge Two Binary Trees
 */
public class MergeTwoBinaryTrees {

    public static class TreeNode {
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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            TreeNode treeNode = (TreeNode) o;
            return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
        }

        @Override
        public int hashCode() {
            return Objects.hash(val, left, right);
        }
    }


    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        TreeNode rootResultNode = new TreeNode((root1 != null ? root1.val : 0) + (root2 != null ? root2.val : 0));
        mergeTree(root1, root2, rootResultNode);
        return rootResultNode;
    }


    private void mergeTree(TreeNode root1, TreeNode root2, TreeNode resultNode) {
        TreeNode rightNode1 = root1 != null ? root1.right : null;
        TreeNode rightNode2 = root2 != null ? root2.right : null;

        if (rightNode1 != null || rightNode2 != null) {
            resultNode.right = new TreeNode((rightNode1 != null ? rightNode1.val : 0) + (rightNode2 != null ? rightNode2.val : 0));
            mergeTree(rightNode1, rightNode2, resultNode.right);
        }

        TreeNode leftNode1 = root1 != null ? root1.left : null;
        TreeNode leftNode2 = root2 != null ? root2.left : null;

        if (leftNode1 != null || leftNode2 != null) {
            resultNode.left = new TreeNode((leftNode1 != null ? leftNode1.val : 0) + (leftNode2 != null ? leftNode2.val : 0));
            mergeTree(leftNode1, leftNode2, resultNode.left);
        }
    }
}
