package cubos;

import herramientas.HerramientaStrategy;

/**
 * 
 * @author team HS
 */
public class Aire extends Cubo {

	public Aire(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}

	@Override
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		Cubo cubo = null;
		int random = CuboHelper.getRandomInt(3);

		if (random == 0) {
			cubo = new Tierra(posX, posY, posZ);

		} else if (random == 1) {
			cubo = new Piedra(posX, posY, posZ);

		} else {
			cubo = new Aire(posX, posY, posZ);
		}
		
		return cubo;
	}

	@Override
	public HerramientaStrategy herramienta() {
		return null;
	}

	@Override
	public boolean afectaGravedad() {
		return false;
	}

}
