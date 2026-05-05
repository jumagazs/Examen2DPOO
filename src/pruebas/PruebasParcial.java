package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class PruebasParcial {
	
	private Parcial parcial;
	public PruebasParcial() {
		// TODO Auto-generated constructor stub
	}
	
	@BeforeEach
	public void setup() {
		this.parcial = new Parcial();
	}
	
	@Test
	public void potenciaTest() throws Exception {
		assertEquals(1, this.parcial.potencia(5, 0));
		assertEquals(64, this.parcial.potencia(-8, 2));
		assertEquals(0, this.parcial.potencia(0, 2));
		assertThrows(Exception.class, () -> this.parcial.potencia(2, 31));
		assertThrows(Exception.class, () -> this.parcial.potencia(2, -2));
		assertThrows(Exception.class, () -> this.parcial.potencia(0, -2));
	}
	

}
