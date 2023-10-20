package co.unquindio.poo.logica;

import java.util.ArrayList;

public class EquipoJugadores {
	private ArrayList<jugadoresC> participantes = new ArrayList<jugadoresC>();
	private String nombreEquipo;
	
	public EquipoJugadores(String nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
	}
	public String getNombreEquipo() {
		return nombreEquipo;
	}
	public ArrayList<jugadoresC> getParticipantes() {
		return participantes;
	}
	public void setParticipantes(jugadoresC jugador1) {
		participantes.add(jugador1);
	}
	
	public void eliminarParticipantes(jugadoresC jugador1) {
		participantes.remove(jugador1);
	}
	
	public String devolverinfoJugadorindex(int index) {
		return participantes.get(index).toString();
	}
	
}
