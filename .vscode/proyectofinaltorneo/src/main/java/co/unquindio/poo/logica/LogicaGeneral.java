package co.unquindio.poo.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import co.uniquindio.poo.persistencia.*;

import co.edu.uniquindio.poo.Enum.EstadoTorneo;

public class LogicaGeneral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Persistencia persis;
	
	public void crearTorneo(String estadoTorneo,String nombreTorneo,String fehcaInicio,String fechaFinal,int numeroMaxequipos,int limiteEdadparti, double valorInscripcion) {
		LocalDate fechaInicio=LocalDate.parse(fehcaInicio);
		LocalDate fechaFinal1=LocalDate.parse(fechaFinal);
		
		Torneo torneo= new Torneo(estadoTorneo,nombreTorneo,fechaInicio,fechaFinal1,numeroMaxequipos,limiteEdadparti,valorInscripcion);
		persis.agregarTorneo(torneo);
	}
	
	public jueces registroJueces(String Id, String nombrecomplet) {
		jueces juez= new jueces(Id, nombrecomplet);
		return juez;
	}
	public void agendarEnfrentamiento(String nombre,String ubicacion,String estadoEnfrenta, EquipoJugadores equipo1,EquipoJugadores equipo2,String horaenfrenta,String fechaEnfrenta, jueces juez ) {
		LocalDate fechaEnfrenta1= LocalDate.parse(fechaEnfrenta);
		enfrentamientos enfrenta1=new enfrentamientos(nombre,ubicacion,estadoEnfrenta,equipo1,equipo2, fechaEnfrenta1, horaenfrenta, juez);
	}
	public String estadoEnfrentamiento(Torneo torneo) {
		return torneo.getEstadoTorneo();
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
	public ArrayList<enfrentamientos> listadoEnfrentamientosNombre(String nombreEquipo){
		
		return null;
		
	}
	public ArrayList<enfrentamientos> listadoEnfrentamientosJuez(String IDJuez){
		
		return null;
		
	}
}
