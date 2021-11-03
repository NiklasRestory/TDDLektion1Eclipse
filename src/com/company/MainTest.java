package com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void twoPlusFourIsSix() {
		assertEquals(6, Main.add(4, 2));
	}
	
	@Test
	void fifteenPlusMinusFiveIsTen() {
		assertEquals(10, Main.add(15, -5));
	}
	
	@Test
	void sixPlusEightIsNotTen() {
		assertNotEquals(10, Main.add(6, 8));
	}

}
