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
		return new Aire(posX, posY, posZ);

	}

	@Override
	public HerramientaStrategy herramienta() {
		return null;
	}

}

