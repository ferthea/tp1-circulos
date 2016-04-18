package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	
	public Circulo (Double radio){
		this.radio = radio;
	}
	
	
	public Double getRadio(){
		return this.radio;
	}
	
	public Double calcularPerimetro(){
		return 2 * Math.PI * this.radio;
	}
	
	public Double calcularArea(){
		return Math.PI * Math.pow(this.radio, 2);
	}
}
