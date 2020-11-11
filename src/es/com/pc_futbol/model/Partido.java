package es.com.pc_futbol.model;

import java.util.ArrayList;
import java.util.Random;

public class Partido {

	//private static final int GOLES_MAXIMO = 7; //contante de los goles máximo en cada partido
	private Estadio estadio;
	private Equipo local;
	private Equipo visita;
	private int golesLocal;
	private int golesVisita;
	
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
	
	
	//metodo para generar automaticamente goles:
	private int calcularGol(Equipo equipo) {
		
		Random rnd = new Random();
		
		//calculo el promedio de los jugaores del equipo ( para utilizarlo como limite superior del random)
		ArrayList<Jugador> jugadores = equipo.getJugadores();
		int promedio = 0;
		for (Jugador jugador : jugadores) {
			promedio += jugador.getPromedio();
		}
		promedio /= jugadores.size();
		
		return rnd.nextInt(promedio); //los numeros aleatorios serán entre 0 - Promedio(ejm, 6, 5...)
	}
	
	
	public void jugarResultado() {
		
		golesLocal = calcularGol(local);
		golesVisita = calcularGol(visita);
		
		System.out.println("*******************");
		System.out.print(golesLocal+""+local.getName()+"-");
		System.out.print(golesVisita+""+visita.getName());
		
		System.out.println("*******************");
	}
	
}
