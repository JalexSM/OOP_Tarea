package ejercicios;

public class Persona {
	 private String nombre;
	 private String apellido; 
	 private int edad;
	 
	 
	 
	 public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	 }
	
	 
	 public void mostrar() {
		 System.out.println("Nombre:"+ nombre);
		 System.out.println("apellido: "+ apellido);
		 System.out.println("edad: "+ edad);
		 
		 
		 
		 
	 }
	
	

}
