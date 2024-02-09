public class BalancedBinarySearchTree<T extends Comparable<T>> {
    private BinaryTreeNode<T> root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(T newItem) {
        if (isEmpty()) root = new BinaryTreeNode<>(newItem);
        else root.add(newItem);
    }

    public int size() {
        return isEmpty() ? 0 : root.size();
    }

    public boolean isBalanced() {
        if (isEmpty()) return true;
        return root.isBalanced();
    }

    public int depth() {
        return isEmpty()? 0 : root.depth();
    }

    private static class BinaryTreeNode<T extends Comparable<T>> {
        private final T item;
        private BinaryTreeNode<T> left;
        private BinaryTreeNode<T> right;

        public BinaryTreeNode(T item) {
            this.item = item;
        }

        public int size() {
            return 1 +
                    (left == null ? 0 : left.size()) +
                    (right == null ? 0 : right.size());
        }

        public void add(T newItem) {
            if (item.compareTo(newItem) <= 0)
                addLeft(newItem);
            else
                addRight(newItem);
        }

        private void addRight(T newItem) {
            if (right == null)
                right = new BinaryTreeNode<>(newItem);
            else
                right.add(newItem);
        }

        private void addLeft(T newItem) {
            if (left == null)
                left = new BinaryTreeNode<>(newItem);
            else
                left.add(newItem);
        }

        public int depth() {
            return 1 + Math.max(left == null ? 0 : left.depth(),
                    right == null ? 0 : right.depth());
        }

        public boolean isBalanced() {
            return Math.abs((left == null ? 0 : left.depth()) -
                    (right == null ? 0 : right.depth())) <= 1;
        }
    }
}
