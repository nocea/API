package API.API.models;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="usuarios", schema="gbp_operacional")
public class Usuario {	
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario", nullable=false)
	private long id_usuario;
	
	@Column(name="dni_usuario", nullable=false)
	private String dni_usuario;

	@Column(name="nombre_usuario")
	private String nombre_usuario;
	
	@Column(name="apellidos_usuario")
	private String apellidos_usuario;
	
	@Column(name="tlf_usuario")
	private String tlf_usuario;

	public long getId_usuario() {
		return id_usuario;
	}

	public String getDni_usuario() {
		return dni_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public String getApellidos_usuario() {
		return apellidos_usuario;
	}

	public String getTlf_usuario() {
		return tlf_usuario;
	}

	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}

	public void setTlf_usuario(String tlf_usuario) {
		this.tlf_usuario = tlf_usuario;
	}
	
		
}