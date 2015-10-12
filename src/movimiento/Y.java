package movimiento;

import cubos.Aire;
import cubos.Cubo;
import minecraft.GPS;

public class Y extends Movimiento{

	@Override
	public void adelante(Cubo[][][] mundo, GPS jugador) {
		Cubo oldPos = jugador.getPosicion();
		int x = oldPos.getPosX();	
		int y = (oldPos.getPosY()  + jugador.getSentido());
		int z = oldPos.getPosZ();
		
		Cubo newPos = mundo[x][y][z];
		
		if(newPos.getClass().equals(Aire.class)){
			do{
				z--;
				newPos = mundo[x][y][z];
			}while(newPos.getClass().equals(Aire.class));
			
			newPos = mundo[x][y][z+1];
			
			if(z == oldPos.getPosZ()){
				System.out.println("Avanza a la posicion ["+x+","+y+","+z+"]");
			}else{
				System.out.println("Cae a la posicion ["+x+","+y+","+z+"]");
			}		
		}else{
			System.out.println("No se puede avanzar");
		}	
	}

	@Override
	public void atras(GPS jugador) {
		int newSentido = jugador.getSentido() * -1;
		jugador.setSentido(newSentido);
	}

	@Override
	public void derecha(GPS jugador) {
		jugador.setDireccion('X');		
	}

	@Override
	public void izquierda(GPS jugador) {
		int newSentido = jugador.getSentido() * -1;
		jugador.setSentido(newSentido);
		jugador.setDireccion('X');	
	}
	
}