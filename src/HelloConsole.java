import java.util.Scanner;

public class HelloConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gasto[] gastos = new Gasto[100];
        Ingreso[] ingresos = new Ingreso[100];
        int numIngresos = 0;
        int opcionIngresos;
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
            if (opcion == 3) {
                System.out.println("RESUMEN FINANCIERO");
                double totalGastos = 0;

                for (int i = 0; i < numGastos; i++) {
                    totalGastos = totalGastos + gastos[i].importe;
                }
                double totalIngresos = 0;
                for (int i = 0; i < numIngresos; i++) {
                    totalIngresos = totalIngresos + ingresos[i].importe;
                }
                double saldoTotal = totalIngresos - totalGastos;
                System.out.println("Total ingresos: " + totalIngresos);
                System.out.println("Total gastos: " + totalGastos);
                System.out.println("Saldo total: " + saldoTotal);

                double totalAlimentacion = 0;
                double totalTransporte = 0;
                double totalOcio = 0;
                double totalVivienda = 0;
                double totalSalud = 0;
                double totalOtros = 0;
            }
            if (opcion == 2) {
                do {
                    System.out.println("----- MENU INGRESOS -----");
                    System.out.println("1. Anadir ingreso");
                    System.out.println("2. Editar ingreso");
                    System.out.println("3. Eliminar ingreso");
                    System.out.println("4. Listar ingreso");
                    System.out.println("0. Volver");
                    System.out.print("Elige una opcion: ");

                    opcionIngresos = sc.nextInt();
                    sc.nextLine();
                    if (opcionIngresos == 1) {
                        System.out.println("Añadir ingreso");

                        System.out.println("Introduce descripcion:");
                        String descripcion = sc.nextLine();

                        System.out.println("Introduce importe:");
                        double importe = sc.nextDouble();
                        sc.nextLine();

                        System.out.println("Introduce fecha:");
                        String fecha = sc.nextLine();
                        System.out.println("Introduce origen:");
                        String origen = sc.nextLine();

                        Ingreso i = new Ingreso();
                        i.descripcion = descripcion;
                        i.importe = importe;
                        i.fecha = fecha;
                        i.origen = origen;

                        ingresos[numIngresos] = i;
                        numIngresos++;
                        System.out.println("Ingreso guardado correctamente");
                    }
                    if (opcionIngresos == 4) {
                        System.out.println("LISTA DE INGRESOS");

                        for (int i = 0; i < numIngresos; i++) {
                            System.out.println(
                                    ingresos[i].descripcion + " - " +
                                            ingresos[i].importe + " - " +
                                            ingresos[i].fecha + " - " +
                                            ingresos[i].origen
                            );
                        }
                    }
                    if (opcionIngresos == 2) {
                        System.out.println("EDITAR INGRESO");

                        for (int i = 0; i < numIngresos; i++) {
                            System.out.println(i + " - " +
                                    ingresos[i].descripcion + " - " +
                                    ingresos[i].importe);
                        }

                        System.out.println("Que ingreso quieres editar?");
                        int posicion = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Introduce el nuevo importe:");
                        double nuevoImporte = sc.nextDouble();
                        sc.nextLine();

                        ingresos[posicion].importe = nuevoImporte;

                        System.out.println("Ingreso editado correctamente");
                    }
                    if (opcionIngresos == 3) {
                        System.out.println("ELIMINAR INGRESO");

                        for (int i = 0; i < numIngresos; i++) {
                            System.out.println(i + " - " +
                                    ingresos[i].descripcion + " - " +
                                    ingresos[i].importe);
                        }

                        System.out.println("Que ingreso quieres eliminar?");
                        int posicionEliminar = sc.nextInt();
                        sc.nextLine();

                        for (int i = posicionEliminar; i < numIngresos - 1; i++) {
                            ingresos[i] = ingresos[i + 1];
                        }

                        numIngresos--;
                        System.out.println("Ingreso eliminado correctamente");
                    }
                } while (opcionGastos != 0);
            }

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

                    if (opcionGastos == 4) {
                        System.out.println("LISTA DE GASTOS");

                        for (int i = 0; i < numGastos; i++) {
                            System.out.println(
                                    gastos[i].descripcion + " - " +
                                            gastos[i].importe + " - " +
                                            gastos[i].categoria + " - " +
                                            gastos[i].fecha + " - " +
                                            gastos[i].metodoPago);
                        }
                    }

                    if (opcionGastos == 2) {
                        System.out.println("EDITAR GASTO");

                        for (int i = 0; i < numGastos; i++) {
                            System.out.println(i + " - " +
                                    gastos[i].descripcion + " - " +
                                    gastos[i].importe);
                        }

                        System.out.println("Que gasto quieres editar?");
                        int posicion = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Introduce el nuevo importe:");
                        double nuevoImporte = sc.nextDouble();
                        sc.nextLine();

                        gastos[posicion].importe = nuevoImporte;

                        System.out.println("Importe editado correctamente");
                    }

                    if (opcionGastos == 3) {
                        System.out.println("ELIMINAR GASTO");

                        for (int i = 0; i < numGastos; i++) {
                            System.out.println(i + " - " +
                                    gastos[i].descripcion + " - " +
                                    gastos[i].importe);
                        }

                        System.out.println("Que gasto quieres eliminar?");
                        int posicionEliminar = sc.nextInt();
                        sc.nextLine();

                        for (int i = posicionEliminar; i < numGastos - 1; i++) {
                            gastos[i] = gastos[i + 1];
                        }
                        numGastos--;

                        System.out.println("Gasto eliminado correctamente");
                    }

                } while (opcionGastos != 0);
            }
        } while (opcion != 0);
    }
}