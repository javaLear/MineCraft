package cubos;

import herramientas.*;

/**
 * 
 * @author team HS
 */
public class Arena extends Cubo {
	public Arena(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}

	@Override
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		Cubo cubo = null;
		int gen = CuboHelper.getRandomInt(2);

		if (gen == 0) {
			cubo = new Arena(posX, posY, posZ);

		} else if (gen == 1) {
			cubo = new Tierra(posX, posY, posZ);
		}

		return cubo;
	}

	@Override
	public HerramientaStrategy herramienta() {
		return new Pala();
	}
	
}
