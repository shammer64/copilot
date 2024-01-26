public class DoublyLinkedList<T> {
    private DoublyLinkedListNode<T> head;

    public boolean isEmpty() {
        return true;
    }

    public void add(T item) {
        this.head = new DoublyLinkedListNode<>(item);
    }

    public int size() {
        return 1;
    }

    private class DoublyLinkedListNode<T> {
        private final T item;

        public DoublyLinkedListNode(T item) {
            this.item = item;
        }
    }
}
