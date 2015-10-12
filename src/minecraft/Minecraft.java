package minecraft;

import cubos.Aire;
import cubos.Cubo;
import cubos.Piedra;

/**
 * Clase Principal encargada de generar el mundo.
 * 
 * @author team HS
 */
public class Minecraft {

	public static final int SIZE = 10;

	private Cubo[][][] mundo;

	private int cielo;

	public Minecraft() {
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
				for (int k = 0; k < mundo[i][j].length; k++) {

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

		// base o piso
		if (posZ == 0) {
			cubo = new Piedra(posX, posY, posZ);

		} // el cielo
		else if (posZ >= (SIZE - cielo)) {
			cubo = new Aire(posX, posY, posZ);

		} // resto
		else {
			Cubo cuboAbajoZ = mundo[posX][posY][posZ - 1];
			cubo = cuboAbajoZ.getCuboPosible(posX, posY, posZ);
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
