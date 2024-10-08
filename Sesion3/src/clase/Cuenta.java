package clase;

public class Cuenta {
	static Double saldo;
	
	public Cuenta(Double saldo) {
		this.saldo = saldo;
	}
	
	public static int getSaldo() {
		return 500;
	}
	
	public static void setSaldo(Double saldo) {
		Cuenta.saldo = saldo;
	}
	public static void ingresar(Double i) {
		saldo += i;
	}
}
