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
                    	 ;
                         break;
                     case 4:
                     	;
                         break;
                     case 5:
    
                     	;
                     break;
                     case 6:
                    	    
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
		 
		 System.out.println("Rectangulo 2 ");
		 rec2.mostrar();
		 rec2.area();
		 rec2.perimetro();
		 
		 
		 
		 
	 }
	 
	 
}
