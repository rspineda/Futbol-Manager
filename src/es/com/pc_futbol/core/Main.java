package es.com.pc_futbol.core;

import es.com.pc_futbol.model.Equipo;
import es.com.pc_futbol.model.Estadio;
import es.com.pc_futbol.model.Jornada;
import es.com.pc_futbol.model.Jugador;
import es.com.pc_futbol.model.Partido;
import es.com.pc_futbol.model.Torneo;

public class Main {
	public static void main(String[] args) {
		
		//torneo
		Torneo torneo = new Torneo();
		torneo.setNombre("La Liga");
		
		Jornada fecha = new Jornada(1);
		//fecha.setNumero(1); //si no lo hubiera hecho con el constructor.
		torneo.addFecha(fecha); //agregada la primera fecha del torneo
		
		//Equipos:
		Equipo equipo1 = new Equipo();
		equipo1.setName("Real Madrid");
		
		Equipo equipo2 = new Equipo();
		equipo2.setName("Barcelona");
		
		//Creo los 7 jugadores:
		for (int i = 0; i < 7; i++) {
			Jugador jug = new Jugador();
			jug.setNombre(i+"_MADRID");
			jug.setPromedio(9); //le agrego un promedio a los jugadores.
			equipo1.addJugador(jug); //agrego el jugador al equipo
		}
		for (int i = 0; i < 7; i++) {
			Jugador jug = new Jugador();
			jug.setNombre(i+"_BARCELONA");
			jug.setPromedio(7);
			equipo2.addJugador(jug); //agrego el jugador al equipo
		}
		
		//Estadio:
		Estadio estadio = new Estadio();
		estadio.setNombre("Santiago Bernabeu");
		
		//Partido:
		Partido partido = new Partido();
		partido.setEstadio(estadio);
		partido.setLocal(equipo1);
		partido.setVisita(equipo2);
		
		partido.jugarResultado();
	}
}
