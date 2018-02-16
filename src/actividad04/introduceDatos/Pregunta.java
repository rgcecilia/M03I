package actividad04.introduceDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pregunta{
		
	public static int pideEntero() throws IOException { //Función para introducir un entero por teclado y devolverlo
		int i=0;
		System.out.println("Introduzca un valor");    
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String cadena = br.readLine(); 				
		try {										
			i = Integer.parseInt(cadena);  
		} catch (NumberFormatException Ex) {
			System.out.println("No has introducido un numero entero");	
			i = pideEntero();											
		}
		return i;		
	}
	
	public static double pideDouble(String text) throws IOException { //Función para introducir un double por teclado y devolverlo
		double d=0;
		System.out.println(text); 
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		String cadena = br.readLine(); 
		try {						
			d = Double.parseDouble(cadena);	
		} catch (NumberFormatException Ex) { 
			System.out.println("No has introducido un double"); 
			d = pideDouble("Introduce un valor Double");   
		}
		return d;
	}
}