package ejercicios;

public class Producto {

	
	
    private String codigo;
    private String nombre;
    private double precio;
    private double precioOriginal;
    
	public Producto(String codigo, String nombre, double precio) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.precioOriginal = precio;
	}

	public void aplicarDescuento(double porcentaje) {
		
        double descuento = precio * (porcentaje / 100);
        precio= precio - descuento; }
    
	
	
	  public void mostrarProducto() {
	        System.out.println("Código: " + codigo);
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Precio original: Q" + precioOriginal);
	        System.out.println("Precio con descuento: Q" + precio);
	        System.out.println("----------------------");
	    }
    
}
