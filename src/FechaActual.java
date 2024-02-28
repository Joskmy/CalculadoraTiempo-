import java.time.LocalDate;

public class FechaActual {
	private Byte diaActual;
	private Byte mesActual;
	private Short anioActual;

	private FechaActual() {
		LocalDate fechaActual = LocalDate.now();
		this.diaActual = (byte) fechaActual.getDayOfMonth();
		this.mesActual = (byte) fechaActual.getMonthValue();
		this.anioActual = (short) fechaActual.getYear();
	}

	public static FechaActual crearFechaActual() {
		return new FechaActual();

	}

	public Byte getDiaActual() {
		return diaActual;
	}

	public Byte getMesActual() {
		return mesActual;
	}

	public Short getAnioActual() {
		return anioActual;
	}

	public LocalDate obtenerFechaCompleta() {
		return LocalDate.of(anioActual, mesActual, diaActual);
	}
}
