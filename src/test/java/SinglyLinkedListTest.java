import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    public void testListCreation() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
    }

    @Test
    public void testPrintEmptyList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals("[]", list.toString());
    }

    @Test
    public void testListSizeZero() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        assertEquals(1, list.size());
    }

    @Test
    public void testPrintOneItemList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        assertEquals("[1]", list.toString());
    }

    @Test
    public void testAddTwoElements() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testPrintTwoItemList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(3);
        assertEquals("[1,3]", list.toString());
    }

    @Test
    public void testListSize() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertEquals(2, list.size());
    }

    @Test
    public void testGetFromEmptyList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }

    @Test
    public void testGetWithBadIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(3);
        });
    }

    @Test
    public void testGetFirstElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        assertEquals(1, list.get(0));
    }

    @Test
    public void testGetSecondElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(3);
        assertEquals(3, list.get(1));
    }

    @Test
    public void testIsEmpty() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
    }

    @Test
    public void testRemoveFromEmptyList() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(0);
        });
    }

    @Test
    public void testRemoveWithBadIndex() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(3);
        });
    }

    @Test
    public void testRemoveFirstElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.remove(0);
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    public void testRemoveMiddleElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(1);
        assertEquals(2, list.size());
        assertEquals("[1,3]", list.toString());
    }

    @Test
    public void testRemoveLastElement() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        assertEquals(2, list.size());
        assertEquals("[1,2]", list.toString());
    }
}