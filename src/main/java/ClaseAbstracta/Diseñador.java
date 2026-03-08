package ClaseAbstracta;

public class Diseñador extends Empleado {

	public Diseñador(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println(nombre+" Esta diseñando una interfaces");
	}

}
