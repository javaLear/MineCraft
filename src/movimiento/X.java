package movimiento;

import cubos.*;
import minecraft.GPS;
import minecraft.Mundo;


public class X extends Movimiento{

	@Override
	public void adelante(GPS jugador) {

		Cubo oldPos = jugador.getPosicion();
		int x = (oldPos.getPosX() + jugador.getSentido());	
		int y = oldPos.getPosY();
		int z = oldPos.getPosZ();
		
		Cubo newPos = Mundo.getInstance().getCubo(x, y, z);
			
		if(newPos.getClass().equals(Aire.class)){
			do{
				z--;
				newPos = Mundo.getInstance().getCubo(x, y, z);
			}while(newPos.getClass().equals(Aire.class));
			
			newPos = Mundo.getInstance().getCubo(x, y, z++);
			
			if(z == oldPos.getPosZ()){
				System.out.println("Jugador Avanza a la posicion ["+x+","+y+","+z+"]");
			}else{
				System.out.println("Jugador Cae a la posicion ["+x+","+y+","+z+"]");
			}		
			
			jugador.setPosicion(newPos);
		}else{
			System.out.println("No se puede avanzar hay "+ newPos.getClass().getSimpleName() + " adelante.");
		}
	}

	@Override
	public void atras(GPS jugador) {
		int newSentido = jugador.getSentido() * -1;
		jugador.setSentido(newSentido);
	}

	@Override
	public void derecha(GPS jugador) {
		int newSentido = jugador.getSentido() * -1;
		jugador.setSentido(newSentido);
		jugador.setDireccion('Y');
	}

	@Override
	public void izquierda(GPS jugador) {
		jugador.setDireccion('Y');	
	}
}