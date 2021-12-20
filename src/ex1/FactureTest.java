package ex1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactureTest {
	
	private Facture facture;
	
	@BeforeEach
	private void setUp() {
		facture = new Facture();

	}
	
	@Test
	void testGetFraisTransport0() {
		assertEquals(0, facture.getFraisTransport(800));
	}
	
	@Test
	void testGetFraisTransport45() {
		assertEquals(45, facture.getFraisTransport(500));
	}
	
	@AfterEach
	private void tearDown() {
		facture = null;

	}

}
