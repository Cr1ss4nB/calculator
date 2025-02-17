import java.util.Scanner;

public class Calculator {

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite el segundo número: ");
            double num2 = sc.nextDouble();

            double resultado = sumar(num1, num2);
            System.out.println("\nEl resultado de la suma es: " + resultado);
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida.");
        }
    }
}

