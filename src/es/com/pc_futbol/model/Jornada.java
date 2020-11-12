package es.com.pc_futbol.model;

import java.util.ArrayList;

public class Jornada {

	private int numero;
	private boolean fechaFifa;
	private ArrayList<Partido> partidos;
	
	//método constructor de Fecha  (mismo nombre que la clase y no devuelve nada)
	public Jornada(int numero) {
		this.numero = numero;
	}
	
	
	//gets and sets:
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public boolean isFechaFifa() {
		return fechaFifa;
	}
	public void setFechaFifa(boolean fechaFifa) {
		this.fechaFifa = fechaFifa;
	}
	
	//agregando fechas:
	public void addPartidos(Partido partido) {
		if(partidos == null) {
			partidos = new ArrayList<>();
		}
		partidos.add(partido);
	}
	
}
