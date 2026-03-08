package Clase;

public class Programador extends Empleado{	
     private int horExtras;     
	public Programador(String nombre, String dni, double sBase, int horExtras) {
		super(nombre, dni, sBase);
		this.horExtras=horExtras;
	}
	
    //Polimosfismo 
	@Override
	public double calcularSalario() {		
		return super.calcularSalario()*(horExtras*20);
	}
    
	
	
	

}
