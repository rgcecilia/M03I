package actividad04.operaciones;

import java.io.IOException;

import actividad04.introduceDatos.*;

public class Valores {
	
	public static void muestraPi(){ //función para mostrar el valor de Pi, por pantalla.
		System.out.println("El valor de Pi es: " + Math.PI);
	}
	public static void muestraValorAbsoluto() throws IOException{ // Muestra por pantalla el valor absoluto de un double introducido por consola.
		double d = Pregunta.pideDouble("Introduzca un numero Double");
		double d_abs = Math.abs(d);
		System.out.println("el valor absoluto de " +d+ " es " +d_abs);
	}
	public static void muestraValorAleatorio() throws IOException{ // Muestra por pantalla un número aleatorio entre 0 y un entero introducido por consola.
		int i = Pregunta.pideEntero();
		double ale = Math.random()*i+0;
		System.out.println("numero aleatorio entre 0 y " +i+ " es: " +ale);
	}
}