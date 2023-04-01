
public class Temperatura {
	
	String nombreTemperatura;
	Double celcius, farenheit, kelvin;
	
	public Temperatura() {}
	
	public Temperatura(String nombreTemperatura) {
		this.nombreTemperatura = nombreTemperatura;
	}

	public String getNombreTemperatura() {
		return nombreTemperatura;
	}

	public void setNombreTemperatura(String nombreTemperatura) {
		this.nombreTemperatura = nombreTemperatura;
	}

	public Double getCelcius() {
		return celcius;
	}

	public void setCelcius(Double celcius) {
		this.celcius = celcius;
	}

	public Double getFarenheit() {
		return farenheit;
	}

	public void setFarenheit(Double farenheit) {
		this.farenheit = farenheit;
	}

	public Double getKelvin() {
		return kelvin;
	}

	public void setKelvin(Double kelvin) {
		this.kelvin = kelvin;
	}
	
	

}
