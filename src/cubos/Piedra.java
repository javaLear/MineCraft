package cubos;

import herramientas.*;

/**
 * 
 * @author jscruz
 */
public class Piedra extends Cubo {

	public Piedra(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public HerramientaStrategy herramienta() {
		return new Pico();
	}
	
}