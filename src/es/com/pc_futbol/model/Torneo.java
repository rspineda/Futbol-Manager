package es.com.pc_futbol.model;

import java.util.ArrayList;

public class Torneo {
	
	private String nombre;
	private String descripcion;
	private boolean nacional;
	private ArrayList<Jornada> fechas;
	
	//gets and sets:
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isNacional() {
		return nacional;
	}
	public void setNacional(boolean nacional) {
		this.nacional = nacional;
	}
	
	//agregando fechas:
	public void addFecha(Jornada fecha) {
		if (fechas == null) {
			fechas = new ArrayList<>();
		}
		fechas.add(fecha);
	}
		
}
