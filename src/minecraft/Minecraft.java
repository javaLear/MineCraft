package minecraft;

import herramientas.Pala;
import herramientas.Pico;


/**
 * Clase Principal encargada de generar el mundo.
 * 
 * @author team HS
 */
public class Minecraft {

	public static void main(String args[]) {

		Mundo mundo = Mundo.getInstance();
		Jugador jugador = Jugador.getJugador();
		
		jugador.trabajar();
		jugador.tomar(new Pico());
		
		jugador.trabajar();
		jugador.avanzar();
		jugador.girarAtras();
		jugador.avanzar();
		jugador.trabajar();
		jugador.guardarHerramienta();
		
		jugador.tomar(new Pala());
		jugador.trabajar();
		jugador.avanzar();
		jugador.trabajar();
		jugador.guardarHerramienta();
		
		jugador.limpiarHerramienta();
		jugador.guardarHerramienta();
	}
}
