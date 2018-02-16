package actividad07.artistas;

/**
 * @author raulgc
 *
 */
public class Artista {
	
	private String dni, nombre, sexo;
	private int añoDeNacimiento;
	
	/**Constructor de la clase Artista
	 * @param dni
	 * @param nombre
	 * @param sexo
	 * @param añoDeNacimiento
	 */
	public Artista(String dni, String nombre, String sexo, int añoDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.sexo = sexo;
		this.añoDeNacimiento = añoDeNacimiento;
	}
	
	public Artista() {
	}

	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getAñoDeNacimiento() {
		return añoDeNacimiento;
	}
	public void setAñoDeNacimiento(int añoDeNacimiento) {
		this.añoDeNacimiento = añoDeNacimiento;
	}
}
