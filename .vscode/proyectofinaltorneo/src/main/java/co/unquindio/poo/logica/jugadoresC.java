package co.unquindio.poo.logica;

public class jugadoresC extends Persona{

	private String posicion;
	private String NombreEquipo;
	
	public jugadoresC(String ID, String nombreCompleto, String posicion, String NombreEquipo) {
		super(ID, nombreCompleto);
		this.setPosicion(posicion);
		this.setNombreEquipo(NombreEquipo);
		
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public String getNombreEquipo() {
		return NombreEquipo;
	}
	public void setNombreEquipo(String nombreEquipo) {
		NombreEquipo = nombreEquipo;
	}
	@Override
	public String toString() {
		return " la posicion del jugador es: "+this.posicion+" el nombre del equipo es: "+this.NombreEquipo+" el nombre del jugador es: "+this.getNombreCompleto()+
				" la identificacion del jugador es: "+this.getID();
	}
	

}
