package minecraft;

import java.util.LinkedList;
import herramientas.*;
import cubos.*;
import movimiento.*;

public class Jugador {
	
	private static Jugador jugador;
	private HerramientaStrategy herramienta;
	private LinkedList<Cubo> almacen = new LinkedList<Cubo>();
	private GPS ubicacion;
	private Movimiento mover;

	private Jugador(){
		
		this.ubicacion = new GPS(new Aire(0,0,9), 1, 'X');
	}
	
	public static Jugador getJugador(){
		if(jugador == null){
			jugador = new Jugador();
		}
		return jugador;
	}

	public HerramientaStrategy getHerramienta() {
		return herramienta;
	}

	public void tomar(HerramientaStrategy herramienta) {
		if (this.herramienta == null) {
			this.herramienta = herramienta;
			System.out.println("Tengo una nueva herramienta .." + herramienta.getClass().getSimpleName());
		} else {
			System.out.println("Tengo las manos ocupadas");
		}
	}

	public void trabajar() {
		try {
			Cubo cubo = getCuboTrabajar();
			if(this.herramienta.utilizar(cubo)){
				almacen.add(cubo);
				System.out.println("Guardo cubo de "+ cubo.getClass().getSimpleName()+ " en almacen.");
			}
		} catch (NullPointerException e) {
			System.out.println("No tengo herramienta");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No puedes trabjar aqui. [Limite del Mundo]");
		}
	}

	public void guardarHerramienta() {
		try {
			if (this.herramienta.getEstado().equals("limpia")) {
				this.herramienta.guardar();
				this.herramienta = null;
			} else {
				System.out.println("Primero tengo que limpiar la herramienta");
			}
		} catch (NullPointerException e) {
			System.out.println("No tengo herramienta");
		}
	}

	public void limpiarHerramienta() {
		try {
			this.herramienta.limpiar();
		} catch (NullPointerException e) {
			System.out.println("No tengo herramienta");
		}
	}

	public void informar() {
		try {
			String estado = this.herramienta.getEstado();
			System.out.println("La herramienta esta " + estado);
		} catch (NullPointerException e) {
			System.out.println("No tengo herramienta");
		}

	}
	
	private Cubo getCuboTrabajar(){
		int x = this.ubicacion.getPosicion().getPosX();
		int y = this.ubicacion.getPosicion().getPosY();
		int z = this.ubicacion.getPosicion().getPosZ();
		
		if(this.ubicacion.getDireccion() == 'X'){
			x = x + this.ubicacion.getSentido();
		}else{
			y = y + this.ubicacion.getSentido();
		}
		
		return Mundo.getInstance().getCubo(x, y, z);
	}

	private void Movimiento(){
		if(this.ubicacion.getDireccion() == 'X'){
			this.mover = new X();
		}else{
			this.mover = new X();
		}
	}
	
	public void avanzar(){
		try {
			Movimiento();
			this.mover.adelante(this.ubicacion);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("No puedes avanzar. [Limite del Mundo]");
		}
	}
	
	public void girarAtras(){
		Movimiento();
		this.mover.atras(this.ubicacion);
	}
	
	public void girarDerecha(){
		Movimiento();
		this.mover.derecha(this.ubicacion);
	}
	
	public void girarIzquierda(){
		Movimiento();
		this.mover.izquierda(this.ubicacion);
	}
	
}


