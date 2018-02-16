package actividad07.cuentaCorriente;

import java.io.IOException;

/**
 * @author raulgc
 *
 */
public class TestCuenta {

	/**Metodo principal de nuestro programa.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		int s = 0;
		Cuenta[] misCuentas = new Cuenta[2];
		misCuentas[0] = new Cuenta("ES01 0001 0002 34 0000000056", "Juan Garcia Martinez", 125.0);
		misCuentas[1] = new Cuenta("ES02 0002 0003 45 0000000067", "Javier Rueda Martinez", 90.0);

		do {
			System.out.println("¿Que operacion desea realizar? \n" + "1 Consultar el saldo de una cuenta \n"
					+ "2 Ingresar dinero en una cuenta \n" + "3 Sacar dinero de una cuenta \n"
					+ "4 Transferir dinero entre cuentas \n" + "5 Salir");
			s = Utilidades.pedirEntero("Seleccione una opcion del 1 al 5");
			switch (s) {
			case 1:
				Cuenta.mostrarSaldo(misCuentas);
				break;
			case 2:
				misCuentas = Cuenta.ingresarDinero(misCuentas);
				break;
			case 3:
				misCuentas = Cuenta.sacarDinero(misCuentas);
				break;
			case 4:
				misCuentas = Cuenta.realizarTransferencia(misCuentas);
				break;
			case 5:
				System.out.println("Hasta la proxima");
				System.exit(5);
			default:
				System.out.println("Opcion no valida, seleccione otra");
				break;
			}
		} while (s > 0 | s < 6);
	}

}