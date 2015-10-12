package cubos;

import herramientas.HerramientaStrategy;

/**
 * 
 * @author jscruz
 */
public class Aire extends Cubo {

	public Aire(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}

	@Override
	public HerramientaStrategy herramienta() {
		return null;
	}

}