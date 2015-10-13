package cubos;

import herramientas.*;

/**
 * Todos los elementos cubo tienen una posicion en el espacio minecraft.
 * 
 * @author team HS
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

	/**
	 * Obtener los posibles elementos que se pueden poner encima de ese
	 * elemento.
	 * 
	 * Los materiales deben estar agrupados por tipo La piedra se encuentra solo
	 * debajo de la tierra y la arena La arena solo puede existir sobre piedra,
	 * pero puede o no tener tierra encima La tierra puede existir sobre piedra
	 * o arena y puede o no tener madera encima
	 * 
	 * @param posX
	 * @param posY
	 * @param posZ
	 * @return
	 */
	public abstract Cubo getCuboPosible(int posX, int posY, int posZ);

	public abstract HerramientaStrategy herramienta();

	public abstract boolean afectaGravedad();
	
}
