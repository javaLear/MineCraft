package cubos;

import herramientas.*;

/**
 * 
 * @author jscruz
 */
public class Arena extends Cubo
{
	public Arena(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}
	
	@Override
	public HerramientaStrategy herramienta() {
		return new Pala();
	}
	
}