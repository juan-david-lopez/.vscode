package co.unquindio.poo.logica;

import java.time.LocalDate;

public class enfrentamientos {
	
	private LogicaGeneral logic;
	private String nombre;
	private String ubicacion;
	private jueces juez;
	private String horaenfrenta;
	private LocalDate fechaEnfrenta;
	private EquipoJugadores equipo1;
	private EquipoJugadores equipo2;
	private int puntosEquipo1;
	private int puntosEquipo2;
	private String estadoEnfrenta;

	public enfrentamientos(String nombre,String ubicacion,String estadoEnfrenta, EquipoJugadores equipo1,EquipoJugadores equipo2,LocalDate fechaEnfrenta,String horaenfrenta,jueces juez ) {
		this.nombre=nombre;
		this.ubicacion=ubicacion;
		this.estadoEnfrenta=estadoEnfrenta;
		this.equipo1=equipo1;
		this.equipo2=equipo2;
		this.estadoEnfrenta=estadoEnfrenta;
		this.fechaEnfrenta=fechaEnfrenta;
		this.horaenfrenta=horaenfrenta;
		this.juez=juez;
	}
	public jueces getJuez() {
		return juez;
	}
	public void setJuez1(jueces juez) {
		this.juez = juez;
	}
	public int getPuntosEquipo2() {
		return puntosEquipo2;
	}
	
	public int getPuntosEquipo1() {
		return puntosEquipo1;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getHoraenfrenta() {
		return horaenfrenta;
	}
	public void setHoraenfrenta(String horaenfrenta) {
		this.horaenfrenta = horaenfrenta;
	}
	public EquipoJugadores getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(EquipoJugadores equipo1) {
		this.equipo1 = equipo1;
	}
	public LocalDate getFechaEnfrenta() {
		return fechaEnfrenta;
	}
	public void setFechaEnfrenta(LocalDate fechaEnfrenta) {
		this.fechaEnfrenta = fechaEnfrenta;
	}
	public EquipoJugadores getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(EquipoJugadores equipo2) {
		this.equipo2 = equipo2;
	}
	
	public String getEstadoEnfrenta() {
		return estadoEnfrenta;
	}
	public void setEstadoEnfrenta(String estadoEnfrenta) {
		this.estadoEnfrenta = estadoEnfrenta;
	}
	public void calcularPuntosEquipo1(boolean resultado) {
		boolean centi=logic.ResultadoEnfrentamiento(estadoEnfrenta, resultado);
		if(centi) {
			puntosEquipo1++;
		}
		else {
			puntosEquipo1--;
		}
	}
	public void calcularPuntosEquipo2(boolean resultado) {
		boolean centi=logic.ResultadoEnfrentamiento(estadoEnfrenta, resultado);
		if(centi) {
			puntosEquipo2++;
		}
		else {
			puntosEquipo2--;
		}
		
	}
	@Override
	public String toString() {
		
		return " el nombre del equipo es: "+this.getNombre()+" : "+this.getUbicacion()+" : "+this.getEstadoEnfrenta()+" : "+this.getHoraenfrenta()+" : "+this.getJuez()+" : "+this.getEquipo1()
		+" : "+this.getEquipo2()+" : "+this.getPuntosEquipo1()+" : "+this.getPuntosEquipo2();
		
	}
}

