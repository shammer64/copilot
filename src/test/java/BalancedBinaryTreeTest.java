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
}
