package Clase;

public class Diseñador extends Empleado {
    private int proyectos;
    
	public Diseñador(String nombre, String dni, double sBase, int proyectos) {
		super(nombre, dni, sBase);
		this.proyectos = proyectos;
	}

	 
	@Override
	public double calcularSalario() {
		return super.calcularSalario()*(proyectos*50);
	}
	
	

}
