package cubos;

import java.util.Random;

public class CuboHelper {
	
	private static Random genran;
	
	static {
		genran = new Random();
	}
	
	public static int getRandomInt(int limit) {
		int gen = genran.nextInt(limit);
		return gen;
	}
}
