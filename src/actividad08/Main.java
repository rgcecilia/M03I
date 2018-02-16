package actividad08;

import java.io.IOException;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Main {

	/**Metodo principal del programa, Muestra los vehiculos almacenados y calcula el alquiler de los mismos.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{

		Ivehiculo[] misVehiculos = new Ivehiculo[4];
		misVehiculos[0] = new Coche("1234KLM", 5);
		misVehiculos[1] = new Microbus("4321MLK", 12);
		misVehiculos[2] = new Carga("5678NOP", 1.5);
		misVehiculos[3] = new Camion("8765PON", 3.1);
		int selec = 0;
		do {
			selec = Utilidades.pedirEntero("Seleccione una opcion \n" + "1 mostrar flota \n"
					+ "2 seleccionar vehiculo para calcular su alquiler \n" + "3 salir");
			switch (selec) {

			case 1:
				Utilidades.muestraVehiculos(misVehiculos);
				break;
			case 2:
				int x = Utilidades.compararMatriculas(misVehiculos);
				int dias = Utilidades.pedirEntero("Cuantos dias ha alquilado el vehiculo");
				misVehiculos[x].setDias(dias);
				System.out.println("Importe total del alquiler del " + misVehiculos[x].getClass().getSimpleName() 
									+ " : " + misVehiculos[x].getAlquiler() + "€");
				break;

			default:
				System.out.println("Seleccion no valida, intentelo de nuevo");
				break;
			case 3:
				System.out.println("Bye");
				System.exit(3);
			}

		} while (selec > 0 | selec < 4);

	}


}
