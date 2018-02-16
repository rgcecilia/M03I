package actividad07.cuentaCorriente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author raulgc
 *
 */
public class Utilidades {
	
	/**Funcion para introducir un entero por consola y devolverlo
	 * @param p recibe una cadena con la pregunta correspondiente
	 * @return
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

	/**Funcion para introducir un double por consola y devolverlo
	 * @param p recibe una cadena con la pregunta correspondiente
	 * @return el double introducido por el usuario
	 * @throws IOException
	 */
	public static double pedirDoble(String p) throws IOException {
		double x = 0;
		System.out.println(p);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			x = Double.parseDouble(br.readLine());
		} catch (NumberFormatException Ex) {
			System.out.println("No has indicado un valor entero");
			x = pedirDoble("Intentalo de nuevo");
		}
		return x;
	}

}
