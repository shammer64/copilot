public class SinglyLinkedList<T> {
    private SinglyLinkedListNode head;
    private int size = 0;

    public boolean isEmpty() {
        return head == null;
    }

    public void add(T item) {
        if (head == null) {
            head = new SinglyLinkedListNode(item);
        } else {
            SinglyLinkedListNode node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            node.setNext(new SinglyLinkedListNode(item));
        }
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public T get(int index) {
        if (head == null || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            SinglyLinkedListNode node = head;
            int i = 0;
            while (i < index) {
                node = node.getNext();
                i++;
            }
            return node.getItem();
        }
    }

    public void remove(int index) {
        if (head == null || index >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            SinglyLinkedListNode prev = null;
            SinglyLinkedListNode node = head;
            int i = 0;
            while (i < index) {
                prev = node;
                node = node.getNext();
                i++;
            }
            if (prev == null)
                head = node.getNext();
            else
                prev.setNext(node.getNext());
            node.setNext(null);
            this.size--;
        }
    }

    @Override
    public String toString() {
        if (head != null) {
            StringBuilder sb = new StringBuilder("[");
            SinglyLinkedListNode node = head;
            do {
                sb.append(node.getItem());
                node = node.getNext();
                if (node != null) {
                    sb.append(",");
                }
            } while (node != null);
            return  sb.append("]").toString();
        } else
            return "[]";
    }

    private class SinglyLinkedListNode {
        private final T item;
        private SinglyLinkedListNode next = null;

        public SinglyLinkedListNode(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }

        public void setNext(SinglyLinkedListNode next) {
            this.next = next;
        }

        public SinglyLinkedListNode getNext() {
            return this.next;
        }
    }
}
