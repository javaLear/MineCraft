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
		Minecraft minecraft = new Minecraft();
		Cubo[][][] mundo = minecraft.getMundo();
		
		String failMsg = "Cubo en la pos %d, %d, %d no es %s.";
		
		for (int i = 0; i < mundo.length; i++) {
			for (int j = 0; j < mundo[i].length; j++) {
				for (int k = 0; k < mundo[i][j].length; k++) {
					
					if (k == 0 ) {
						if (!(mundo[i][j][k] instanceof Piedra)) {
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
		Minecraft minecraft = new Minecraft();
		Cubo[][][] mundo = minecraft.getMundo();
		
		String failMsg = "Cubo en la pos %d, %d, %d no es Aire.";
		
		for (int i = 0; i < mundo.length; i++) {
			for (int j = 0; j < mundo[i].length; j++) {
				for (int k = 0; k < mundo[i][j].length; k++) {
					
					if (k >= Minecraft.SIZE - minecraft.getCielo()) {
						if (!(mundo[i][j][k] instanceof Aire)) {
							fail(String.format(failMsg, i, j, k));
						}
					}
					
				}
			}
		}
		
		Assert.assertTrue(1 == 1);
	}

}
