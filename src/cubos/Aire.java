package cubos;

/**
 * 
 * @author team HS
 */
public class Aire extends Cubo {

	public Aire(int posX, int posY, int posZ) {
		super(posX, posY, posZ);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cubo getCuboPosible(int posX, int posY, int posZ) {
		return new Aire(posX, posY, posZ);

	}

}