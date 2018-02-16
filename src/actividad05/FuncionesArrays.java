package actividad05;

import java.io.IOException;

public class FuncionesArrays {

	// Función para introducir datos en un array unidimensional
	public static double[] rellenarDatosArray(String text, double x[]) throws IOException {
		System.out.println(text);
		for (int k = 0; k < x.length; k++) {
			double num = Funciones.pideDouble("Puntuación " + (k + 1) + " = ");
			num = Funciones.controlRango(num, 0, 5);
			x[k] = num;
		}
		return x;
	}

	// Muestra los valores incluidos en un array unidimensional
	public static void muestraCadena(double x[], String text) {
		System.out.println(text);
		for (int k = 0; k < x.length; k++) {
			System.out.println("Puntuacion " + (k + 1) + " : " + x[k]);
		}
	}

	// Función para modicar un valor en un array unidimensional
	public static double[] modificarValor(double x[]) throws IOException {
		int pm = Funciones.pideEntero("Indique el nº de puntuacion que desea modificar : ");
		pm = controlRangoArray(x, pm);
		double vn = Funciones.pideDouble("Indique el nuevo valor de la posicion seleccionada : ");
		vn = Funciones.controlRango(vn, 0, 5);
		x[pm - 1] = vn;
		return x;
	}

	// Mostrar numero mas alto del array unidimensional
	public static void mostrarMayor(double x[]) {
		double mayor = x[0];
		for (int pos = 0; pos < x.length; pos++) {
			while (x[pos] > mayor) {
				mayor = x[pos];
			}
		}
		System.out.println("La puntuación mas alta es un " + mayor);
	}

	// Mostrar valores del array unidimensional menores que uno introducido por
	// consola
	public static void mostrarMenorQue(double x[]) throws IOException {
		double menor = Funciones.pideDouble("Introduce el valor para mostrar notas menores :");
		boolean z = false;
		for (int posM = 0; posM < x.length; posM++) {
			double num = x[posM];
			if (num < menor) {
				System.out.println(num + " puntuacion nº " + (posM + 1) + " es menor que " + menor);
				z = true;
			}
		}
		if (z == false) {
			System.out.println("no existe ninguna nota menor que " + menor);
		}
	}

	// Calcular la media de los valores de un array unidimensional de doubles
	public static void calcularValorMedio(double x[]) {
		double media = 0;
		for (int k = 0; k < x.length; k++) {
			media = media + x[k];
		}
		media = media / 10;
		System.out.println("La media de las puntuaciones es : " + media);
	}
	// Funcion para controlar posiciones de un array
	public static int controlRangoArray(double x[], int i) throws IOException {
		if (i < 1 | i > x.length) {
			System.out.println("los espacios para guardar notas van del 1 al " + x.length);
			i = Funciones.pideEntero("Introduce un valor en ese rango : ");
			i = controlRangoArray(x, i);
		}
		return i;
	}
}

