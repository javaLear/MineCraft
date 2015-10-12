package cubos;

import herramientas.*;

/**
 * 
 * @author jscruz
 */
public class Tierra extends Cubo {

	public Tierra(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public HerramientaStrategy herramienta() {
		return new Pala();
	}
	
}