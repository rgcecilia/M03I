package actividad07.artistas;

import java.io.IOException;

/**
 * @author raulgc
 *
 */
public class TestArtistas {

	/**Metodo principal de nuestro programa
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
			System.out.println("Creando el artista...");
			Artista miArtista = new Artista();
			miArtista.setDni("123456789D");
			miArtista.setNombre("Carlos Martinez Garcia");
			miArtista.setSexo("Hombre");
			miArtista.setAñoDeNacimiento(1983);
			System.out.println(" Datos del artista : \n" + miArtista.getDni() + "\n" + miArtista.getNombre() + "\n"
						+ miArtista.getSexo() + "\n" + miArtista.getAñoDeNacimiento());
			System.out.println("Creando el dibujante...");
			Dibujante miDibujante = new Dibujante("123456789D", "Juanito Valderrama Garcia", "Hombre", 1983, "Cuadros desde el corazon", "El alma", 9300);
			System.out.println("datos del dibujante : \n" + miDibujante.getDni() + "\n" + miDibujante.getNombre()
						+ "\n" + miDibujante.getSexo() + "\n" + miDibujante.getAñoDeNacimiento() + "\n"
						+ miDibujante.getUltimaExposicion() + "\n" + miDibujante.getTituloMasCaro() + "\n"
						+ miDibujante.getPrecioMasCaro()+"€");
			Musico miMusico = new Musico();
			miMusico = new Musico("987654321A", "Maria Jimenez Perez", "Mujer", 1983, "www.mvjsinger.com", "MVJ Grandes Exitos");
			String[] tt = {"***","***","***","***","***","***","***","***","***","***"};
			miMusico.setTop10(tt);
			System.out.println("Musico Creado!");
			System.out.println("Datos del musico : \n"
					+ miMusico.getDni() + "\n" + miMusico.getNombre()
					+ "\n" + miMusico.getSexo() + "\n" + miMusico.getAñoDeNacimiento() + "\n"
					+ miMusico.getSitioWeb() + "\n" + miMusico.getUltimoDisco());
			Musico.muestraCanciones(miMusico.getTop10());
			System.out.println("Ahora se introducen 3 canciones el top ten de " +miMusico.getNombre() );
			Musico.setCancion(tt, "Felicidad", 1);
			Musico.setCancion(tt, "Cancion musical", 3);
			Musico.setCancion(tt, "Ultra Cancion", 8);
			miMusico.setTop10(tt);
			Musico.muestraCanciones(miMusico.getTop10());
		}
}
