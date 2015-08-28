package mc.com.sintelti;

import java.io.Serializable;

public class PersonaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4039809622008638419L;
	
	private String nombre;
	private String apellidos;
	private String puesto;
	
	public PersonaBean() {
		
	}
	
	public PersonaBean(String nombre, String apellidos, String puesto) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.puesto = puesto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	

}
