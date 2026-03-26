package ejercicios;

public class Cuenta {
	

    private String titular;
    private double saldo;


    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }


    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito de Q" + monto + " realizado.");
        } else {
            System.out.println("Monto inválido para depósito.");
        }
    }


    public void retirar(double monto) {
        if (monto > 0) {
            if (saldo >= monto) {
                saldo -= monto;
                System.out.println("Retiro de Q" + monto + " realizado.");
            } else {
                System.out.println("Fondos insuficientes.");
            }
        } else {
            System.out.println("Monto inválido para retiro.");
        }
    }


    public void mostrarSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: Q" + saldo);
        System.out.println("----------------------");
    }

	
}
