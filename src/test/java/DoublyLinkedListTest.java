import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    public void testListCreation() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddElement() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.add(1);
        assertEquals(1, list.size());
    }

//    @Test
//    public void testAddTwoElements() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        assertEquals(2, list.size());
//    }
//
//    @Test
//    public void testGetFirstElement() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        assertEquals(1, list.get(0));
//    }
//
//    @Test
//    public void testGetSecondElement() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        assertEquals(2, list.get(1));
//    }
//
//    @Test
//    public void testRemoveFirstElement() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        list.remove(0);
//        assertTrue(list.isEmpty());
//    }
//
//    @Test
//    public void testRemoveMiddleElement() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(1);
//        assertEquals(2, list.size());
//    }
//
//    @Test
//    public void testRemoveLastElement() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.remove(2);
//        assertEquals(2, list.size());
//    }
//
//    @Test
//    public void testGetFromEmptyList() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        assertThrows(IndexOutOfBoundsException.class, () -> {
//            list.get(0);
//        });
//    }
//
//    @Test
//    public void testRemoveFromEmptyList() {
//        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
//        assertThrows(IndexOutOfBoundsException.class, () -> {
//            list.remove(0);
//        });
//    }
}