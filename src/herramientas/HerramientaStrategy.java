package herramientas;

import cubos.*;

public abstract class HerramientaStrategy {
	
	protected String estado = "limpia";

	public boolean utilizar(Cubo cubo){
		this.estado = "sucia";
		return true;
	}
	
	public abstract void guardar();
	
	public void limpiar(){
		this.estado = "limpia";
	}

	public String getEstado() {
		return estado;
	}
		
}