import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BalancedBinaryTreeTest {

    @Test
    public void newTreeIsEmpty() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        assertTrue(tree.isEmpty());
    }

    @Test
    public void singleElementTreeIsNotEmpty() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        assertFalse(tree.isEmpty());
    }

    @Test
    public void emptyTreeHasSize0() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        assertEquals(0, tree.size());
    }

    @Test
    public void singleElementTreeHasSize1() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        assertEquals(1, tree.size());
    }

    @Test
    public void twoElementTreeHasSize2() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(1);
        tree.add(5);
        assertEquals(2, tree.size());
    }

    @Test
    public void threeElementTreeHasSize3() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        tree.add(1);
        tree.add(8);
        assertEquals(3, tree.size());
    }

    @Test
    public void fourElementTreeHasSize4_1() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(1);
        assertEquals(4, tree.size());
    }

    @Test
    public void fourElementTreeHasSize_2() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(9);
        assertEquals(4, tree.size());
    }

    @Test
    public void emptyTreeHasDepth0() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        assertEquals(0, tree.depth());
    }

    @Test
    public void singleElementTreeHasDepth1() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(7);
        assertEquals(1, tree.depth());
    }

    @Test
    public void twoElementTreeHasDepth2_1() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        tree.add(7);
        assertEquals(2, tree.depth());
    }

    @Test
    public void twoElementTreeHasDepth2_2() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(7);
        tree.add(5);
        assertEquals(2, tree.depth());
    }

    @Test
    public void emptyTreeIsBalanced() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        assertTrue(tree.isBalanced());
    }

    @Test
    public void singleElementTreeIsBalanced() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        assertTrue(tree.isBalanced());
    }

//    @Test
//    public void threeElementTreeShouldBeBalanced_1() {
//        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
//        tree.add(1);
//        tree.add(2);
//        tree.add(3);
//        assertTrue(tree.isBalanced());
//    }

//    @Test
//    public void threeElementTreeIsUnbalanced_2() {
//        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
//        tree.add(3);
//        tree.add(2);
//        tree.add(1);
//        assertFalse(tree.isBalanced());
//    }

}
