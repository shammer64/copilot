import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeTest {

    @Test
    public void testIsEmpty() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        assertTrue(tree.isEmpty());
    }

    @Test
    public void testAddSingleElement() {
        BalancedBinarySearchTree<Integer> tree = new BalancedBinarySearchTree<>();
        tree.add(5);
        assertFalse(tree.isEmpty());
    }

}
