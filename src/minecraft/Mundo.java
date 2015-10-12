package minecraft;

import cubos.Aire;
import cubos.Cubo;
import cubos.Piedra;

public class Mundo {

	private static Mundo instance;
	public static final int SIZE = 10;

	private Cubo[][][] cubos;

	private int cielo;

	private Mundo() {
		cubos = new Cubo[SIZE][SIZE][SIZE];

		// 25% de la parte de arriba del mundo
		this.cielo = (int) (SIZE * 0.25);
		System.out.println("Cielo: " + cielo);

		this.generarMundo();
	}

	public static Mundo getInstance() {
		if (instance == null) {
			instance = new Mundo();
		}
		return instance;
	}

	/**
	 * LLena el mundo de cubos.
	 */
	private void generarMundo() {
		String format = "Generated Element for the x=%d, y=%d, z=%d %s";

		for (int i = 0; i < cubos.length; i++) {
			for (int j = 0; j < cubos[i].length; j++) {
				for (int k = 0; k < cubos[i][j].length; k++) {

					cubos[i][j][k] = generarCubo(i, j, k);
					System.out.println(String.format(format, i, j, k, cubos[i][j][k].getClass()));
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
			Cubo cuboAbajoZ = cubos[posX][posY][posZ - 1];
			cubo = cuboAbajoZ.getCuboPosible(posX, posY, posZ);
		}

		return cubo;
	}

	public Cubo[][][] getCubos() {
		return this.cubos;
	}

	public int getCielo() {
		return this.cielo;
	}

}
