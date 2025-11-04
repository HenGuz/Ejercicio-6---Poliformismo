/**
 * Autor: Henry Guzmán
 * Fecha: 03/10/2025
 * Descripción: Ejercicio No. 5 - Poliformismo con Herencia
 * Curso: Programación orientada a objetos
 */

import java.util.*;

public class Vista {
    /**
     * Funcion del metodo main
     * Variables que usa: args (argumentos de línea de comando)
     * Uso resumido: crea controlador, inicializa catálogo y ejecuta menú principal
     * Valor que retorna: void
     */
    public static void main(String[] args) {
        ControladorDispositivos controlador = new ControladorDispositivos();
        controlador.initCatalogo();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== MENÚ DE DISPOSITIVOS ===");
            System.out.println("1. Listar dispositivos");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Ordenar por consumo eléctrico");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> controlador.listarDispositivos();
                case 2 -> {
                    System.out.print("Ingrese ID: ");
                    int id = sc.nextInt();
                    controlador.buscarPorId(id);
                }
                case 3 -> {
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    controlador.buscarPorNombre(nombre);
                }
                case 4 -> controlador.ordenarPorConsumo();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opcion != 0);
    }
}