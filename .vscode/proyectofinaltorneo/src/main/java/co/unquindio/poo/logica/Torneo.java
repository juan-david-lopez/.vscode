package co.unquindio.poo.logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Torneo {
	private String estadoTorneo;
	private String nombreTorneo;
	private LocalDate fehcaInicio;
	private LocalDate fechaFinal;
	private int numeroMaxequipos;
	private int limiteEdadparti;
	private double valorInscripcion;
	private enfrentamientos enfrentamiento;
	private ArrayList<enfrentamientos> enfrentados;
	public Torneo(String estadoTorneo,String nombreTorneo,LocalDate fehcaInicio,LocalDate fechaFinal,int numeroMaxequipos,int limiteEdadparti, double valorInscripcion) {
		this.estadoTorneo=estadoTorneo;
		this.nombreTorneo=nombreTorneo;
		this.fehcaInicio=fehcaInicio;
		this.fechaFinal=fechaFinal;
		this.numeroMaxequipos=numeroMaxequipos;
		this.limiteEdadparti=limiteEdadparti;
		this.valorInscripcion=valorInscripcion;
	}
	public double getValorInscripcion() {
		return valorInscripcion;
	}
	public void setValorInscripcion(double valorInscripcion) {
		this.valorInscripcion = valorInscripcion;
	}
	public int getLimiteEdadparti() {
		return limiteEdadparti;
	}
	public void setLimiteEdadparti(int limiteEdadparti) {
		this.limiteEdadparti = limiteEdadparti;
	}
	public int getNumeroMaxequipos() {
		return numeroMaxequipos;
	}
	public void setNumeroMaxequipos(int numeroMaxequipos) {
		this.numeroMaxequipos = numeroMaxequipos;
	}
	public LocalDate getFehcaInicio() {
		return fehcaInicio;
	}
	public void setFehcaInicio(LocalDate fehcaInicio) {
		this.fehcaInicio = fehcaInicio;
	}
	public LocalDate getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public String getNombreTorneo() {
		return nombreTorneo;
	}
	public void setNombreTorneo(String nombreTorneo) {
		this.nombreTorneo = nombreTorneo;
	}
	public String getEstadoTorneo() {
		return estadoTorneo;
	}
	public void setEstadoTorneo(String estadoTorneo) {
		this.estadoTorneo = estadoTorneo;
	}
	public void terminarTorneo() {
		
	}
	@Override
	public String toString() {
		return " el nombre del torneo: "+this.nombreTorneo+" el estado del torneo: "+this.estadoTorneo+" la fecha final : "+this.fechaFinal+" la fecha de inicio: "+this.fehcaInicio+"n\"+"
				+ this.enfrentamiento.toString();
		
	}
	public enfrentamientos getEnfrentamiento() {
		return enfrentamiento;
	}
	public void setEnfrentamiento(enfrentamientos enfrentamiento) {
		this.enfrentamiento = enfrentamiento;
		enfrentados.add(enfrentamiento);
	}
	public ArrayList<enfrentamientos> getEnfrentados() {
		return enfrentados;
	}
}
