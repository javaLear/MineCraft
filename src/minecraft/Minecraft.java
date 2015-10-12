package minecraft;

import cubos.Arena;
import herramientas.Pala;
import herramientas.Pico;

/**
 * Clase Principal encargada de generar el mundo.
 * 
 * @author team HS
 */
public class Minecraft {

	public static void main(String args[]) {
		// Minecraft minecraft = new Minecraft();
		Jugador jugador = Jugador.getJugador();
		jugador.trabajar(new Arena(1, 0, 0));
		jugador.tomar(new Pico());
		jugador.tomar(new Pala());
		jugador.guardarHerramienta();
		jugador.tomar(new Pala());
		jugador.trabajar(new Arena(1, 0, 0));
		jugador.guardarHerramienta();
		jugador.limpiarHerramienta();
		jugador.guardarHerramienta();
	}

}
