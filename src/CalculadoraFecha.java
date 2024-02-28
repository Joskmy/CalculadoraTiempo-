import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CalculadoraFecha {
    public static long calcularDiferenciaEnAnnos(Fecha fecha1, FechaActual fecha2) {
        LocalDate fechaInicio = LocalDate.of(fecha1.getAnio(), fecha1.getMes(), fecha1.getDia());
        LocalDate fechaFin = LocalDate.of(fecha2.getAnioActual(), fecha2.getMesActual(), fecha2.getDiaActual());
        return ChronoUnit.YEARS.between(fechaInicio, fechaFin);
    }

    public static long calcularDiferenciaEnMeses(Fecha fecha1, FechaActual fecha2) {
        LocalDate fechaInicio = LocalDate.of(fecha1.getAnio(), fecha1.getMes(), fecha1.getDia());
        LocalDate fechaFin = LocalDate.of(fecha2.getAnioActual(), fecha2.getMesActual(), fecha2.getDiaActual());
        return ChronoUnit.MONTHS.between(fechaInicio, fechaFin);
    }

    public static long calcularDiferenciaEnDias(Fecha fecha1, FechaActual fecha2) {
        LocalDate fechaInicio = LocalDate.of(fecha1.getAnio(), fecha1.getMes(), fecha1.getDia());
        LocalDate fechaFin = LocalDate.of(fecha2.getAnioActual(), fecha2.getMesActual(), fecha2.getDiaActual());
        return ChronoUnit.DAYS.between(fechaInicio, fechaFin);
    }

    public static long calcularDiferenciaEnHoras(Fecha fecha1, FechaActual fecha2) {
        LocalDate fechaInicio = LocalDate.of(fecha1.getAnio(), fecha1.getMes(), fecha1.getDia());
        LocalDate fechaFin = LocalDate.of(fecha2.getAnioActual(), fecha2.getMesActual(), fecha2.getDiaActual());
        return ChronoUnit.HOURS.between(fechaInicio.atStartOfDay(), fechaFin.atStartOfDay());
    }
}
