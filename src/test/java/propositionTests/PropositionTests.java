package propositionTests;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import propositions.AProposition;
import propositions.EProposition;
import propositions.IProposition;
import propositions.OProposition;


public class PropositionTests {
	
	@Test
	public void shouldCreateAProposition () {
		AProposition test = new AProposition();
		String testName = test.getPropositionName();
		String testQuantity = test.getQuantity();
		String testQuality = test.getQuality();
		assertEquals(testName, "A");
		assertEquals(testQuantity, "universal");
		assertEquals(testQuality, "affirmative");
	}
	
	@Test
	public void shouldCreateEProposition () {
		EProposition test = new EProposition();
		String testName = test.getPropositionName();
		String testQuantity = test.getQuantity();
		String testQuality = test.getQuality();
		assertEquals(testName, "E");
		assertEquals(testQuantity, "universal");
		assertEquals(testQuality, "negative");
	}
	
	@Test
	public void shouldCreateIProposition () {
		IProposition test = new IProposition();
		String testName = test.getPropositionName();
		String testQuantity = test.getQuantity();
		String testQuality = test.getQuality();
		assertEquals(testName, "I");
		assertEquals(testQuantity, "particular");
		assertEquals(testQuality, "affirmative");
	}
	
	@Test
	public void shouldCreateOProposition () {
		OProposition test = new OProposition();
		String testName = test.getPropositionName();
		String testQuantity = test.getQuantity();
		String testQuality = test.getQuality();
		assertEquals(testName, "O");
		assertEquals(testQuantity, "particular");
		assertEquals(testQuality, "negative");
	}
}
