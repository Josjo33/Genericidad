package InterfacesClassGenericas;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesMatInteger operacionesInteger = new OperacionesMatInteger();
        OperacionesMatDouble operacionesDouble = new OperacionesMatDouble();

        int opcion;
        do {
            System.out.println("Menú de Operaciones Clases Genéricas:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer valor: ");
                double valor1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo valor: ");
                double valor2 = scanner.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado de la suma: " + (valor1 + valor2));
                } else if (opcion == 2) {
                    System.out.println("Resultado de la resta: " + (valor1 - valor2));
                } else if (opcion == 3) {
                    System.out.println("Resultado del producto: " + (valor1 * valor2));
                } else if (opcion == 4) {
                    System.out.println("Resultado de la división: " + (valor1 / valor2));
                }
            } else if (opcion == 5) {
                System.out.print("Ingrese la base: ");
                double base = scanner.nextDouble();
                System.out.print("Ingrese el exponente: ");
                double exponente = scanner.nextDouble();
                System.out.println("Resultado de la potencia: " + Math.pow(base, exponente));
            } else if (opcion == 6) {
                System.out.print("Ingrese el valor: ");
                double valor = scanner.nextDouble();
                System.out.println("Resultado de la raíz cuadrada: " + Math.sqrt(valor));
            } else if (opcion == 7) {
                System.out.print("Ingrese el valor: ");
                double valor = scanner.nextDouble();
                System.out.println("Resultado de la raíz cúbica: " + Math.cbrt(valor));
            } else if (opcion == 8) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);

        scanner.close();
    }
}