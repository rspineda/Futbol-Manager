package es.com.pc_futbol.model;

import java.util.ArrayList;

public class Equipo {

		private String name;
		private String escudo;
		private int anoFundacion;
		private String color;
		private ArrayList<Jugador> jugadores; //similar a--> private Jugador[] jugadores; 
		private DT dt;
		
		
		//gets and sets:
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEscudo() {
			return escudo;
		}
		public void setEscudo(String escudo) {
			this.escudo = escudo;
		}
		public int getAnoFundacion() {
			return anoFundacion;
		}
		public void setAnoFundacion(int anoFundacion) {
			this.anoFundacion = anoFundacion;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public DT getDt() {
			return dt;
		}
		public void setDt(DT dt) {
			this.dt = dt;
		}
		
		
		//agregando jugadores:
		private void addJugador(Jugador jugador) {
			if(jugadores == null) {
				jugadores = new ArrayList<>();
			}
			jugadores.add(jugador);
		}
		
}
