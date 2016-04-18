package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	private static final double presicion = 0.01;
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo nuevoCirculo = new Circulo(2.0);
		Double radioEsperado = new Double(2);
		assertEquals(radioEsperado, nuevoCirculo.getRadio());
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo nuevoCirculo = new Circulo(3.7);
		Double radioEsperado = new Double(3.7);
		assertEquals(radioEsperado, nuevoCirculo.getRadio());
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo nuevoCirculo = new Circulo(5.0);
		Double radioEsperado = new Double(5);
		assertEquals(radioEsperado, nuevoCirculo.getRadio());
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo nuevoCirculo = new Circulo(10.9);
		Double radioEsperado = new Double(10.9);
		assertEquals(radioEsperado, nuevoCirculo.getRadio());
	}
	
	
	/* Como le dijo el profesor Juan a otro chico en el grupo, hice los test para 
	   que se calcule tanto el area como el perimetro
	 */
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		Circulo nuevoCirculo = new Circulo(9.8);
		Double areaEsperada = new Double(301.71);
		assertEquals(areaEsperada, nuevoCirculo.calcularArea(), presicion);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo nuevoCirculo = new Circulo(9.8);
		Double perimetroEsperado = new Double(61.57);
		assertEquals(perimetroEsperado, nuevoCirculo.calcularPerimetro(), presicion);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo nuevoCirculo = new Circulo(16.6);
		Double areaEsperada = new Double(865.69);
		assertEquals(areaEsperada, nuevoCirculo.calcularArea(), presicion);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo nuevoCirculo = new Circulo(16.6);
		Double perimetroEsperado = new Double(104.30);
		assertEquals(perimetroEsperado, nuevoCirculo.calcularPerimetro(), presicion);
	}
	
}
