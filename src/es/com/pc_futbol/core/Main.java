package es.com.pc_futbol.core;

import es.com.pc_futbol.model.Equipo;
import es.com.pc_futbol.model.Fecha;
import es.com.pc_futbol.model.Torneo;

public class Main {
	public static void main(String[] args) {
		
		Torneo torneo = new Torneo();
		torneo.setNombre("La Liga");
		
		Fecha fecha = new Fecha(1);
		//fecha.setNumero(1); //lo podría hacer así pero en lugar de eso lo hago con el constructor.
		
		torneo.addFecha(fecha); //agregada la primera fecha del torneo
		
		Equipo equipo1 = new Equipo();
		equipo.setName("Real Madrid");
		
		Equipo equipo2 = new Equipo();
		equipo2.setName("Barcelona");
		
	}
}
