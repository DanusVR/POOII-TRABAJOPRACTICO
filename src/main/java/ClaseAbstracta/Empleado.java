package ClaseAbstracta;

public abstract class Empleado {
	
	protected String nombre;

	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void trabajar();
	

}
