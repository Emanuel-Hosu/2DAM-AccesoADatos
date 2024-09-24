package Main;

public class Main {
    public static void main(String[] args) {
        // Crear una cola de enteros
        Queue<Integer> queue = new Queue<>();

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía?: " + queue.isEmpty());

        // Agregar elementos a la cola
        try {
            queue.add(1);
            queue.add(2);
            queue.add(3);
            queue.add(4);
            queue.add(5);
            queue.add(6);
            // Intentar agregar un séptimo elemento (debería lanzar una excepción)
            queue.add(7); // Esto debería lanzar la excepción ya que el maxSize es 6
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Imprimir el primer elemento sin eliminarlo (peek)
        System.out.println("Elemento al frente (peek): " + queue.peek());

        // Remover y mostrar los elementos uno por uno
        while (!queue.isEmpty()) {
            System.out.println("Removiendo elemento: " + queue.remove());
        }

        // Verificar si la cola está vacía nuevamente
        System.out.println("¿La cola está vacía después de remover todos los elementos?: " + queue.isEmpty());

        // Intentar hacer peek y remove en una cola vacía
        System.out.println("Intentando peek en cola vacía: " + queue.peek());
        System.out.println("Intentando remove en cola vacía: " + queue.remove());
    }
}
