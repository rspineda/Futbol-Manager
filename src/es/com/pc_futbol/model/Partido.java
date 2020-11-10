package es.com.pc_futbol.model;

public class Partido {

	private Estadio estadio;
	private Equipo local;
	private Equipo visita;
	
	//gets and sets:
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisita() {
		return visita;
	}
	public void setVisita(Equipo visita) {
		this.visita = visita;
	}	
	
}
