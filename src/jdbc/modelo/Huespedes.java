package jdbc.modelo;

import java.sql.Date;
import java.time.LocalDate;

public class Huespedes {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private LocalDate fecha_nacimiento;
	private String nacionalidad;
	private String telefono;
	private Integer idReserva;
	
	
	public Huespedes(String nombre, String apellido, LocalDate fecha_nacimiento, String nacionalidad, String telefono,
			Integer idReserva) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}




	public Huespedes(Integer id, String nombre, String apellido, LocalDate fecha_nacimiento, String nacionalidad,
			String telefono, Integer idReserva) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecha_nacimiento = fecha_nacimiento;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.idReserva = idReserva;
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}


	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public Integer getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	
	 
	

}
