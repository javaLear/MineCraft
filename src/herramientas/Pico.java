package herramientas;

import cubos.*;

public class Pico extends HerramientaStrategy{

	@Override
	public boolean utilizar(Cubo cubo) {
		boolean res = false;
		if(this.equals(cubo.herramienta())){
			res = super.utilizar(cubo);
			System.out.println("Cavando");
		}else{
			System.out.println("No puedes utilizar el Pico en " + cubo.getClass().getSimpleName());
		}
		
		return res;
	}

	@Override
	public void guardar() {
		System.out.println("Guardo la Pico");
	}

	@Override
	public void limpiar() {
		super.limpiar();
		System.out.println("Limpio la Pico");		
	}

}
