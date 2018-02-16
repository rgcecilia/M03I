package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public interface Ivehiculo {
	
	/**Funcion para calcular el alquiler de un vehiculo.
	 * @return Precio del alquiler del vehiculo.
	 */
	public double getAlquiler();
	
	/**
	 * @return La matricula de un vehiculo.
	 */
	public String getMatricula();
	
	
	/**
	 * @param dias
	 */
	public void setDias(int dias);

}
