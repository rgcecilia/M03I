package actividad05;

import java.io.IOException;

public class Ejercicio02 {

	public static void main(String[] args) throws IOException {
		//Metodo principal de nuestro programa con las peliculas y sus notas ya almacenadas
		/*He controlado el almacenamiento de los nombres de las pelicuals dentro del array 
		  para que se muestren del 1 al 5 y sea mas intuitivo para el usuario */
		String[][] peliculas = { { "Thor", "6", "5", "5" }, { "Iron Man", "9", "10", "9" },
				{ "Mad Max", "9", "8", "9" }, { "Cars", "3", "6", "2" }, { "Frozen", "4", "5", "6" } };
		System.out.println("Peliculas y notas almacenadas actualmente");
		FuncionesArrays2d.mostrarContenido(peliculas);
		int select;
		do {
			System.out.println("¿Que operación desea realizar?");
			System.out.println("1 Mostrar nombres de las peliculas");
			System.out.println("2 Modificar nombre de una pelicula");
			System.out.println("3 Mostrar puntuaciones de una pelicula");
			System.out.println("4 Modificar una puntuacion de una pelicula");
			System.out.println("5 Mostrar la nota mas alta");
			System.out.println("6 Mostrar nota media mayor a...");
			System.out.println("7 Salir");
			select = Funciones.pideEntero("Seleccione una opcion...");
			switch (select) {
			case 1:
				FuncionesArrays2d.mostrarNombres(peliculas);
				break;
			case 2:
				peliculas = FuncionesArrays2d.modificarNombre(peliculas);
				break;
			case 3:
				FuncionesArrays2d.mostrarNombres(peliculas);
				FuncionesArrays2d.mostrarPuntuaciones(peliculas);
				break;
			case 4:
				System.out.println("Indique el nº de pelicula para modificar una puntuacion : ");
				FuncionesArrays2d.mostrarNombres(peliculas);
				FuncionesArrays2d.modificarUnaPuntuacion(peliculas);
				break;
			case 5:
				System.out.println("Mostrar puntuacion mas alta de: ");
				FuncionesArrays2d.mostrarNombres(peliculas);
				FuncionesArrays2d.mostrarPuntuacionAlta(peliculas);
				break;
			case 6:
				FuncionesArrays2d.mostrarMediaAlta(peliculas);
				break;
			case 7:
				System.out.println("Hasta pronto!");
				System.exit(7);
				break;
			default:
				System.out.println("Seleccion no valida, introduzca otro valor");
				break;
			}
		} while (select >= 1 || select <= 7);
	}
}
