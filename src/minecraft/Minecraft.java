package minecraft;

import java.util.Random;

import cubos.Aire;
import cubos.Arena;
import cubos.Cubo;
import cubos.Madera;
import cubos.Piedra;
import cubos.Tierra;

/**
 * Clase Principal encargada de generar el mundo.
 * 
 * @author team HS
 */
public class Minecraft {

	public static final int SIZE = 10;

	private Cubo[][][] mundo;
	private Random genran;

	private int cielo;

	public Minecraft() {
		genran = new Random();
		mundo = new Cubo[SIZE][SIZE][SIZE];

		// 25% de la parte de arriba del mundo
		this.cielo = (int) (SIZE * 0.25);
		System.out.println("Cielo: " + cielo);

		this.generarMundo();
	}

	/**
	 * LLena el mundo de cubos.
	 */
	private void generarMundo() {
		String format = "Generated Element for the x=%d, y=%d, z=%d %s";

		for (int i = 0; i < mundo.length; i++) {
			for (int j = 0; j < mundo[i].length; j++) {
				for (int k = 0; k < mundo[j].length; k++) {

					mundo[i][j][k] = generarCubo(i, j, k);
					System.out.println(String.format(format, i, j, k, mundo[i][j][k].getClass()));
				}
			}
		}
	}

	/**
	 * Genera un cubo. TODO: los cubos tienen reglas de posicionamiento.
	 * 
	 * @param posY
	 * @param posZ
	 * @param posX
	 * @return
	 */
	private Cubo generarCubo(int posX, int posY, int posZ) {
		Cubo cubo = null;

		// base
		if (posZ == 0) {
			cubo = new Piedra(posX, posY, posZ);

		} // el cielo
		else if (posZ >= (SIZE - cielo)) {
			cubo = new Aire(posX, posY, posZ);

		} // resto
		else {

			cubo = this.generarCuboConReglas(posX, posY, posZ);
		}

		return cubo;
	}

	private Cubo generarCuboConReglas(int posX, int posY, int posZ) {
		Cubo cubo = null;

		// obtener el elemnto que se encuentra abajo z
		Cubo cuboAbajoZ = mundo[posX][posY][posZ - 1];

		// obtener los posibles elementos que se pueden poner encima de ese
		// elemento
		if (cuboAbajoZ instanceof Piedra) {
			// piedra o arena o tieerra
			int gen = genran.nextInt(3);

			if (gen == 0) {
				cubo = new Piedra(posX, posY, posZ);

			} else if (gen == 1) {
				cubo = new Arena(posX, posY, posZ);

			} else if (gen == 2) {
				cubo = new Tierra(posX, posY, posZ);
			}

		} else if (cuboAbajoZ instanceof Arena) {
			// tierra o arena o aire
			int gen = genran.nextInt(2);

			if (gen == 0) {
				cubo = new Arena(posX, posY, posZ);

			} else if (gen == 1) {
				cubo = new Tierra(posX, posY, posZ);
			}

		} else if (cuboAbajoZ instanceof Tierra) {
			// tierra o madera o aire
			int gen = genran.nextInt(3);

			if (gen == 0) {
				cubo = new Tierra(posX, posY, posZ);

			} else if (gen == 1) {
				cubo = new Madera(posX, posY, posZ);

			} else if (gen == 2) {
				cubo = new Aire(posX, posY, posZ);
			}

		} else if (cuboAbajoZ instanceof Madera) {
			// madera o aire
			int gen = genran.nextInt(2);

			if (gen == 0) {
				cubo = new Madera(posX, posY, posZ);

			} else if (gen == 1) {
				cubo = new Aire(posX, posY, posZ);
			}

		} else if (cuboAbajoZ instanceof Aire) {

			cubo = new Aire(posX, posY, posZ);
		}

		return cubo;
	}

	public static void main(String args[]) {
		new Minecraft();

	}

	public Cubo[][][] getMundo() {
		return this.mundo;
	}

	public int getCielo() {
		return this.cielo;
	}

}
