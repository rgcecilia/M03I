package actividad04.operaciones.geometricas;

import java.io.IOException;

import actividad04.introduceDatos.Pregunta;

public class Operaciones {
	
	public static void muestraSeno() throws IOException{ //Calcula el seno de un double introducido por consola.
		double s = Pregunta.pideDouble("introduce un double para calcular su seno");
		double res = Math.sin(s);
		System.out.println("el seno de " +s+ " es " +res);
	}
	public static void muestraCoseno() throws IOException{ //Calcula el coseno de un double introducido por consola.
		double s = Pregunta.pideDouble("introduce un double para calcular su coseno");
		double res = Math.cos(s);
		System.out.println("el coseno de " +s+ " es " +res);
	}
}
