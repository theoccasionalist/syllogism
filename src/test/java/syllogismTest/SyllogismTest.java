package syllogismTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import propositions.AProposition;
import propositions.EProposition;
import propositions.IProposition;
import propositions.OProposition;
import syllogisms.FiveRules;
import syllogisms.Syllogism;

public class SyllogismTest {

	@Test
	public void shouldShowSyllogismNameAndMajorAndMinorAndConclusion() {
		AProposition testA = new AProposition();
		EProposition testE = new EProposition();
		OProposition testO = new OProposition();
		Syllogism testSyllogism = new Syllogism(testA, testE, testO, "4");
		
		assertEquals("AEO4", testSyllogism.getSyllogismName());
	}
	
	@Test
	public void Rule1ShouldReturnTrueForAAA1() {
		AProposition testMajor = new AProposition();
		AProposition testMinor = new AProposition();
		AProposition testConclusion = new AProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "1");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule1();
		
		assertEquals(true, testValue);
	}

	
	@Test
	public void Rule1ShouldReturnFalseForIII3() {
		IProposition testMajor = new IProposition();
		IProposition testMinor = new IProposition();
		IProposition testConclusion = new IProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "3");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule1();
		
		assertEquals(false, testValue);
	}
	
	@Test
	public void Rule3ShouldReturnTrueForAIO4() {
		AProposition testMajor = new AProposition();
		IProposition testMinor = new IProposition();
		OProposition testConclusion = new OProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "4");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule3();
		
		assertEquals(true, testValue);	
		}
	
	@Test
	public void Rule3ShouldReturnFalseForEEI2() {
		EProposition testMajor = new EProposition();
		EProposition testMinor = new EProposition();
		IProposition testConclusion = new IProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "2");
	
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule3();
		
		assertEquals(false, testValue);
	}
	
	@Test
	public void Rule4ShouldReturnTrueForEI01() {
		EProposition testMajor = new EProposition();
		IProposition testMinor = new IProposition();
		OProposition testConclusion = new OProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "1"); 
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule4();
		
		assertEquals(true, testValue);
	}
	
	@Test
	public void Rule4ShouldReturnFalseForOAA2() {
		OProposition testMajor = new OProposition();
		AProposition testMinor = new AProposition();
		AProposition testConclusion = new AProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "2");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule4();
		assertEquals(false, testValue);
	}
	
	@Test
	public void Rule4ShouldReturnFalseForAAE1() {
		AProposition testMajor = new AProposition();
		AProposition testMinor = new AProposition();
		EProposition testConclusion = new EProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "1");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		Boolean testValue = testRules.Rule4();
		
		assertEquals(false, testValue);
	}
	
	@Test
	public void Rule5ShouldReturnTrueForBothAII2AndEOE4() {
		AProposition testMajor1 = new AProposition();
		IProposition testMinor1 = new IProposition();
		IProposition testConclusion1 = new IProposition();
		Syllogism testSyllogism1 = new Syllogism(testMajor1, testMinor1, testConclusion1, "2");
		
		EProposition testMajor2 = new EProposition();
		OProposition testMinor2 = new OProposition();
		EProposition testConclusion2 = new EProposition();
		Syllogism testSyllogism2 =  new Syllogism(testMajor2, testMinor2, testConclusion2, "4");
		
		FiveRules testRules1 = new FiveRules(testSyllogism1);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		Boolean testValue1 = testRules1.Rule5();
		Boolean testValue2 = testRules2.Rule5();
		
		assertEquals(true, testValue1);
		assertEquals(true, testValue2);
	}
	
	@Test
	public void Rule5ShouldReturnFalseForBothAAI1AndEEO3() {
		AProposition testMajor1 = new AProposition();
		AProposition testMinor1 = new AProposition();
		IProposition testConclusion1 = new IProposition();
		Syllogism testSyllogism1 = new Syllogism(testMajor1, testMinor1, testConclusion1, "1");
		
		EProposition testMajor2 = new EProposition();
		EProposition testMinor2 = new EProposition();
		OProposition testConclusion2 = new OProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "3");
		
		FiveRules testRules1 = new FiveRules(testSyllogism1);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		Boolean testValue1 = testRules1.Rule5();
		Boolean testValue2 = testRules2.Rule5();
		
		assertEquals(false, testValue1);
		assertEquals(false, testValue2);
	}	
}