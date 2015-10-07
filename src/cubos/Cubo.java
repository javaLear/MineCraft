package cubos;

/**
 * Todos los elementos cubo tienen una posicion en el espacio minecraft.
 * 
 * @author jscruz
 */
public abstract class Cubo implements Element {

	private int posX;
	private int posY;
	private int posZ;

	public Cubo(int posX, int posY, int posZ) {
		this.posX = posX;
		this.posY = posY;
		this.posZ = posZ;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getPosZ() {
		return posZ;
	}

}
