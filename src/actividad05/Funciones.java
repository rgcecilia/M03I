package actividad05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funciones {

	// Función para introducir un double por teclado y devolverlo
	public static double pideDouble(String text) throws IOException {
		double d = 0;
		System.out.print(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		try {
			d = Double.parseDouble(cadena);
		} catch (NumberFormatException Ex) {
			System.out.println("Valor no valido, intentelo de nuevo");
			d = pideDouble(text);
		}
		return d;
	}

	// Función para introducir un entero por teclado y devolverlo
	public static int pideEntero(String text) throws IOException {
		int i = 0;
		System.out.print(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		try {
			i = Integer.parseInt(cadena);
		} catch (NumberFormatException Ex) {
			System.out.println("Valor no valido, intentelo de nuevo");
			i = pideEntero(text);
		}
		return i;
	}

	// Funcion para introducir un string y devolverlo
	public static String introduceString(String text) throws IOException {
		System.out.println(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		return cadena;
	}

	// Funcion para controlar que un numero introducido por consola, este dentro
	// de un rango concreto
	public static double controlRango(double x, int i, int j) throws IOException {
		if (x < i | x > j) {
			x = Funciones.pideDouble("Introduce un valor entre " + i + " y " + j + ": ");
			x = controlRango(x, i, j);
		}
		return x;
	}

}