package gestion.psp.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PSP_Actividad")
public class psp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long idPSP;
	private String nombre;
	private String correo;
	private String telefono;
	private String tipoContratacion;
	private Double montoEconomico;
	private String tipoDocumento;
	private String descripcion;
	private Date fechaInicio;
	private int progreso;
	private String estado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getIdPSP() {
		return idPSP;
	}
	public void setIdPSP(Long idPSP) {
		this.idPSP = idPSP;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getTipoContratacion() {
		return tipoContratacion;
	}
	public void setTipoContratacion(String tipoContratacion) {
		this.tipoContratacion = tipoContratacion;
	}
	public Double getMontoEconomico() {
		return montoEconomico;
	}
	public void setMontoEconomico(Double montoEconomico) {
		this.montoEconomico = montoEconomico;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public int getProgreso() {
		return progreso;
	}
	public void setProgreso(int progreso) {
		this.progreso = progreso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	

}
