package actividad05;

import java.io.IOException;
import actividad05.FuncionesArrays;
import actividad05.Funciones;

public class Ejercicio01 {
	//Metodo principal de nuestro programa
	/*He controlado el almacenamiento de notas dentro del array 
	  para que se muestren del 1 al 10 y sea mas intuitivo para el usuario */
	public static void main(String[] args) throws IOException {

		double[] notas = new double[10];
		notas = FuncionesArrays.rellenarDatosArray("Introduce las 10 puntuaciones de la pelicula", notas);
		int select;
		do {
			System.out.println("¿Que operación desea realizar?");
			System.out.println("1 Modificar una puntuacion");
			System.out.println("2 Mostrar la puntuacion mas alta");
			System.out.println("3 Mostrar puntuaciones menores que...");
			System.out.println("4 Mostrar la puntuacion media");
			System.out.println("5 Salir del programa");
			select = Funciones.pideEntero("Seleccione una opcion...");

			switch (select) {
			case 1:
				notas = FuncionesArrays.modificarValor(notas);
				FuncionesArrays.muestraCadena(notas, "Puntuaciones actuales");
				break;
			case 2:
				FuncionesArrays.mostrarMayor(notas);
				break;
			case 3:
				FuncionesArrays.mostrarMenorQue(notas);
				break;
			case 4:
				FuncionesArrays.calcularValorMedio(notas);
				break;
			case 5:
				System.out.println("Hasta luego!");
				System.exit(5);
				break;
			default:
				System.out.println("Seleccion no valida, introduzca otro valor");
				break;
			}
		} while (select >= 1 || select <= 5);
	}
}