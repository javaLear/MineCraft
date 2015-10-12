package minecraft;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;

import cubos.Aire;
import cubos.Cubo;
import cubos.Piedra;

public class MinecraftTest {

	@Test
	public void testStoneBase() {
		Mundo mundo = Mundo.getInstance();
		Cubo[][][] cubos = mundo.getCubos();
		
		String failMsg = "Cubo en la pos %d, %d, %d no es %s.";
		
		for (int i = 0; i < cubos.length; i++) {
			for (int j = 0; j < cubos[i].length; j++) {
				for (int k = 0; k < cubos[i][j].length; k++) {
					
					if (k == 0 ) {
						if (!(cubos[i][j][k] instanceof Piedra)) {
							fail(String.format(failMsg, i, j, k, "Piedra"));
						}
					} 
				}
			}
		}
		
		Assert.assertTrue(1 == 1);
	}
	
	@Test
	public void testAirTop() {
		Mundo mundo = Mundo.getInstance();
		Cubo[][][] cubos = mundo.getCubos();
		
		String failMsg = "Cubo en la pos %d, %d, %d no es Aire.";
		
		for (int i = 0; i < cubos.length; i++) {
			for (int j = 0; j < cubos[i].length; j++) {
				for (int k = 0; k < cubos[i][j].length; k++) {
					
					if (k >= Mundo.SIZE - mundo.getCielo()) {
						if (!(cubos[i][j][k] instanceof Aire)) {
							fail(String.format(failMsg, i, j, k));
						}
					}
					
				}
			}
		}
		
		Assert.assertTrue(1 == 1);
	}

}
