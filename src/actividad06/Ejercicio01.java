package actividad06;

import java.io.IOException;

import actividad06.Funciones;

public class Ejercicio01 {
	//Metodo principal de nuestro programa con la seleccion de las opciones
	public static void main(String[] args) throws IOException {
		int select;
		do {
			System.out.println("¿Que operación desea realizar?");
			System.out.println("1 Mostrar carpeta formacion y crearla");
			System.out.println("2 Nuevo archivo");
			System.out.println("3 Listar archivos");
			System.out.println("4 Mostrar el contenido de un archivo");
			System.out.println("5 Modificar el contenido de un archivo");
			System.out.println("6 Borrar un archivo");
			System.out.println("7 Renombrar un archivo");
			System.out.println("8 Salir");
			select = Funciones.pideEntero("Seleccione una opcion...");
			switch (select) {
			case 1:
				Funciones.crearCarpeta();
				break;
			case 2:
				String ra=Funciones.crearArchivo();
				Funciones.grabarContenido(ra);
				break;
			case 3:
				Funciones.listarArchivos();
				break;
			case 4:
				Funciones.muestraArchivo();
				break;
			case 5:
				Funciones.ModificarUnArchivo();
				break;
			case 6:
				Funciones.borrarArchivo();
				break;
			case 7:
				Funciones.renombrarArchivo();
				break;
			case 8:
				System.out.println("Hasta luego...");
				System.exit(8);
				break;
			default:
				System.out.println("Seleccion no valida, introduzca otro valor");
				break;
			}
		} while (select >= 1 || select <= 8);
	}
}
