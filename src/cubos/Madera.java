package cubos;

import herramientas.*;

/**
 * 
 * @author jscruz
 */
public class Madera extends Cubo
{

	public Madera(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}
	
	@Override
	public HerramientaStrategy herramienta() {
		return new Hacha();
	}
}