package ejercicios.cuenta;

public class Cuenta {
	
	private float saldo;
	private int deposito=0;
	private int numeroDeRetiros=0;
	private float tasaAnual;
	private float comisionMensual=0;
	
	
	
	public Cuenta() {
		
	}



	public Cuenta(float saldo, float tasaAnual) {
		
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}



	public float getSaldo() {
		return saldo;
	}



	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}



	public int getDeposito() {
		return deposito;
	}



	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}



	public int getNumeroDeRetiros() {
		return numeroDeRetiros;
	}



	public void setNumeroDeRetiros(int numeroDeRetiros) {
		this.numeroDeRetiros = numeroDeRetiros;
	}



	public float getTasaAnual() {
		return tasaAnual;
	}



	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}



	public float getComisionMensual() {
		return comisionMensual;
	}



	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}


	public int depositar() {
		
		saldo+=deposito;
		
		return (int) this.saldo;
	}
	
	public int retirar () {
		
		saldo-=numeroDeRetiros;
		
		return (int) this.saldo;
	}
	
	
	
	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", deposito=" + deposito + ", numeroDeRetiros=" + numeroDeRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	
	
	
	
	
}

