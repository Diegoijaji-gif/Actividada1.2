import java.util.Scanner;

/*
 Clase principal que contiene el menú del programa.
 Permite escribir texto, deshacer, rehacer y mostrar el contenido.
*/

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // objeto que maneja las pilas
        EditorTexto editor = new EditorTexto();

        int opcion;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer");
            System.out.println("3. Rehacer");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese texto: ");
                    String texto = scanner.nextLine();

                    editor.escribirTexto(texto);

                    break;

                case 2:

                    editor.deshacer();

                    break;

                case 3:

                    editor.rehacer();

                    break;

                case 4:

                    editor.mostrarTexto();

                    break;

                case 5:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}