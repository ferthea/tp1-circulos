package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	private static final double presicion = 0.01;
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo nuevoCirculo = new Circulo(2);
		assertEquals(2, nuevoCirculo.getRadio(), presicion);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo nuevoCirculo = new Circulo(3.7);
		assertEquals(3.7, nuevoCirculo.getRadio(), presicion);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo nuevoCirculo = new Circulo(5);
		assertEquals(5, nuevoCirculo.getRadio(), presicion);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo nuevoCirculo = new Circulo(10.9);
		assertEquals(10.9, nuevoCirculo.getRadio(), presicion);
	}
	
	
	/* Como le dijo el profesor Juan a otro chico en el grupo, hice los test para 
	   que se calcule tanto el area como el perimetro
	 */
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es301Punto71() {
		Circulo nuevoCirculo = new Circulo(9.8);
		assertEquals(301.71, nuevoCirculo.calcularArea(), presicion);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo nuevoCirculo = new Circulo(9.8);
		assertEquals(61.57, nuevoCirculo.calcularPerimetro(), presicion);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio16Punto6Es865Punto69() {
		Circulo nuevoCirculo = new Circulo(16.6);
		assertEquals(865.69, nuevoCirculo.calcularArea(), presicion);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto30() {
		Circulo nuevoCirculo = new Circulo(16.6);
		assertEquals(104.30, nuevoCirculo.calcularPerimetro(), presicion);
	}
	
}
