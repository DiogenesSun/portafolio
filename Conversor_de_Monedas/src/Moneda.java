
public class Moneda {
	
	double valorMoneda, valorMoneda2;
	String nombrePais;
	
	public Moneda() {}
	
	public Moneda(String nombrePais, double valorMoneda, double valorMoneda2) {
		this.valorMoneda = valorMoneda;
		this.valorMoneda2 = valorMoneda2;
		this.nombrePais = nombrePais;		
	}
	
	public Moneda(String nombrePais, double valorMoneda2) {
		this.valorMoneda2 = valorMoneda2;
		this.nombrePais = nombrePais;
		
	}
	
	public Moneda(String nombrePais) {
		this.valorMoneda2 = valorMoneda2;
		this.nombrePais = nombrePais;
		
	}

	public double getValorMoneda() {
		return valorMoneda;
	}

	public void setValorMoneda(double valorMoneda) {
		this.valorMoneda = valorMoneda;
	}

	public String getNombrePais() {
		return nombrePais;
	}

	public void setNombrePais(String nombrePais) {
		this.nombrePais = nombrePais;
	}
	
	public double getValorMoneda2() {
		return valorMoneda2;
	}
	
	public void setValorMoneda2(double valorMoneda2) {
		this.valorMoneda2 = valorMoneda2;
	}

}
