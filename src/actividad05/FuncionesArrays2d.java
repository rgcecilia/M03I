package actividad05;

import java.io.IOException;

public class FuncionesArrays2d {

	// Funcion para mostrar el contenido de un array bidimensional
	public static void mostrarContenido(String[][] array) {
		for (int k = 0; k < array.length; k++) {
			System.out.println("Puntuaciones de la pelicula " + array[k][0]);
			for (int i = 1; i < 4; i++) {
				System.out.println("Puntuacion " + i + " es " + array[k][i]);
			}
		}
	}

	// Funcion para mostrar nombre de las peliculas
	public static void mostrarNombres(String[][] array) {
		for (int k = 0; k < array.length; k++) {
			System.out.println("pelicula " + (k + 1) + " " + array[k][0]);
		}
	}

	// Funcion para modificar el nombre de una pelicula
	public static String[][] modificarNombre(String[][] array) throws IOException {
		int pos = Funciones.pideEntero("Indique el numero de la pelicula para modificar su nombre : ");
		pos = (int) Funciones.controlRango(pos, 1, 5);
		array[pos - 1][0] = Funciones.introduceString("Introduce el nuevo nombre : ");
		return array;
	}

	// Funcion para mostrar las notas de una pelicula
	public static void mostrarPuntuaciones(String[][] array) throws IOException {
		int pos = Funciones.pideEntero("Indique el nº de la pelicula para ver sus puntuaciones : ");
		int i;
		pos = (int) Funciones.controlRango(pos, 1, 5);
		System.out.println("Puntuaciones de " + array[pos - 1][0]);
		for (i = 1; i < 4; i++) {
			System.out.println("Puntuacion " + i + " es " + array[pos - 1][i]);
		}
	}

	// Funcion para modificar una nota de una pelicula
	public static String[][] modificarUnaPuntuacion(String[][] array) throws IOException {
		int pos = Funciones.pideEntero("De que pelicula desea modificar una nota : ");
		pos = (int) Funciones.controlRango(pos, 1, 5);
		System.out.println("Las puntuaciones de " + array[pos - 1][0] + " son: ");
		int i;
		for (i = 1; i < 4; i++) {
			System.out.println("Puntuacion " + i + " es " + array[pos - 1][i]);
		}
		int pos2 = Funciones.pideEntero("Que nota desea modificar : ");
		pos2 = (int) Funciones.controlRango(pos2, 1, 3);

		double nn = Funciones.pideDouble("Introduce la nueva nota : ");
		nn = Funciones.controlRango(nn, 0, 10);
		String cas = String.valueOf(nn);
		array[pos - 1][pos2] = cas;
		return array;
	}

	// Mostrar nota mas alta de una pelicula
	public static void mostrarPuntuacionAlta(String[][] array) throws IOException {
		int pos = Funciones.pideEntero("De que pelicula desea mostrar la nota mas alta : ");
		pos = (int) Funciones.controlRango(pos, 1, 5);
		int i;
		double mayor = Double.parseDouble(array[pos - 1][1]);
		for (i = 1; i < 4; i++) {
			while (Double.parseDouble(array[pos - 1][i]) > mayor) {
				mayor = Double.parseDouble(array[pos - 1][i]);
			}
		}
		System.out.println("La nota mas alta de " + array[pos - 1][0] + " es: " + mayor);
	}

	// Mostrar nota media mas alta que un numero introducido
	public static void mostrarMediaAlta(String[][] array) throws IOException {
		double num = Funciones.pideDouble("Introduce la nota a comprobar ");
		num = Funciones.controlRango(num, 0, 10);
		boolean l = false;
		for (int i = 0; i < array.length; i++) {
			double media = 0, var = 0;
			for (int j = 1; j < array[i].length; j++) {
				var = var + Double.parseDouble(array[i][j]);
				if (j == array[i].length - 1) {
					media = var / 3;
					if (media >= num) {
						System.out.println("La nota media de " + array[i][0] + " : " + media + " es mayor que " + num);
						l = true;
					}
				}
			}
		}
		if (l == false) {
			System.out.println("no hay peliculas con una nota media superior a " + num);
		}
	}
}
