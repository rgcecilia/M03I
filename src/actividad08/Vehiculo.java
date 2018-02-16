package actividad08;

/**
 * @author Raúl Gutiérrez Cecilia
 *
 */
public abstract class Vehiculo implements Ivehiculo {

	private String matricula;
	private int dias;

	/** Constructor de la clase
	 * @param matricula, matricula del vehiculo
	 */
	public Vehiculo(String matricula){
		this.matricula = matricula;
	}
	
	@Override
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
		
	}
	/* Funcion para calcular el alquiler de un vehiculo.
	 * @see actividad08.Ivehiculo#getAlquiler(int)
	 */
	@Override
	public abstract double getAlquiler();
	
	public double getAlquilerDiario(){
		return 50;
	}

}
