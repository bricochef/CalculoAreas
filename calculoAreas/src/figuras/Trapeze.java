package figuras;

import java.util.Scanner;

public class Trapeze {
    private static Scanner scanner = new Scanner(System.in);
    public static void calculateArea() {
        System.out.print("Ingrese la  1ª base del trapecio: ");
        double base1 = scanner.nextDouble();
        System.out.print("Ingrese la  2ª base del trapecio: ");
        double base2 = scanner.nextDouble();
        System.out.print("Ingrese la altura del trapecio: ");
        double height = scanner.nextDouble();
        double area = ((base1 + base2)  * height) / 2;
        System.out.println("El área del trapecio es: " + area);
    }
    public static void closeScaner(){
        scanner.close(); 
    }
}
