
public class Persona {
	
	private String nombre, apellido, dni;
	private int añoNacimiento;
	
	
	
	//constructor con los atributos de la clase persona para inicializarlos
	public Persona(String nombre, String apellido, String dni, int añoNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.añoNacimiento = añoNacimiento;
	}



	//metodo que imprime los datos
	public void imprimirDatos() 
	{
		System.out.println(this.nombre+" - "+this.apellido+" - "+this.añoNacimiento+" - "+this.dni);
	}

}
