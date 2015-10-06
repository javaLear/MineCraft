package herramientas;

public class Hacha extends HerramientaStrategy{

	@Override
	public void utilizar() {
		super.utilizar();
		System.out.println("Cortando");
		
	}

	@Override
	public void guardar() {
		System.out.println("Guardo el Hacha");
	}

	@Override
	public void limpiar() {
		super.utilizar();
		System.out.println("Limpio el Hacha");		
	}

}
