package cubos;

/**
 * 
 * @author team HS
 */
public class Tierra extends Cubo {

	public Tierra(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		Cubo cubo = null;
		// tierra o madera o aire
		int gen = CuboHelper.getRandomInt(3);

		if (gen == 0) {
			cubo = new Tierra(posX, posY, posZ);

		} else if (gen == 1) {
			cubo = new Madera(posX, posY, posZ);

		} else if (gen == 2) {
			cubo = new Aire(posX, posY, posZ);
		}
		return cubo;
	}

}