package co.unquindio.poo.logica;

import java.util.ArrayList;

import co.edu.uniquindio.poo.Enum.EstadoTorneo;

public class LogicaGeneral {
	
	public void crearTorneo() {
		
	}
	
	public void registroJueces(String Id, String nombrecomplet) {
		
	}
	public void agendarEnfrentamiento() {
		
	}
	public boolean estadoEnfrentamiento() {
		
		return false;
		
	}
	public boolean ResultadoEnfrentamiento(String estado, boolean resultado) {
		String estadotorn1=EstadoTorneo.APLAZADO+"";
		String estadotorn2=EstadoTorneo.ENJUEGO+"";
		String estadotorn3=EstadoTorneo.FINALIZADO+"";
		String estadotorn4=EstadoTorneo.PENDIENTE+"";
		if(estado.equals(estadotorn1) && resultado) {
			return false;
		}
		else if(estado.equals(estadotorn2)) {
			return ;
		}
		else if(estado.equals(estadotorn3)) {
			return ;
		}
		else {
			return ;
		}
		
	}
	public ArrayList<String> listadoEnfrentamientosNombre(String nombreEquipo){
		
		return null;
		
	}
	public ArrayList<String> listadoEnfrentamientosJuez(String ID){
		
		return null;
		
	}
}
