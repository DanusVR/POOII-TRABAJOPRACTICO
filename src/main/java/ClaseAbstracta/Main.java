package ClaseAbstracta;

public class Main {

	public static void main(String[] args) {
		Empleado emp1 = new Programador("Daniel");
		Empleado emp2 = new Diseñador("Analia");
		
		emp1.trabajar();
		emp2.trabajar();

	}

}
