package herramientas;

import cubos.*;

public class Hacha extends HerramientaStrategy{
	
	@Override
	public boolean utilizar(Cubo cubo) {
		boolean res = false;
		if(this.equals(cubo.herramienta())){
			res = super.utilizar(cubo);
			System.out.println("Cortando");
		}else{
			System.out.println("No puedes utilizar el Hacha en " + cubo.getClass().getSimpleName());
		}
		
		return res;
	}

	@Override
	public void guardar() {
		System.out.println("Guardo el Hacha");
	}

	@Override
	public void limpiar() {
		super.limpiar();
		System.out.println("Limpio el Hacha");		
	}

}
