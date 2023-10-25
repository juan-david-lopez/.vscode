package co.unquindio.poo.logica;

import java.time.LocalDate;
import java.util.ArrayList;

import co.edu.uniquindio.poo.Enum.EstadoTorneo;

public class LogicaGeneral {
	
	public void crearTorneo() {
		
	}
	
	public void registroJueces(String Id, String nombrecomplet) {
		
	}
	public void agendarEnfrentamiento(LocalDate fechaInicio, LocalDate fechafinal, int numeroParticipantes, int edadMinima, int numeroMaxequipos) {
		
	}
	public String estadoEnfrentamiento(Torneo torneo) {
		
		return null;
		
	}
	public boolean ResultadoEnfrentamiento(String estado, boolean resultado) {
		String estadotorn1=EstadoTorneo.APLAZADO+"";
		String estadotorn2=EstadoTorneo.ENJUEGO+"";
		String estadotorn3=EstadoTorneo.FINALIZADO+"";
		String estadotorn4=EstadoTorneo.PENDIENTE+"";
		boolean centinela=false;
		if(estado.equals(estadotorn3) && resultado) {
			centinela=true;
		}
		else if(estado.equals(estadotorn1) || estado.equals(estadotorn2)
				|| estado.equals(estadotorn4)){
			centinela=false;
		}
		else {
			centinela=false;
		}
		
		return centinela;
		
	}
	public ArrayList<String> listadoEnfrentamientosNombre(String nombreEquipo){
		
		return null;
		
	}
	public ArrayList<String> listadoEnfrentamientosJuez(String IDJuez){
		
		return null;
		
	}
}
