package Clase;

public class Empleado {

	//Atributos privados(Encapsulamiento)
    private String nombre;
    private String dni;
    
    
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
     //Metodos para acceder a los datos
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//metodo para mostrar Informacion
	public  void mostrarInfo() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Dni: "+dni);
		
	}
}
