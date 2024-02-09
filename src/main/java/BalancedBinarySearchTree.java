public class BalancedBinarySearchTree<T> {
    private BinaryTreeNode<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(T newItem) {
        root = new BinaryTreeNode<>(newItem);
    }

    private static class BinaryTreeNode<T> {
        private final T item;

        public BinaryTreeNode(T item) {
            this.item = item;
        }
    }
}
