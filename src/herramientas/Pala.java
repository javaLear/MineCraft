package herramientas;

import cubos.*;

public class Pala extends HerramientaStrategy{
	
	@Override
	public boolean utilizar(Cubo cubo) {
		boolean res = false;
		if(this.getClass().equals(cubo.herramienta().getClass())){
			res = super.utilizar(cubo);
			System.out.println("Cavando");
		}else{
			System.out.println("No puedes utilizar la Pala en " + cubo.getClass().getSimpleName());
		}
		return res;
	}

	@Override
	public void guardar() {
		System.out.println("Guardo la Pala");
	}

	@Override
	public void limpiar() {
		super.limpiar();
		System.out.println("Limpio la Pala");		
	}

}
