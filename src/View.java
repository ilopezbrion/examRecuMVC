import java.util.Scanner;
public class View {
    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            System.out.println("---- Calculadora Simple ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = 0;
            teclado.nextInt(opcion);

            switch (opcion) {
                case 1 -> Controller.sumar();
                case 2 -> Controller.restar();
                case 3 -> Controller.multiplicar();
                case 4 -> Controller.dividir();
                case 5 -> continuar=false;
                default -> mostrarError("Opción inválida");
            }

        }

    }

    private static void mostrarError(String error) {
        System.out.println("[Error] "+ error);
    }
}