package ejercicios;

public class Rectangulo {
	
	private double altura;
	private double base;
	public Rectangulo(float altura, float base) {
		super();
		this.altura = altura;
		this.base = base;
	}
	
	
	
	 public void mostrar() {
		 System.out.println("base:"+ altura);
		 System.out.println("altura: "+ base
				 );
		 
	 }
	
	
	
	public double  area(){
			System.out.println("el area es de "+(base*altura));
		return base*altura;
	}
	public double  perimetro(){
		double perimetro = (2*base)+(2*altura);
		System.out.println("el area es de "+perimetro);
	return perimetro;
}
}
