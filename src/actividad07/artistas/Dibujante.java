package actividad07.artistas;

/**
 * @author raulgc
 *
 */
public class Dibujante extends Artista {
	
	private String ultimaExposicion, tituloMasCaro;
	private double precioMasCaro;
	
	/**Constructor de la clase dibujante
	 * @param dni
	 * @param nombre
	 * @param sexo
	 * @param añoDeNacimiento
	 * @param ultimaExposicion
	 * @param tituloMasCaro
	 * @param precioMasCaro
	 */
	public Dibujante(String dni, String nombre, String sexo, int añoDeNacimiento, String ultimaExposicion,
			String tituloMasCaro, double precioMasCaro) {
		super(dni, nombre, sexo, añoDeNacimiento);
		this.ultimaExposicion = ultimaExposicion;
		this.tituloMasCaro = tituloMasCaro;
		this.precioMasCaro = precioMasCaro;
	}
	
	public String getUltimaExposicion() {
		return ultimaExposicion;
	}
	public void setUltimaExposicion(String ultimaExposicion) {
		this.ultimaExposicion = ultimaExposicion;
	}
	public String getTituloMasCaro() {
		return tituloMasCaro;
	}
	public void setTituloMasCaro(String tituloMasCaro) {
		this.tituloMasCaro = tituloMasCaro;
	}
	public double getPrecioMasCaro() {
		return precioMasCaro;
	}
	public void setPrecioMasCaro(double precioMasCaro) {
		this.precioMasCaro = precioMasCaro;
	}
}

