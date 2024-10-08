package clase;

public class Cuenta {
	static Double saldo;
	
	public static int getSaldo() {
		return 500;
	}
	public static void ingresar(int i) {
		saldo += i;
	}
}
