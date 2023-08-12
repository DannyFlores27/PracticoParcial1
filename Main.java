
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¡Bienvenido al convertidor de números binarios a decimales!");

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Convertir número binario a decimal");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un número binario: ");
                    String entradaBinaria = scanner.nextLine();

                    ConvertidorBinario convertidorBinario = new ConvertidorBinario(entradaBinaria);
                    int salidaDecimal = convertidorBinario.convertirADecimal();

                    System.out.println("El número binario " + entradaBinaria + " en decimal es: " + salidaDecimal);
                    break;
                case 0:
                    System.out.println("¡Gracias por su tiempo!");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 0);
    }
}






















