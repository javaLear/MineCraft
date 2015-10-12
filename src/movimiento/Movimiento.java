package movimiento;

import minecraft.GPS;


public abstract class Movimiento {

	public abstract void adelante(GPS jugador); //Realiza desplazamiento
	public abstract void atras(GPS jugador); //Cambia orientacion
	public abstract void derecha(GPS jugador); //Cambia orientacion
	public abstract void izquierda(GPS jugador); //Cambia orientacion

}