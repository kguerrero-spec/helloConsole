import java.util.Scanner;

public class HelloConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Gestion de gastos");
            System.out.println("2. Gestion de ingresos");
            System.out.println("3. Resumen financiero");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

        } while (opcion != 0);
    }

}