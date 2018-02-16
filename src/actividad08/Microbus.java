package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Microbus extends Vehiculo {

	private int plazas;
	private double suplemento = 2;
	
	/**Constructor de la clase Microbus.
	 * @param matricula
	 * @param plazas
	 */
	public Microbus(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
	}

	/* Funcion para calcular el alquiler de un Microbus.
	 * @see actividad08.Vehiculo#getAlquiler(int)
	 */
	@Override
	public double getAlquiler(){
		double total = super.getAlquilerDiario() * super.getDias() + (suplemento * plazas);
		return total;
	}

}
