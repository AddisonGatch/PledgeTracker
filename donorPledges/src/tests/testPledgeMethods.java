package tests;

import static org.junit.Assert.*;
import pledges.Pledge;
import org.junit.Before;
import org.junit.Test;

public class testPledgeMethods {

	Pledge pledge = new Pledge("Steve");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateMonthlyPayments() {
		pledge.setPledgeAmt(1200.00);
		pledge.setPayMonths(12);
		double monthlyPayment = pledge.calculateMonthlyPayments();
		assertEquals(100.00,monthlyPayment,0.0);
	}
	@Test
	public void testCalculateRemainderToBePaid() {
		pledge.setPledgeAmt(500.00);
		pledge.setPayMonths(4);
		pledge.setMonthsPaid(3);
		double remainderToBePaid = pledge.calculateRemainderToBePaid();
		assertEquals(125.00,remainderToBePaid,0.0);
	}
	@Test
	public void testIsPledgeFuffiled() {
		pledge.setPayMonths(6);
		pledge.setMonthsPaid(6);
		assertTrue(pledge.isPledgeFuffiled());
	}
	@Test
	public void testIsPledgeNotFuffiled() {
		pledge.setPayMonths(6);
		pledge.setMonthsPaid(5);
		assertFalse(pledge.isPledgeFuffiled());
	}

}
