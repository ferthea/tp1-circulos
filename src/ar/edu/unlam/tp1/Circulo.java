package ar.edu.unlam.tp1;

public class Circulo {
	
	private double radio;
	
	
	public Circulo (double radio){
		this.radio = radio;
	}
	
	
	public double getRadio(){
		return this.radio;
	}
	
	public double calcularPerimetro(){
		return 2 * Math.PI * this.radio;
	}
	
	public double calcularArea(){
		return Math.PI * Math.pow(this.radio, 2);
	}
}
