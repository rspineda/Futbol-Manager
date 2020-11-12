package es.com.pc_futbol.model;

public class Jugador extends Persona{
		
		//identification:	
		private int numeroCamiseta;
		private boolean capitan;
		private boolean lesionado;
			
		//skills:
		private int velocidad;
		private int regate;
		private int cabeza;
		private int entradas;
			
		//skills mean:
		private float promedio;
			
		//gets and sets:
		public int getNumeroCamiseta() {
			return numeroCamiseta;
		}

		public void setNumeroCamiseta(int numeroCamiseta) {
			this.numeroCamiseta = numeroCamiseta;
		}

		public boolean isCapitan() {
			return capitan;
		}

		public void setCapitan(boolean capitan) {
			this.capitan = capitan;
		}

		public boolean isLesionado() {
			return lesionado;
		}

		public void setLesionado(boolean lesionado) {
			this.lesionado = lesionado;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getRegate() {
			return regate;
		}

		public void setRegate(int regate) {
			this.regate = regate;
		}

		public int getCabeza() {
			return cabeza;
		}

		public void setCabeza(int cabeza) {
			this.cabeza = cabeza;
		}

		public int getEntradas() {
			return entradas;
		}

		public void setEntradas(int entradas) {
			this.entradas = entradas;
		}

		public float getPromedio() {
			return promedio;
		}

		public void setPromedio(float promedio) {
			this.promedio = promedio;
		}
		

}
