/*
 Clase que maneja las operaciones del programa.
 Usa dos pilas para implementar Undo y Redo.
*/

public class EditorTexto {

    // pila principal con los textos escritos
    private final Stack pilaAcciones;

    // pila secundaria que guarda textos deshechos
    private final Stack pilaDeshacer;

    // constructor
    public EditorTexto() {

        pilaAcciones = new Stack();
        pilaDeshacer = new Stack();
    }

    // agrega un texto nuevo
    public void escribirTexto(String texto) {

        pilaAcciones.push(texto);

        System.out.println("Texto agregado: " + texto);
    }

    // deshacer última acción
    public void deshacer() {

        if (pilaAcciones.isEmpty()) {
            System.out.println("No hay acciones para deshacer.");
            return;
        }

        String texto = pilaAcciones.pop();
        pilaDeshacer.push(texto);

        System.out.println("Se deshizo: " + texto);
    }

    // rehacer última acción deshecha
    public void rehacer() {

        if (pilaDeshacer.isEmpty()) {
            System.out.println("No hay acciones para rehacer.");
            return;
        }

        String texto = pilaDeshacer.pop();
        pilaAcciones.push(texto);

        System.out.println("Se rehizo: " + texto);
    }

    // mostrar texto actual
    public void mostrarTexto() {

        System.out.println("\nTexto actual:");

        pilaAcciones.mostrar();
    }
}
