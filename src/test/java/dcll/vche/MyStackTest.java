package dcll.vche;

import junit.framework.TestCase;

public class MyStackTest extends TestCase {

    public void testIsEmptyTrue() throws Exception {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }
    public void testIsEmptyFalse() throws Exception {
        MyStack stack = new MyStack();
        stack.push(new Item());
        assertFalse(stack.isEmpty());
    }

    public void testGetSizeZero() throws Exception {
        MyStack stack = new MyStack();
        assertEquals(0, stack.getSize());
    }
    public void testGetSize1() throws Exception {
        MyStack stack = new MyStack();
        stack.push(new Item());
        assertEquals(1, stack.getSize());
    }

    public void testPush() throws Exception {
        MyStack stack = new MyStack();
        Item item = new Item();
        stack.push(item);
        assertEquals(item, stack.peek());
    }

    public void testPeek() throws Exception {
        MyStack stack = new MyStack();
        Item item = new Item();
        stack.push(item);
        stack.peek();
        assertEquals(item, stack.peek());
    }

    public void testPop() throws Exception {
        MyStack stack = new MyStack();
        Item item = new Item();
        stack.push(item);
        assertEquals(item, stack.pop());
    }
    public void testPopRemove() throws Exception {
        MyStack stack = new MyStack();
        Item item = new Item();
        stack.push(item);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}