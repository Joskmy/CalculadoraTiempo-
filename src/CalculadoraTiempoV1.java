import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalculadoraTiempoV1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date fechaIngresada = null;

        do {
            try {
                // Ingreso de la fecha
                System.out.println("Ingrese la fecha en formato dd/MM/yyyy:");
                String fechaString = scanner.nextLine();

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                fechaIngresada = dateFormat.parse(fechaString);

                // Verificar si la fecha ingresada es futura
                if (fechaIngresada.after(new Date())) {
                    System.out.println("Error: La fecha ingresada es futura. Asegúrese de ingresar una fecha actual o pasada.");
                    continue; // Vuelve al inicio del bucle
                }

                // Obtener el día de la semana
                String diaSemana = obtenerDiaSemana(fechaIngresada);
                System.out.println("La fecha ingresada corresponde a un " + diaSemana + ".");

                // Menú principal
                menuPrincipal(scanner, fechaIngresada);
                break; // Sale del bucle si todo es exitoso

            } catch (ParseException e) {
                System.out.println("Error al procesar la fecha. Asegúrese de ingresar una fecha válida en el formato especificado.");
            }
        } while (true);
    }

    private static void menuPrincipal(Scanner scanner, Date fechaIngresada) {
        do {
            try {
                // Opciones de cálculo
                System.out.println("Seleccione una opción:");
                System.out.println("1. Ver cuántos días han pasado");
                System.out.println("2. Ver cuántas semanas han pasado");
                System.out.println("3. Ver cuántos meses han pasado");
                System.out.println("4. Ver cuántos años han pasado");
                System.out.println("5. Ver cuántos minutos han pasado");
                System.out.println("6. Ver cuántos segundos han pasado");
                System.out.println("7. Ver cuántas horas han pasado");
                System.out.println("8. Cambiar fecha");
                System.out.println("9. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS), "días");
                        break;
                    case 2:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) / 7, "semanas");
                        break;
                    case 3:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) / 30, "meses");
                        break;
                    case 4:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) / 365, "años");
                        break;
                    case 5:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) * 1440, "minutos");
                        break;
                    case 6:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) * 86400, "segundos");
                        break;
                    case 7:
                        mostrarResultado(calcularDiferenciaTiempo(fechaIngresada, TimeUnit.DAYS) * 24, "horas");
                        break;
                    case 8:
                        scanner.nextLine();  // Consumir la nueva línea pendiente
                        System.out.println("Ingrese la nueva fecha en formato dd/MM/yyyy:");
                        String nuevaFechaString = scanner.nextLine();
                        try {
                            SimpleDateFormat nuevoDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                            Date nuevaFecha = nuevoDateFormat.parse(nuevaFechaString);

                            // Verificar si la nueva fecha es futura
                            if (nuevaFecha.after(new Date())) {
                                System.out.println("Error: La nueva fecha ingresada es futura. Asegúrese de ingresar una fecha actual o pasada.");
                            } else {
                                fechaIngresada = nuevaFecha;

                                // Obtener el día de la semana para la nueva fecha
                                String nuevoDiaSemana = obtenerDiaSemana(fechaIngresada);
                                System.out.println("La nueva fecha ingresada corresponde a un " + nuevoDiaSemana + ".");
                            }

                        } catch (ParseException ex) {
                            System.out.println("Error al procesar la nueva fecha. Se mantendrá la fecha anterior.");
                        }
                        break;
                    case 9:
                        System.out.println("Saliendo del programa. ¡Hasta luego!");
                        return;
                    default:
                        System.out.println("Opción no válida.");
                }

                // Consumir la nueva línea pendiente
                scanner.nextLine();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error al procesar la opción. Asegúrese de ingresar una opción válida.");
                scanner.nextLine();  // Consumir la nueva línea pendiente
            }
        } while (true);
    }

    private static long calcularDiferenciaTiempo(Date fechaInicio, TimeUnit unidadTiempo) {
        Calendar startCalendar = Calendar.getInstance();
        startCalendar.setTime(fechaInicio);

        Calendar endCalendar = Calendar.getInstance();

        long diff = endCalendar.getTimeInMillis() - startCalendar.getTimeInMillis();

        return unidadTiempo.convert(diff, TimeUnit.MILLISECONDS);
    }

    private static void mostrarResultado(long resultado, String unidad) {
        System.out.println("Han pasado aproximadamente " + resultado + " " + unidad + " desde la fecha ingresada.");
    }

    private static String obtenerDiaSemana(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);

        // Obtener el número del día de la semana (1 = domingo, 2 = lunes, ..., 7 = sábado)
        int numeroDiaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        // Convertir el número a nombre del día de la semana
        String[] nombresDiasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        return nombresDiasSemana[numeroDiaSemana - 1];
    }
}
