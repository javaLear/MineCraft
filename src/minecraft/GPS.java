package minecraft;

import cubos.*;

public class GPS{
	
	private Cubo posicion; //(x,y,z)
	private int sentido; // [-1,1]
	private char direccion; // ['X','Y']
	
	public GPS(Cubo pos, int sen, char dir){
		this.posicion = pos;
		this.sentido = sen;
		this.direccion = dir;
	}
	
	public Cubo getPosicion() {
		return posicion;
	}
	public void setPosicion(Cubo posicion) {
		this.posicion = posicion;
	}
	public int getSentido() {
		return sentido;
	}
	public void setSentido(int sentido) {
		this.sentido = sentido;
	}
	public char getDireccion() {
		return direccion;
	}
	public void setDireccion(char direccion) {
		this.direccion = direccion;
	}
	
}