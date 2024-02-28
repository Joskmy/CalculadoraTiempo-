import java.time.LocalDate;

public class Prueba {

	public static void main(String[] args) {
		Fecha miFecha = Fecha.crear((byte) 2, (byte) 2, (short) 2023);
		FechaActual fechaActual = FechaActual.crearFechaActual();
		LocalDate fecha1 = miFecha.obtenerFecha();
		long prueba1 = CalculadoraFecha.calcularDiferenciaEnAnnos(miFecha, fechaActual);
		long prueba2 = CalculadoraFecha.calcularDiferenciaEnHoras(miFecha, fechaActual);
		long prueba3 = CalculadoraFecha.calcularDiferenciaEnDias(miFecha, fechaActual);
		long prueba4 = CalculadoraFecha.calcularDiferenciaEnMeses(miFecha, fechaActual);
		System.out.println("Dia: " + miFecha.getDia());
		System.out.println("Mes: " + miFecha.getMes());
		System.out.println("Anio: " + miFecha.getAnio());
		System.out.println("DiaActual: " + fechaActual.getDiaActual());
		System.out.println("MesActual: " + fechaActual.getMesActual());
		System.out.println("AnioActual: " + fechaActual.getAnioActual());
		System.out.println(fechaActual.obtenerFechaCompleta());
		System.out.println(prueba1);
		System.out.println(prueba2);
		System.out.println(prueba3);
		System.out.println(prueba4);

	}
}
