package lp2;

public class CuentaBancaria {
	private String titular;
	private double cantidad;
	
	public CuentaBancaria(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [titular=" + titular + ", cantidad=" + cantidad + ", getTitular()=" + getTitular()
				+ ", getCantidad()=" + getCantidad() + "]";
		System.out("")
	}
	
	
}
