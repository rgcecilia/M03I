package actividad04.main;

import java.io.IOException;

import actividad04.introduceDatos.Pregunta;
import actividad04.operaciones.Valores;
import actividad04.operaciones.aritmeticas.Operaciones;

public class Ejercicio1 {

	public static void main(String[] args) throws IOException { //Metodo principal del programa con el menu de las opciones disponibles
		int s;
		double d, e;
		
		do{ 														
			System.out.println("¿Que operación desea realizar?");
			System.out.println("1 Muestra Pi");
			System.out.println("2 Mostrar valor absoluto de un número");
			System.out.println("3 Mostrar numero aleatorio");
			System.out.println("4 Calcular logaritmo");
			System.out.println("5 Calcular potencia de 2 números");
			System.out.println("6 Calcular seno de un double");
			System.out.println("7 Calcular coseno de un double");
			System.out.println("8 Salir");
			s = Pregunta.pideEntero();  
			
			switch(s){		//mediante un switch ejecutamos la opcion deseada por el usuario
			case 1:
				Valores.muestraPi();
				break;
			case 2:	
				Valores.muestraValorAbsoluto();
				break;
			case 3: 
				Valores.muestraValorAleatorio();
				break;
			case 4:
				d = Pregunta.pideDouble("Introduce un Double");
				Operaciones.muestraLogaritmo(d);
				break;
			case 5:
				d = Pregunta.pideDouble("Introduzca la base");
				e = Pregunta.pideDouble("Introduzca exponente");
				Operaciones.calculaPotencia(d, e);
				break;
			case 6:
				actividad04.operaciones.geometricas.Operaciones.muestraSeno();
				break;
			case 7:
				actividad04.operaciones.geometricas.Operaciones.muestraCoseno();
				break;
			case 8:
				System.out.println("Hasta luego!");
				System.exit(8);
				break;
			default:	//en cualquier otro caso, se vuelve a pedir la opcion a seleccionar								
				System.out.println("Seleccion no valida, introduzca otro valor"); 
				break;															  			
				}																	  
					} while (s>=1 || s<=8);

	}

}
