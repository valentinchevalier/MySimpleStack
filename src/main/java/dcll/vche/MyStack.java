package dcll.vche;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21000763 on 17/02/2016.
 */
public class MyStack implements SimpleStack {

    /**
     * Stockage de la stack
     */
    private Stack<Item> stack = new Stack<Item>();

    /*
    * Commentaire de l'éxigence de test
    * */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return stack.pop();
    }
}
