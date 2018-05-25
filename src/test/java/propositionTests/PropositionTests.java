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
	
	@Test
	public void shouldReturnContrayInfoForAProposition() {
		AProposition testProposition = new AProposition();
		String testContraryName = testProposition.getContraryName();
		String testContraryTrue = testProposition.contraryTruthValue("True");
		String testContraryFalse = testProposition.contraryTruthValue("False");
		
		assertEquals(testContraryName, "E");
		assertEquals(testContraryTrue, "False");
		assertEquals(testContraryFalse, "Undetermined");
	}
	
	@Test
	public void shouldReturnContradictionInfoForAProposition() {
		AProposition testProposition = new AProposition();
		String testContradictionName = testProposition.getContradictionName();
		String testContradictionTrue = testProposition.contradictionTruthValue("True");
		String testContradictionFalse = testProposition.contradictionTruthValue("False");
		
		assertEquals(testContradictionName, "O");
		assertEquals(testContradictionTrue, "False");
		assertEquals(testContradictionFalse, "True");
	}
	
	@Test
	public void shouldReturnSubAltInfoForAProposition() {
		AProposition testProposition = new AProposition();
		String testSubaltName = testProposition.getSubaltName();
		String testSubaltTrue = testProposition.subaltTruthValue("true");
		String testSubaltFalse = testProposition.subaltTruthValue("False");
		
		assertEquals(testSubaltName, "I");
		assertEquals(testSubaltTrue, "True");
		assertEquals(testSubaltFalse, "Undetermined");
		
	}
}
