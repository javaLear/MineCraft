package cubos;

import herramientas.*;

/**
 * 
 * @author team HS
 */
public class Piedra extends Cubo {

	public Piedra(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}

	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		Cubo cubo = null;
		int gen = CuboHelper.getRandomInt(3);

		if (gen == 0) {
			cubo = new Piedra(posX, posY, posZ);

		} else if (gen == 1) {
			cubo = new Arena(posX, posY, posZ);

		} else if (gen == 2) {
			cubo = new Tierra(posX, posY, posZ);
		}
		return cubo;
	}

	@Override
	public HerramientaStrategy herramienta() {
		return new Pico();
	}

	@Override
	public boolean afectaGravedad() {
		return false;
	}

}

