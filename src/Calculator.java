import java.util.Scanner;

public class Calculator {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        return num1 / num2; // ⚠ No se valida división por cero aún
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite el segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("\nSelecciona una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();
            double resultado;

            switch (opcion) {
                case 1:
                    resultado = sumar(num1, num2);
                    break;
                case 2:
                    resultado = restar(num1, num2);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }

            System.out.println("\nEl resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}
