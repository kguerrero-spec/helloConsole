import java.util.Scanner;

public class HelloConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int opcionGastos = 0;

        do {
            System.out.println("----- MENU PRINCIPAL -----");
            System.out.println("1. Gestion de gastos");
            System.out.println("2. Gestion de ingresos");
            System.out.println("3. Resumen financiero");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                do {
                    System.out.println("----- MENU GASTOS -----");
                    System.out.println("1. Anadir gasto");
                    System.out.println("2. Editar gasto");
                    System.out.println("3. Eliminar gasto");
                    System.out.println("4. Listar gastos");
                    System.out.println("0. Volver");
                    System.out.print("Elige una opcion: ");

                    opcionGastos = sc.nextInt();
                    sc.nextLine();
                    if (opcionGastos == 1) {
                        System.out.println("Añadir gasto");
                    }

                } while (opcionGastos != 0);
            }

        } while (opcion != 0);
    }

}