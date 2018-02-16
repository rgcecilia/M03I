package actividad06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funciones {

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

	//Funcion para introducir un string por teclado y devolverlo
	public static String introduceString(String text) throws IOException {
		System.out.println(text);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String cadena = br.readLine();
		return cadena;
	}

	// Funcion para crear una carpeta
	public static void crearCarpeta() throws IOException {
		String rc = rutaCarpeta("formacion");
		File formacion = new File(rc);
		if (formacion.exists() == false) {
			System.out.println("la carpeta formacion aun no existe");
			formacion.mkdir();
			if (formacion.exists() == true) {
				System.out.println("Carpeta formacion creada");
			}
		} else {
			System.out.println("La carpeta formacion ya existe");
		}
	}

	// Crear archivo nuevo con contenido
	public static String crearArchivo() throws IOException {
		String rc = rutaCarpeta("formacion");
		String sp = File.separator;
		File carpeta = new File(rc);
		if (!carpeta.exists()) {
			crearCarpeta();
		}
		String ra = rc + sp + introduceString("Indique el nombre del nuevo archivo");
		if (controlDeNombre(ra) == false) {
			ra = crearArchivo();
		} else {
			File archivo = new File(ra);
			if (archivo.exists()) {
				System.out.println("Ya existe un archivo con ese nombre, seleccione otro");
				ra = crearArchivo();
			} else {
				archivo.createNewFile();
			}
		}
		return ra;
	}
	//Funcion para grabar contenido dentro de un archivo
	public static void grabarContenido(String x) throws IOException {
		File document = new File(x);
		System.out.print("Escriba el texto que desea almacenar dentro del archivo (pulse enter para finalizar): ");
		FileWriter fw = new FileWriter(document);
		BufferedWriter bw = new BufferedWriter(fw);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String texto = br.readLine();
		bw.write(texto);
		bw.flush();
		bw.close();
	}
	//Funcion para mostrar los archivos de una carpeta
	public static String[] listarArchivos() throws IOException {
		String rc = rutaCarpeta("formacion");
		String sp = File.separator;
		File carpeta = new File(rc);
		if (!carpeta.exists()) {
			crearCarpeta();
			System.out.println("No hay archivos dentro de la carpeta");
			return null;
		}
		String[] archivosCarpetas = carpeta.list();
		if (archivosCarpetas.length < 1) {
			System.out.println("no hay archivos en la carpeta");
			return null;
		} else {
			for (int k = 0; k < archivosCarpetas.length; k++) {
				String nombreItem = archivosCarpetas[k];
				archivosCarpetas[k] = (rc + sp + archivosCarpetas[k]);
				File item = new File(rc+sp+nombreItem);
				if (item.isDirectory()) {
	                System.out.println("carpeta " + k + " : " + nombreItem);
				}else{
				System.out.println("archivo " + k + " : " + nombreItem);
				}
			}
		}
		return archivosCarpetas;
	}

	//Funcion que nos devuelve la ruta de una carpeta
	public static String rutaCarpeta(String nombre) {
		String rp = System.getProperty("user.dir");
		String sp = File.separator;
		String ruta = rp + sp + nombre;
		return ruta;
	}
	//Muestra el contenido dentro de un archivo
	public static void muestraArchivo() throws IOException {
		String archivosCarpetas = seleccionArchivo("mostrar");
		if (archivosCarpetas == null) {
			return;
		}
		if (controlDeNombre(archivosCarpetas) == false) {
			System.out.println("No puedes grabar texto en este tipo de archivo, selecciona otro");
			archivosCarpetas = seleccionArchivo("mostrar");
		} else {
			File document = new File(archivosCarpetas);
			FileReader fr = new FileReader(document);
			BufferedReader br = new BufferedReader(fr);
			String doccont = br.readLine();
			System.out.println(doccont);
			br.close();
		}
	}
	//Funcion para modificar el contenido de un archivo
	public static void ModificarUnArchivo() throws IOException {
		String archivosCarpetas = seleccionArchivo("modificar");
		if (archivosCarpetas == null) {
			return;
		}
		if (controlDeNombre(archivosCarpetas) == false) {
			System.out.println("no puedes grabar texto en este tipo de archivo, selecciona otro");
			archivosCarpetas = seleccionArchivo("modificar");
		} else {
			File document = new File(archivosCarpetas);
			System.out.print("Indique el nuevo contenido del archivo... (pulse enter para finalizar) : ");
			FileWriter fw = new FileWriter(document);
			BufferedWriter bw = new BufferedWriter(fw);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String texto = br.readLine();
			bw.write(texto);
			bw.flush();
			bw.close();
		}
	}
	//funcion para borrar un archivo de nuestra carpeta
	public static void borrarArchivo() throws IOException {
		String archivosCarpetas = seleccionArchivo("Borrar");
		if (archivosCarpetas == null) {
			return;
		} else {
			File archivo = new File(archivosCarpetas);
			archivo.delete();
		}
	}
	//Funcion para renombrar un archivo
	public static void renombrarArchivo() throws IOException {
		String sp = File.separator;
		String rc = rutaCarpeta("formacion");
		String archivosCarpetas = seleccionArchivo("renombrar");
		if (archivosCarpetas == null) {
			return;
		} else {
			String nn = introduceString("Indique el nuevo nombre del archivo");
			while (controlDeNombre(nn) == false) {
				System.out.println("Nombre no valido");
				nn = introduceString("Intentelo de nuevo ");
			}
			File archivo = new File(archivosCarpetas);
			File newFile = new File(rc + sp + nn);
			archivo.renameTo(newFile);
		}
	}
	//Funcion para obtener la extension de un archivo y saber su tipo
	public static String obtenerExtension(String filename) {
		int tipo = filename.lastIndexOf('.');
		if (tipo == -1) {
			return ("");
		} else {
			return filename.substring(tipo + 1);
		}
	}
	//Funcion para controlar el nombre de un archivo y su correcta extension
	public static Boolean controlDeNombre(String x) {
		String ext = "txt";
		String extension = obtenerExtension(x);
		if (extension.equals(ext) == false) {
			System.out.println("la extension del archivo ha de ser .txt");
			return false;
		} else {
			return true;
		}
	}
	//funcion para seleccionar un archivo en una carpeta
	public static String seleccionArchivo(String dato) throws IOException {
		String[] archivosCarpetas = listarArchivos();
		int k;
		if (archivosCarpetas == null) {
			return null;
		}
		k = pideEntero("que nº de archivo desea " + dato + " : ");
		if (k < 0 | k > archivosCarpetas.length - 1) {
			System.out.println("El nº indicado no existe, vuelta al menu inicial");
			return null;
		}
		return archivosCarpetas[k];
	}
}
