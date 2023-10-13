package co.unquindio.poo.logica;

 public abstract class Persona {
	public Persona(String ID, String nombreCompleto) {
		this.ID=ID;
		this.NombreCompleto=nombreCompleto;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNombreCompleto() {
		return NombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		NombreCompleto = nombreCompleto;
	}
	public boolean isActivo() {
		return Activo;
	}
	public void setActivo(boolean activo) {
		Activo = activo;
	}
	private String ID; 
	private String NombreCompleto;
	private String otraCosa;
	private boolean Activo;
}
