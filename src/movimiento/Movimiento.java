package movimiento;

import cubos.Cubo;
import minecraft.GPS;


public abstract class Movimiento {

	public abstract void adelante(Cubo[][][] mundo, GPS jugador); //Realiza desplazamiento
	public abstract void atras(GPS jugador); //Cambia orientacion
	public abstract void derecha(GPS jugador); //Cambia orientacion
	public abstract void izquierda(GPS jugador); //Cambia orientacion
}