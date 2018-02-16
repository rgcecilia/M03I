package actividad07.artistas;

import java.io.IOException;

/**
 * @author raulgc
 *
 */

public class Musico extends Artista {

	private String sitioWeb, ultimoDisco;
	private String[] top10;
	
	/**Constructor de la clase musico
	 * @param dni
	 * @param nombre
	 * @param sexo
	 * @param añoDeNacimiento
	 * @param sitioWeb
	 * @param ultimoDisco
	 */
	public Musico(String dni, String nombre, String sexo, int añoDeNacimiento, String sitioWeb, String ultimoDisco) {
		super(dni, nombre, sexo, añoDeNacimiento);
		this.sitioWeb = sitioWeb;
		this.ultimoDisco = ultimoDisco;
		
	}
	public Musico() {
		
	}
	public Musico(String[] top10){
		this.top10 = top10;
	}

	public String getSitioWeb() {
		return sitioWeb;
	}

	public void setSitioWeb(String sitioWeb) {
		this.sitioWeb = sitioWeb;
	}

	public String getUltimoDisco() {
		return ultimoDisco;
	}

	public void setUltimoDisco(String ultimoDisco) {
		this.ultimoDisco = ultimoDisco;
	}

	public String[] getTop10() {
		return top10;
	}

	public void setTop10(String[] top10) {
		this.top10 = top10;
	}
	
	/**Funcion para mostrar las canciones top del artista
	 * @param recibe un array con el top ten de canciones
	 */
	public static void muestraCanciones(String x[]) {
		System.out.println("Canciones del artista");
		for (int i = 0; i < x.length; i++) {
			System.out.println("Cancion " + i + " " + x[i]);
		}
	}

	/**
	 * @param x recibe el array de canciones del artista
	 * @param y el titulo de una canciona a ingresar en el top ten
	 * @param z la posicion donde se ingresara la cancion y
	 * @return nos devuelve el array de canciones actualizado
	 * @throws IOException
	 */
	public static String[] setCancion(String x[], String y, int z) throws IOException {
		x[z-1] = y;
		return x;
	}
}
