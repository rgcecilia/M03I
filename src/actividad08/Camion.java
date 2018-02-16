package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Camion extends Carga {
	
	private int fijo = 40;
	
	/**Constructor de la clase Camion.
	 * @param matricula
	 * @param pma
	 */
	public Camion(String matricula, double pma) {
		super(matricula, pma);
		this.pma = pma;
	}

	/* Funcion para calcular el alquiler de un Camion
	 * @see actividad08.Carga#getAlquiler(int)
	 */
	@Override
	public double getAlquiler(){
		double total = super.getAlquiler() + fijo;
		return total;
	}
}
