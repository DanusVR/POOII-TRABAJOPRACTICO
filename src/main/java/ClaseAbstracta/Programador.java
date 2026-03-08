package ClaseAbstracta;

public class Programador  extends Empleado{

	public Programador(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println(nombre+" Esta programando un software");
	}

}
