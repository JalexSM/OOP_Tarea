package ejercicios;
import java.util.Scanner;
public class Main {
	

	static Scanner sc= new Scanner(System.in);
	 public static void main(String[] args){ 
		
		 int opcion = 0;

         while (opcion != 8) {
        	 System.out.println("\n===== MENÚ PRINCIPAL =====");
             System.out.println(" 1.");
             System.out.println(" 2.  ");
             System.out.println(" 3. ");
             System.out.println(" 4.	");
             System.out.println(" 5. ");
             System.out.println(" 6. ");
             System.out.println(" 7.	");
             System.out.println(" 8. ");
             System.out.print("Seleccione una opción: ");
             
             try {
                 opcion = sc.nextInt();

                 switch (opcion) {
                     case 1:
                    	 ejercicio1();
                         break;
                     case 2:
                    	 ejercicio2();
                         break;
                     case 3:
                    	 ejercicio3();

                         break;
                     case 4:
                    	 ejercicio4();
                         break;
                     case 5:
                    	 ejercicio5();
                     break;
                     case 6:
                    	 ejercicio6(); 
                      	;
                      break;
                     case 7:
                    	    
                      	;
                      break;
                     case 8:
                    	    
                      	;
                      break;
                     default:
                         System.out.println("Opción inválida.");
                 }
             
                 } catch (Exception e) {
                     System.out.println("Debe ingresar un número válido.");
                     sc.nextLine(); 
                     sc.nextLine();
                 }
             }
         }
		
	
	 
	 
	 public static void ejercicio1() {
		 
			Persona per1 = new Persona("alex","samayoa",24);
			Persona per2 = new Persona("dani","medrano",32);
			Persona per3 = new Persona("javier","monroy",22);
				
			per1.mostrar();
			per2.mostrar( );
			per3.mostrar( );
		 
		 
		 
	 }
	 
	 
	 public static void ejercicio2() {
		 Rectangulo rec1 = new Rectangulo(10,5);
		 Rectangulo rec2 = new Rectangulo(15,5);
		 
		 System.out.println("Rectangulo 1 ");
		 rec1.mostrar();
		 rec1.area();
		 rec1.perimetro();
		 
		 double area1=rec1.area();
		 
		 System.out.println("Rectangulo 2 ");
		 rec2.mostrar();
		 rec2.area();
		 rec2.perimetro();
		 double area2=rec2.area();
		 
		 if ( area1>area2) {
			 System.out.println("el area del primer rectangulo es mayor ");
		 }else {
			 System.out.println("el area del segundo rectangulo es mayor ");
		 }
		 
	 }
	
	 public static void ejercicio3() {

    Producto p1 = new Producto("001", "Laptop", 5000);
    Producto p2 = new Producto("002", "Mouse", 150);

    p1.aplicarDescuento(10); // 10%
    p2.aplicarDescuento(20); // 20%

    p1.mostrarProducto();
    p2.mostrarProducto();
    }


	 public static void ejercicio4() {
		 
		 	sc.nextLine();
		 
	       System.out.println("===== SISTEMA DE CUENTA =====");

	        System.out.print("Ingrese nombre del titular: ");
	        String nombre = sc.nextLine();

	        System.out.print("Ingrese saldo inicial: ");
	        double saldoInicial = sc.nextDouble();

	        Cuenta cuenta1 = new Cuenta(nombre, saldoInicial);

	        int opcion;

	        do {
	            System.out.println("\n===== MENÚ =====");
	            System.out.println("1. Depositar");
	            System.out.println("2. Retirar");
	            System.out.println("3. Mostrar datos");
	            System.out.println("4. Salir");
	            System.out.print("Seleccione una opción: ");

	            opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese monto a depositar: ");
	                    double deposito = sc.nextDouble();
	                    cuenta1.depositar(deposito);
	                    break;

	                case 2:
	                    System.out.print("Ingrese monto a retirar: ");
	                    double retiro = sc.nextDouble();
	                    cuenta1.retirar(retiro);
	                    break;

	                case 3:
	                    System.out.println("\n--- DATOS DE LA CUENTA ---");
	                    System.out.println("Titular: " + cuenta1.getTitular());
	                    System.out.println("Saldo actual: Q" + cuenta1.getSaldo());
	                    break;

	                case 4:
	                    System.out.println("Saliendo del sistema...");
	                    break;

	                default:
	                    System.out.println("Opción inválida.");
	            }

	        } while (opcion != 4);

	    }
	 

	 public static void ejercicio5() {
		 
	        Libro libro1 = new Libro("El Quijote", "Cervantes", 500);
	        Libro libro2 = new Libro("Cuentos", "Autor X", 150);
	        Libro libro3 = new Libro("Java Básico", "Autor Y", 320);
	        
	        libro1.mostrarInfo();
	        libro2.mostrarInfo();
	        libro3.mostrarInfo();
	        
	 }
	 
	 
	 
	 
	 
	 
	 public static void ejercicio6() {
		 
	       System.out.println("===== Calculadora =====");

	        System.out.print("Ingrese el primer numero: ");
	        double num1 = sc.nextDouble();

	        System.out.print("Ingrese el segundo numero: ");
	        double num2 = sc.nextDouble();

	        Calculadora calculo1 = new Calculadora(num1, num2);
		 
	        
	        System.out.println("Suma: " + calculo1.suma());
	        System.out.println("Suma: " + calculo1.resta());
	        System.out.println("Suma: " + calculo1.multiplicacion());
	        System.out.println("Suma: " + calculo1.division());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

}
