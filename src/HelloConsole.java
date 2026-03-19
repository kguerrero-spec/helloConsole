import java.util.Scanner;

public class HelloConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gasto[] gastos = new Gasto[100];
        int numGastos = 0;
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

                        System.out.println("Introduce descripcion:");
                        String descripcion = sc.nextLine();

                        System.out.println("Introduce importe:");
                        double importe = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Introduce categoria:");
                        String categoria = sc.nextLine();
                        System.out.println("Introduce fecha:");
                        String fecha = sc.nextLine();
                        System.out.println("Introduce metodo de pago:");
                        String metodoPago = sc.nextLine();

                        Gasto g = new Gasto();
                        g.descripcion = descripcion;
                        g.importe = importe;
                        g.categoria = categoria;
                        g.fecha = fecha;
                        g.metodoPago = metodoPago;

                        gastos[numGastos] = g;
                        numGastos++;

                        System.out.println("Gasto guardado correctamente");

                        System.out.println("Gasto creado correctamente");

                        System.out.println("Has escrito: " + descripcion);
                        System.out.println("El importe es: " + importe);
                        System.out.println("Categoria: " + categoria);
                        System.out.println("Fecha: " + fecha);
                        System.out.println("Metodo de Pago:" + metodoPago);

                       
                    }

                } while (opcionGastos != 0);
            }

        } while (opcion != 0);
    }

}