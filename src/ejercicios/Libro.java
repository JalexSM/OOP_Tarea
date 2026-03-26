package ejercicios;

public class Libro {

	 private String titulo;
	 private String autor; 
	 private int paginas;
	 public Libro(String titulo, String autor, int paginas) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	 }
	
	public boolean esLargo() {
		    return paginas >= 300;  
	}
	 
	 public void mostrarInfo() {
	        System.out.println("Título: " + titulo);
	        System.out.println("Autor: " + autor);
	        System.out.println("Páginas: " + paginas);

	        if (esLargo()) {
	            System.out.println(" Es un libro largo");
	        } else {
	            System.out.println(" No es un libro largo");
	        }

	        System.out.println("----------------------");
	    }

	 
	 
	 
}
