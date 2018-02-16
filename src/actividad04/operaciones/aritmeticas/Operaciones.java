package actividad04.operaciones.aritmeticas;

import java.io.IOException;

import actividad04.introduceDatos.Pregunta;

public class Operaciones { //Muestra por pantalla el logaritmo del número introducido por el usuario.
	public static void muestraLogaritmo(double d) throws IOException{
		while (d<=0){
			if (d==0){
				System.out.println("El logaritmo de 0 es infinito.");
				d = Pregunta.pideDouble("Introduce otro valor");
			} else {
				System.out.println("Debes introducir un valor positivo");
				d = Pregunta.pideDouble("Introduce otro valor");
			}
		} 
		double dlog = Math.log(d);
		System.out.println("el logaritmo de " +d+ " es " +dlog);
	}
	public static void calculaPotencia(double b, double e ) throws IOException{ //Muestra la potencia del primer numero introducido elevado al segundo.
		if (b<0){
			int x = (int) e;
			while ((x-e)!=0){
				System.out.println("Si la base es negativa, el exponente no puede contener decimales");
				e = Pregunta.pideDouble("Introduce un nuevo exponente");
				x = (int) e;
			}
		}
		double pot = Math.pow(b, e);
		System.out.println(b+ " elevado a " +e+ " es igual a: " +pot);
	}
}