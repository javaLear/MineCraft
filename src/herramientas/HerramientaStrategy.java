package herramientas;

public abstract class HerramientaStrategy {
	
	protected String estado = "limpia";

	public void utilizar(){
		this.estado = "sucia";
	}
	
	public abstract void guardar();
	
	public void limpiar(){
		this.estado = "limpia";
	}

	public String getEstado() {
		return estado;
	}
		
}