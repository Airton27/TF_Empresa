package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEmpresa;

	@Column(name = "nombreEmpresa", nullable = false, length = 47)
	private String nombreEmpresa;

	@Column(name = "ruc", nullable = false)
	private int ruc;

	@Column(name = "sedeEmpresa", nullable = false, length = 47)
	private String sedeEmpresa;

	@Column(name = "telefonoEmpresa", nullable = false)
	private int telefonoEmpresa;

	@Column(name = "direccionEmpresa", nullable = false, length = 47)
	private String direccionEmpresa;

	@Column(name = "correoEmpresa", nullable = false, length = 47)
	private String correoEmpresa;

	@Column(name = "claveEmpresa", nullable = false, length = 47)
	private String claveEmpresa;

	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empresa(int idEmpresa, String nombreEmpresa, int ruc, String sedeEmpresa, int telefonoEmpresa,
			String direccionEmpresa, String correoEmpresa, String claveEmpresa) {
		super();
		this.idEmpresa = idEmpresa;
		this.nombreEmpresa = nombreEmpresa;
		this.ruc = ruc;
		this.sedeEmpresa = sedeEmpresa;
		this.telefonoEmpresa = telefonoEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.claveEmpresa = claveEmpresa;
	}

	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	public String getSedeEmpresa() {
		return sedeEmpresa;
	}

	public void setSedeEmpresa(String sedeEmpresa) {
		this.sedeEmpresa = sedeEmpresa;
	}

	public int getTelefonoEmpresa() {
		return telefonoEmpresa;
	}

	public void setTelefonoEmpresa(int telefonoEmpresa) {
		this.telefonoEmpresa = telefonoEmpresa;
	}

	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}

	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}

	public String getCorreoEmpresa() {
		return correoEmpresa;
	}

	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}

	public String getClaveEmpresa() {
		return claveEmpresa;
	}

	public void setClaveEmpresa(String claveEmpresa) {
		this.claveEmpresa = claveEmpresa;
	}

}
