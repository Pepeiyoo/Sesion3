package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Banco.Cuenta;
class CuentaTest {
	private static Cuenta c1, c2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		c1 = new Cuenta("84321", "Pepe", 1000);
		c2 = new Cuenta("90436", "Juan", 50);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void operacionCuentaPrimera() {
		c1.retirar(400);
		c1.ingresar(300);
		c1.retirar(200);
		assertEquals(-300, c1.getSaldo());
	}

	@Test
	void operacionCuentaSegunda() {
		c2.retirar(100);
		c2.retirar(100);
		c2.ingresar(50);
		assertEquals(-150, c2.getSaldo());
	}

}
