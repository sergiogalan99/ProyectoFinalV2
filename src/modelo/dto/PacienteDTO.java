package modelo.dto;

import java.io.Serializable;
import java.util.Date;

public class PacienteDTO extends PersonaDTO implements Serializable{

	private Date fechaNacimiento;
	
	public PacienteDTO() {
	}

	public PacienteDTO(String nombre, String apellidos, String direccion, String telefono, Date fechaNacimiento) {
		super(nombre, apellidos, direccion, telefono);
		this.fechaNacimiento = fechaNacimiento;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	

	

}
