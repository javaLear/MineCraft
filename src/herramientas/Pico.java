package herramientas;

public class Pico extends HerramientaStrategy{

	@Override
	public void utilizar() {
		super.utilizar();
		System.out.println("Cavando");
		
	}

	@Override
	public void guardar() {
		System.out.println("Guardo la Pico");
	}

	@Override
	public void limpiar() {
		super.utilizar();
		System.out.println("Limpio la Pico");		
	}

}
