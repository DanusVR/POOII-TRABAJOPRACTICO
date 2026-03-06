package Clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Empleado emp1 =  new Empleado("Juan Perez","76922228");
   //	Empleado emp2 =  new Empleado("Ana Rios","7457890");
       
		//Instanciacion
		Empleado emp1 =  new Programador("Juan Perez","76922228",2000,10);
		Empleado emp2 =  new Diseñador("Ana Rios","7457890",1800,5);
				
		
		emp1.mostrarInfo();
		emp2.mostrarInfo();
		
		//polimorfismo
		System.out.println("Salario: "+emp1.calcularSalario());
		System.out.println("Salario: "+emp2.calcularSalario());
		
		
		
   
	}

}
