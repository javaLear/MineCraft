package cubos;

/**
 * 
 * @author team HS
 */
public class Piedra extends Cubo {

	public Piedra(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
	}
	
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		Cubo cubo = null;
		int gen = CuboHelper.getRandomInt(3);

		if (gen == 0) {
			cubo = new Piedra(posX, posY, posZ);

		} else if (gen == 1) {
			cubo = new Arena(posX, posY, posZ);

		} else if (gen == 2) {
			cubo = new Tierra(posX, posY, posZ);
		}
		return cubo;
	}
}