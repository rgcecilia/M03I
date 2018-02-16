package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public class Coche extends Vehiculo {
	
	private int plazas;
	private double suplemento = 1.5;

	/**Constructor de la clase coche.
	 * @param matricula
	 * @param plazas
	 */
	public Coche(String matricula, int plazas) {
		super(matricula);
		this.plazas = plazas;
	}

	/* Funcion para calcular el alquiler de un coche
	 * @see actividad08.Vehiculo#getAlquiler(int)
	 */
	@Override
	public double getAlquiler(){
		double total = super.getAlquilerDiario() * super.getDias()  + (suplemento * plazas) * super.getDias();
		return total;
	}

}