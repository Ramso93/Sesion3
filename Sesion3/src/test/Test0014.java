package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test0014 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
	void test0014() {
		cuenta_12.reintegro(200);
		cuenta_67.reintegro(350);
		cuenta_12.ingreso(100);
		cuenta_67.reintegro(200);
		cuenta_67.reintegro(150);
		cuenta_12.reintegro(200);
		cuenta_67.ingreso(50);
		cuenta_67.reintegro(100);
		
		//assertEquals(-250, cuenta_12.getSaldo());
		//assertEquals(-450, cuenta_67.getSaldo());
		System.out.println("Cuenta 12345 ", cuenta_12.getSaldo());
		System.out.println("Cuenta 67890 ", cuenta_67.getSaldo());
	}

}
