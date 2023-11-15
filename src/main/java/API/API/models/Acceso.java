package API.API.models;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;

@Entity
@Table(name = "accesos",schema="gbp_operacional")
public class Acceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acceso",nullable=false)
	private Long id_acceso;
	@Column(name = "codigo_acceso",nullable=false)
	private String codigo_acceso;
	@Column(name = "descripcion_acceso")
	private String descripcion_acceso;
	public Long getId_acceso() {
		return id_acceso;
	}
	public String getCodigo_acceso() {
		return codigo_acceso;
	}
	public String getDescripcion_acceso() {
		return descripcion_acceso;
	}
	public void setId_acceso(Long id_acceso) {
		this.id_acceso = id_acceso;
	}
	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}
	public void setDescripcion_acceso(String descripcion_acceso) {
		this.descripcion_acceso = descripcion_acceso;
	}
	
}
