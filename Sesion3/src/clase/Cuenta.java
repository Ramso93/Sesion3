package clase;

public class Cuenta {
	static double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public static double getSaldo() {
		return saldo;
	}
	
	public static void setSaldo(double s) {
		saldo = s;
	}
	public static void ingresar(double i) {
		saldo += i;
	}

	public void retirar(double d) {
		// TODO Auto-generated method stub
		this.saldo -= d;
	}
	
}
