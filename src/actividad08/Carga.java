package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Carga extends Vehiculo {
	
	private int extra = 20;
	double pma;
	
	/**Constructor de la clase Carga.
	 * @param matricula
	 * @param pma
	 */
	public Carga(String matricula, double pma) {
		super(matricula);
		this.pma = pma;
	}
	
	/* Funcion para calcular el alquiler de un Carga
	 * @see actividad08.Vehiculo#getAlquiler(int)
	 */
	@Override
	public double getAlquiler(){
		double total = super.getAlquilerDiario() * super.getDias() + (extra * pma);
		return total;
	}
}
