package dcll.vche;

import java.util.EmptyStackException;

/**
 * Created by 21000763 on 17/02/2016.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty.
     * @return true if the stack is empty
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return size
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @param item item to push
     */
    void push(Item item);
    /**
     * Looks at the   object at the top of this stack
     * without removing it from the stack.
     * @throws EmptyStackException if this stack is empty.
     * @return the item at the top of the stack
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack
     * and returns that object as the value of this function.
     * @return the item at the top of the stack
     * @throws EmptyStackException  if this stack is empty.
     */
    Item pop() throws EmptyStackException;
}
