package minecraft;

import java.util.Random;
import herramientas.*;
import cubos.*;

public class Minecraft {

	private Cubo[][][] mundo;
	private Random genran;
	
	public Minecraft() {
		genran = new Random();
		mundo = new Cubo[100][100][100];
		
		this.generarMundo();	
	}
	
	private void generarMundo() {
		String format = "Generated Element for the x=%d, y=%d, z=%d %s";
		
		for (int i = 0; i < mundo.length; i++) {
			for (int j = 0; j < mundo[i].length; j++) {
				for (int k = 0; k < mundo[j].length; k++) {
					
					mundo[i][j][k] = generarCubo(i, j, k);
					System.out.println(String.format(format, i, j, k, mundo[i][j][k].getClass() ));
				}
			}
		}
	}
	
	private Cubo generarCubo(int posX, int poxY, int posZ) {
		Cubo cubo = null;
		int intgen = genran.nextInt(5);
		
		if (intgen == 0) {
			cubo = new Aire(posX, poxY, posZ);
			
		} else if (intgen == 1) {
			cubo = new Arena(posX, poxY, posZ);
			
		} else if (intgen == 2) {
			cubo = new Madera(posX, poxY, posZ);
			
		} else if (intgen == 3) {
			cubo = new Piedra(posX, poxY, posZ);
			
		} else {
			//4
			cubo = new Tierra(posX, poxY, posZ);
		}
		
		return cubo;
	}

	public static void main(String args[]) {
		//Minecraft minecraft = new Minecraft();
		Jugador jugador = Jugador.getJugador();
		jugador.trabajar(new Arena(1,0,0));
		jugador.tomar(new Pico());
		jugador.tomar(new Pala());
		jugador.guardarHerramienta();
		jugador.tomar(new Pala());
		jugador.trabajar(new Arena(1,0,0));
		jugador.guardarHerramienta();
		jugador.limpiarHerramienta();
		jugador.guardarHerramienta();

	}
	
}
