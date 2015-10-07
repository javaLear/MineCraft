package minecraft;

import herramientas.HerramientaStrategy;

public class Jugador {
	
	private static Jugador jugador;
	private HerramientaStrategy herramienta;
	//private LinkedList<Cubo> mochila = new LinkedList<Cubo>();
	
	private Jugador(){
		
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
		if(this.herramienta == null){
			this.herramienta = herramienta;
			System.out.println("Tengo una nueva herramienta .." + herramienta.getClass().getSimpleName());
		}else{
			System.out.println("Tengo las manos ocupadas");
		}
	}

	public void trabajar() {
		try {
			this.herramienta.utilizar();
		} catch (NullPointerException e) {
			System.out.println("No tengo herramienta");
		}
	}

	public void guardarHerramienta() {
		try {
			if(this.herramienta.getEstado().equals("limpia")){				
				this.herramienta.guardar();
				this.herramienta = null;
			}else{
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
	
}