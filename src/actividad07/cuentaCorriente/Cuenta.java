package actividad07.cuentaCorriente;

import java.io.IOException;

/**
 * @author raulgc
 *
 */
public class Cuenta {

	private String numeroCuenta, titular;
	private double saldo;

	/** Constructor de la clase cuenta
	 * @param numeroCuenta
	 * @param titular
	 * @param saldo
	 */
	public Cuenta(String numeroCuenta, String titular, Double saldo) {
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNombreCliente(String titular) {
		this.titular = titular;
	}

	/**
	 * @param Recibe un array de cuentas corrientes x
	 * @return nos devuelve una cuenta del array
	 * @throws IOException
	 */
	public static int seleccionarCuenta(Cuenta[] x) throws IOException {
		for (int i = 0; i < x.length; i++)
			System.out.println("Cuenta " + i + " : " + x[i].getNumeroCuenta());
		int s = Utilidades.pedirEntero("Seleccione una cuenta");
		while (s < 0 | s > x.length - 1) {
			s = Utilidades.pedirEntero("Numero de cuenta erroneo, seleccione otro");
		}
		return s;
	}

	/** Muestra el saldo de una cuenta corriente elegida
	 * @param recibe un array de cuentas corrientes x
	 * @throws IOException
	 */
	public static void mostrarSaldo(Cuenta[] x) throws IOException {
		int c = seleccionarCuenta(x);
		System.out.println(x[c].getSaldo() + "€");
	}

	/**Nos permite ingresar dinero en una cuenta
	 * @param recibe un array de cuentas corrientes x
	 * @return devuelve el array de cuentas con el saldo actualizado
	 * @throws IOException
	 */
	public static Cuenta[] ingresarDinero(Cuenta[] x) throws IOException {
		int c = seleccionarCuenta(x);
		double y = Utilidades.pedirDoble("Indique la cantidad que desea ingresar en la cuenta");
		double z = x[c].getSaldo() + y;
		x[c].setSaldo(z);
		return x;
	}

	/**Funcion para sacar dinero de una cuenta seleccionada
	 * @param recibe un array de cuentas corrientes
	 * @return nos devuelve el array con el saldo actualizado
	 * @throws IOException
	 */
	public static Cuenta[] sacarDinero(Cuenta[] x) throws IOException {
		int c = seleccionarCuenta(x);
		double y = Utilidades.pedirDoble("Indique la cantidad que desea sacar de la cuenta");
		while (y > x[c].getSaldo()) {
			y = Utilidades.pedirDoble("No puedes sacar mas dinero del disponible \n" + "indica otra cantidad");
		}
		double z = x[c].getSaldo() - y;
		x[c].setSaldo(z);
		return x;
	}

	/**Funcion para transferir dinero entre cuentas corrientes
	 * @param recibe un array de cuentas corrientes
	 * @return nos devuelve el array con los saldos actualizados
	 * @throws IOException
	 */
	public static Cuenta[] realizarTransferencia(Cuenta[] x) throws IOException {
		System.out.println("Seleccione la cuenta Origen");
		int c = seleccionarCuenta(x);
		System.out.println("Seleccione la cuenta Destino");
		int d = seleccionarCuenta(x);
		if (c == d) {
			System.out.println("Cuenta de destino igual que la de origen, seleccione otra");
			d = seleccionarCuenta(x);
		}
		double e = Utilidades.pedirDoble("Que cantidad desea transferir");
		while (e < 0 | e > x[c].getSaldo()) {
			System.out.println("No puedes transferir una cantidad negativa o superior al saldo");
			e = Utilidades.pedirDoble("Introduce otra cantidad");
		}
		double var = x[c].getSaldo() - e;
		x[c].setSaldo(var);
		double var2 = x[d].getSaldo() + e;
		x[d].setSaldo(var2);
		return x;
	}
}
