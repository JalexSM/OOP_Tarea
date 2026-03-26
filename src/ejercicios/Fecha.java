package ejercicios;

public class Fecha {

	
	  	private int dia;
	    private int mes;
	    private int anio;

	    public Fecha(int dia, int mes, int anio) {
	        this.dia = dia;
	        this.mes = mes;
	        this.anio = anio;
	    }

	    public boolean esValida() {
	        if (mes < 1 || mes > 12) {
	            return false;
	        }
	        if (dia < 1 || dia > 31) {
	            return false;
	        }
	        return true;
	    }

	    // Método para mostrar
	    public void mostrarFecha() {
	        System.out.println(dia + "/" + mes + "/" + anio);
	    }
	
}
