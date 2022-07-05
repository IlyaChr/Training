package com.ilyachr.mergetwobinarytrees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class MergeTwoBinaryTreesTest {

    @Test
    void mergeTrees() {

        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();

        MergeTwoBinaryTrees.TreeNode resultTreeNode1 = new MergeTwoBinaryTrees.TreeNode(5);
        MergeTwoBinaryTrees.TreeNode resultTreeNode2 = new MergeTwoBinaryTrees.TreeNode(4);
        MergeTwoBinaryTrees.TreeNode resultTreeNode3 = new MergeTwoBinaryTrees.TreeNode(4);
        MergeTwoBinaryTrees.TreeNode resultTreeNode4 = new MergeTwoBinaryTrees.TreeNode(3);
        MergeTwoBinaryTrees.TreeNode resultTreeNode5 = new MergeTwoBinaryTrees.TreeNode(5);
        MergeTwoBinaryTrees.TreeNode resultTreeNode6 = new MergeTwoBinaryTrees.TreeNode(7);

        resultTreeNode2.left = resultTreeNode1;
        resultTreeNode2.right = resultTreeNode3;

        resultTreeNode4.left = resultTreeNode2;
        resultTreeNode4.right = resultTreeNode5;

        resultTreeNode5.right = resultTreeNode6;

        MergeTwoBinaryTrees.TreeNode oneTreeNode1 = new MergeTwoBinaryTrees.TreeNode(5);
        MergeTwoBinaryTrees.TreeNode oneTreeNode2 = new MergeTwoBinaryTrees.TreeNode(3);
        MergeTwoBinaryTrees.TreeNode oneTreeNode3 = new MergeTwoBinaryTrees.TreeNode(1);
        MergeTwoBinaryTrees.TreeNode oneTreeNode4 = new MergeTwoBinaryTrees.TreeNode(2);

        oneTreeNode2.left = oneTreeNode1;
        oneTreeNode3.left = oneTreeNode2;
        oneTreeNode3.right = oneTreeNode4;


        MergeTwoBinaryTrees.TreeNode twoTreeNode1 = new MergeTwoBinaryTrees.TreeNode(4);
        MergeTwoBinaryTrees.TreeNode twoTreeNode2 = new MergeTwoBinaryTrees.TreeNode(1);
        MergeTwoBinaryTrees.TreeNode twoTreeNode3 = new MergeTwoBinaryTrees.TreeNode(2);
        MergeTwoBinaryTrees.TreeNode twoTreeNode4 = new MergeTwoBinaryTrees.TreeNode(3);
        MergeTwoBinaryTrees.TreeNode twoTreeNode5 = new MergeTwoBinaryTrees.TreeNode(7);

        twoTreeNode2.right = twoTreeNode1;
        twoTreeNode3.left = twoTreeNode2;
        twoTreeNode3.right = twoTreeNode4;
        twoTreeNode4.right = twoTreeNode5;

        Assertions.assertEquals(resultTreeNode4, mergeTwoBinaryTrees.mergeTrees(oneTreeNode3, twoTreeNode3));
    }

    @Test
    @Order(value = 2)
    void mergeTrees2() {

        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        MergeTwoBinaryTrees.TreeNode oneTreeNode1 = new MergeTwoBinaryTrees.TreeNode(1);
        MergeTwoBinaryTrees.TreeNode twoTreeNode1 = new MergeTwoBinaryTrees.TreeNode(1);
        MergeTwoBinaryTrees.TreeNode twoTreeNode2 = new MergeTwoBinaryTrees.TreeNode(2);
        twoTreeNode1.left = twoTreeNode2;

        MergeTwoBinaryTrees.TreeNode resultTreeNode1 = new MergeTwoBinaryTrees.TreeNode(2);
        MergeTwoBinaryTrees.TreeNode resultTreeNode2 = new MergeTwoBinaryTrees.TreeNode(2);

        resultTreeNode1.left = resultTreeNode2;

        Assertions.assertEquals(resultTreeNode1, mergeTwoBinaryTrees.mergeTrees(oneTreeNode1, twoTreeNode1));
    }


    @Test
    @Order(value = 3)
    void checkNull() {
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        Assertions.assertNull(mergeTwoBinaryTrees.mergeTrees(null, null));
    }


}