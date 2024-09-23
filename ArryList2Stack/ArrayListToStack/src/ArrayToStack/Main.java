package ArrayToStack;

/**
 * The Main class demonstrates the usage of the Stack class.
 * 
 * <p>This example creates a stack, pushes elements onto it, pops elements from it, 
 * and displays the top element using the peek method. It also shows the removal 
 * of a specific element from the stack.</p>
 * 
 * @author Emi
 */
public class Main {

    /**
     * The main method is the entry point of the application.
     * 
     * @param args command-line arguments passed to the program (not used)
     */
    public static void main(String[] args) {
        // Create a new stack
        Stack<Integer> pila = new Stack<>();

        // Push elements onto the stack
        pila.push(3);
        pila.push(2);
        pila.push(5);
        
        // Pop the top element and display the current top
        pila.pop();
        System.out.println(pila.peek());

        // Pop again and display the current top
        pila.pop();
        System.out.println(pila.peek());

        // Remove a specific element and try to display the current top
        pila.remove(3);
        System.out.println(pila.peek());
    }
}
