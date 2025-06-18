import java.util.Scanner;

public class Controller {
    Scanner teclado = new Scanner(System.in);

    public static void inicio() {


        boolean continuar = true;

        // Bucle principal de la aplicación
        View.menu();

    }

    public static double sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        sc.close();
        return Model.sumarNum(num1,num2);
    }
    public static double restar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        sc.close();
        return Model.sumarNum(num1,num2);
    }
}
