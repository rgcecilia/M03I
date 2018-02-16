package actividad08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Utilidades {
	
	/**Funcion para pedir un numero entero al usuario.
	 * @param p, Cadena de texto con una pregunta para el usuario.
	 * @return x, Entero introducido por consola por el usuario.
	 * @throws IOException
	 */
	public static int pedirEntero(String p) throws IOException {
		int x = 0;
		System.out.println(p);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			x = Integer.parseInt(br.readLine());
		} catch (NumberFormatException Ex) {
			System.out.println("No has indicado un valor entero");
			x = pedirEntero("Intentalo de nuevo");
		}
		return x;
	}

	/**Funcion para pedir una cadena de texto al usuario.
	 * @param p, Cadena de texto con una pregunta para el usuario.
	 * @return cadena, Cadena de texto introducida por el usuario.
	 * @throws IOException
	 */
	public static String pedirCadena(String p) throws IOException {
		System.out.println(p);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		return cadena;
	}
	
	/**Funcion para mostrar los vehiculos contenidos en un array
	 * @param x, Array de Ivehiculos con vehiculos almacenados.
	 */
	public static void muestraVehiculos(Ivehiculo x[]) {
		System.out.println("Vehiculos disponibles");
		for (int i = 0; i < x.length; i++) {
			System.out.println("Vehiculo " + (i+1) + " " + x[i].getClass().getSimpleName() + " " + x[i].getMatricula());
		}
	}

	/**Funcion para seleccionar un vehiculo por su matricula.
	 * @param x recibe un array de Ivehiculos con vehiculos almacenados.
	 * @return i, Posicion en el array de un vehiculo seleccionado por su matricula.
	 * @throws IOException
	 */
	public static int compararMatriculas(Ivehiculo x[]) throws IOException {
		String matricula = pedirCadena("Indique la matricula del vehiculo alquilado");
		boolean z = false;
		int i = 0, temp = 0;
		while (i < x.length & z == false) {
			if (matricula.equals(x[i].getMatricula())) {
				z = true;
				temp = i;
			}
			i++;
		}
		if (z == false) {
			matricula = pedirCadena("matricula no encontrada, intentelo de nuevo");
			temp = compararMatriculas(x);

		}
		return temp;
	}
}
