package cubos;

import herramientas.*;

/**
 * 
 * @author team HS
 */
public class Madera extends Cubo {

	public Madera(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}

	@Override
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		// madera o aire
		Cubo cubo = null;
		int gen = CuboHelper.getRandomInt(2);

		if (gen == 0) {
			cubo = new Madera(posX, posY, posZ);

		} else if (gen == 1) {
			cubo = new Aire(posX, posY, posZ);
		}
		return cubo;
	}

	@Override
	public HerramientaStrategy herramienta() {
		return new Hacha();
	}

	@Override
	public boolean afectaGravedad() {
		return false;
	}

}

