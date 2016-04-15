package dcll.vche;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21000763 on 17/02/2016.
 */
public class MyStack implements SimpleStack {

    /**
     * Stockage de la stack.
     */
    private final Stack<Item> stack = new Stack<Item>();

    @Override
    public final boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public final int getSize() {
        return stack.size();
    }

    @Override
    public final void push(final Item item) {
        stack.push(item);
    }

    @Override
    public final Item peek() throws EmptyStackException {
        return stack.peek();
    }

    @Override
    public final Item pop() throws EmptyStackException {
        return stack.pop();
    }
}
