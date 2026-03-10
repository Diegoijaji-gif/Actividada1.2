import java.util.ArrayList;

/*
 Implementación de una pila (Stack) usando ArrayList.
 Sigue el principio LIFO: el último que entra es el primero que sale.
*/

public class Stack {

    // lista que almacena los textos
    private final ArrayList<String> stackList;

    // constructor
    public Stack() {
        stackList = new ArrayList<>();
    }

    // push: agrega un texto a la pila
    public void push(String value) {
        stackList.add(value);
    }

    // pop: elimina y retorna el último texto
    public String pop() {

        if (isEmpty()) {
            System.out.println("La pila está vacía.");
            return null;
        }

        String value = stackList.getLast();
        stackList.removeLast();

        return value;
    }

    // peek: muestra el último texto sin eliminarlo

    public String peek() {

        if (isEmpty()) {
            return null;
        }

        return stackList.getLast();
    }

    // verifica si la pila está vacía
    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    // devuelve el número de elementos
    public int size() {
        return stackList.size();
    }

    // muestra todos los textos almacenados
    public void mostrar() {

        if (isEmpty()) {
            System.out.println("No hay texto almacenado.");
            return;
        }

        for (String texto : stackList) {
            System.out.println(texto);
        }
    }
}