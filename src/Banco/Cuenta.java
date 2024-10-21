package Banco;

public class Cuenta {

	private String mNumero;
	private String nTitular;
	private double Saldo = 0;
	
	public Cuenta(String numeroCuenta, String titular, double saldo) {
		super();
		this.mNumero=numeroCuenta;
		this.nTitular=titular;
		this.Saldo = saldo;
	}

	

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	

	public String getNumeroCuenta() {
		return mNumero;
	}



	public void setNumeroCuenta(String numeroCuenta) {
		this.mNumero = numeroCuenta;
	}



	public String getTitular() {
		return nTitular;
	}



	public void setTitular(String titular) {
		this.nTitular = titular;
	}



	public void ingresar(int i) {
		if(i >=0)
		Saldo = Saldo+i;
		else
			System.out.println("No se puede ingresar con numeros negativos");
		
	}
	
	public void retirar(int i) {
		if(Saldo-i>=-500 && i>=0)
		Saldo = Saldo-i;
		else
			System.out.println("No hay saldo en su cuenta");
		
	}
	
	

}
