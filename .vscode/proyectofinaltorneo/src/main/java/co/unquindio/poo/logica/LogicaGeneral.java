package co.unquindio.poo.logica;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import co.uniquindio.poo.persistencia.*;

import co.edu.uniquindio.poo.Enum.EstadoTorneo;
import co.edu.uniquindio.poo.Enum.Localidades;
import co.edu.uniquindio.poo.Enum.TipoGeneroT;

public class LogicaGeneral implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Persistencia persis;
	
	public Torneo crearTorneo(String estadoTorneo,String nombreTorneo,String fehcaInicio,String fechaFinal,int numeroMaxequipos,int limiteEdadparti, double valorInscripcion) {
		LocalDate fechaInicio=LocalDate.parse(fehcaInicio);
		LocalDate fechaFinal1=LocalDate.parse(fechaFinal);
		
		Torneo torneo= new Torneo(estadoTorneo,nombreTorneo,fechaInicio,fechaFinal1,numeroMaxequipos,limiteEdadparti,valorInscripcion);
		persis.agregarTorneo(torneo);
		return torneo;
	}
	
	public jueces registroJueces(String Id, String nombrecomplet) {
		jueces juez= new jueces(Id, nombrecomplet);
		return juez;
	}
	public enfrentamientos agendarEnfrentamiento(String nombre,String ubicacion,String estadoEnfrenta, EquipoJugadores equipo1,EquipoJugadores equipo2,String horaenfrenta,String fechaEnfrenta, jueces juez ) {
		LocalDate fechaEnfrenta1= LocalDate.parse(fechaEnfrenta);
		enfrentamientos enfrenta1=new enfrentamientos(nombre,ubicacion,estadoEnfrenta,equipo1,equipo2, fechaEnfrenta1, horaenfrenta, juez);
		return enfrenta1;
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
	public int tipoGenro(String gener) {
		int centinela=0;
		String gener1=TipoGeneroT.HOMBRES+"";
		String gener2=TipoGeneroT.MIXTOS+"";
		String gener3=TipoGeneroT.MUJERES+"";
		if(gener.equals(gener1)) {
			centinela=1;
		}
		else if(gener.equals(gener2)) {
			centinela=2;
		}
		else if(gener.equals(gener3)) {
			centinela=3;
		}
		return centinela;
	}
	public int localidaDes(String local) {
		int centinela=0;
		String localida1=""+Localidades.LOCAL;
		String localida2=""+Localidades.MUNDIAL;
		String localida3=""+Localidades.NACIONAL;
		String localida4=""+Localidades.REGIONAL;
		if(local.equals(localida1)) {
			centinela=1;
		}
		else if(local.equals(localida2)) {
			centinela=2;
		}
		else if(local.equals(localida3)) {
			centinela=3;
		}
		else if(local.equals(localida4)) {
			centinela=4;
		}
		
		return centinela;
	}
	public ArrayList<enfrentamientos> listadoEnfrentamientosNombre(ArrayList<enfrentamientos> enfrentados){
		ArrayList<enfrentamientos> prueba = new ArrayList<>();
		char letra='a';
		int size=enfrentados.size();
		for (enfrentamientos enfrentamientos : enfrentados) {
		if(enfrentamientos.getNombre().startsWith(letra+"")) {
		prueba.add(size,enfrentamientos);	
		}
		else {
			letra++;
		}
	}
	return prueba;	
		
	}
	public ArrayList<enfrentamientos> listadoEnfrentamientosJuez(ArrayList<enfrentamientos> enfrentados){
		ArrayList<enfrentamientos> prueba = new ArrayList<>();
		for (int i = 0; i < enfrentados.size()-1; i++) {
			String primer=enfrentados.get(i).getJuez().getID();
			String second=enfrentados.get(i+1).getJuez().getID();
			if(primer.compareTo(second)>0) {
				prueba.add(enfrentados.size(),enfrentados.get(i));
			}
			else {
				prueba.add(enfrentados.size(),enfrentados.get(i+1));
			}
			
		}
		return prueba;
		
	}

	

}
