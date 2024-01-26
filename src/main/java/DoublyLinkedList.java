public class DoublyLinkedList<T> {
    private DoublyLinkedListNode<T> head;
    private int size = 0;

    public boolean isEmpty() {
        return true;
    }

    public void add(T item) {
        if (this.head == null)
            this.head = new DoublyLinkedListNode<>(item);
        else {
            this.head.setNext(new DoublyLinkedListNode<>(item, head));
        }
        this.size += 1;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (head == null)
            throw new IndexOutOfBoundsException("List is empty");
        if (index >= size) throw
                new IndexOutOfBoundsException(
                        String.format("List contains only %d element(s)", size )
                );

        DoublyLinkedListNode<T> curr = head;
        int pointer = 0;
        while (pointer < index) {
            curr = curr.getNext();
            pointer++;
        }
        return curr.getItem();
    }

    private static class DoublyLinkedListNode<T> {
        private final T item;
        private DoublyLinkedListNode<T> next = null;
        private DoublyLinkedListNode<T> prev = null;

        public DoublyLinkedListNode(T item) {
            super();
            this.item = item;
        }

        public DoublyLinkedListNode(T item, DoublyLinkedListNode<T> prev) {
            super();
            this.item = item;
            this.prev = prev;
        }

        public void setNext(DoublyLinkedListNode<T> next) {
            this.next = next;
        }

        public T getItem() {
            return item;
        }

        public DoublyLinkedListNode<T> getNext() {
            return next;
        }
    }
}
