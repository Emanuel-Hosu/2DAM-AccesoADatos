package ArrayToStack;

import java.util.ArrayList;

/**
 * A generic stack implementation using an ArrayList.
 * 
 * <p>This stack follows the LIFO (Last In, First Out) principle, where elements are added
 * and removed from the top of the stack.</p>
 * 
 * @param <T> the type of elements in this stack
 * @author Emi
 */
public class Stack<T> {
    private ArrayList<T> stack;

    /**
     * Constructs an empty stack.
     */
    public Stack() {
        stack = new ArrayList<>();
    }

    /**
     * Pushes an element onto the top of the stack.
     * 
     * @param elem the element to be added to the stack
     */
    public void push(T elem) {
        stack.add(elem);
    }

    /**
     * Removes and returns the element at the top of the stack.
     * 
     * @return the element at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T pop() {
        if (!isEmpty()) {
            return stack.remove(stack.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    /**
     * Returns the element at the top of the stack without removing it.
     * 
     * @return the element at the top of the stack
     * @throws RuntimeException if the stack is empty
     */
    public T peek() {
        if (!isEmpty()) {
            return stack.get(stack.size() - 1);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }

    /**
     * Checks if the stack is empty.
     * 
     * @return {@code true} if the stack is empty; {@code false} otherwise
     */
    public boolean isEmpty() {
        return stack.size() == 0;
    }

    /**
     * Removes a specific element from the stack, if it is present.
     * 
     * <p>If the stack is empty, a {@code RuntimeException} is thrown.</p>
     * 
     * @param elem the element to be removed from the stack
     * @throws RuntimeException if the stack is empty
     */
    public void remove(T elem) {
        if (!isEmpty()) {
            stack.remove(elem);
        } else {
            throw new RuntimeException("Stack is empty");
        }
    }
}
