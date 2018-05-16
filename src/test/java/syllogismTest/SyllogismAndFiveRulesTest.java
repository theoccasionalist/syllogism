package syllogismTest;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Collection;

import org.junit.Test;

import propositions.AProposition;
import propositions.DetermineProposition;
import propositions.EProposition;
import propositions.IProposition;
import propositions.OProposition;
import propositions.Proposition;
import syllogisms.FiveRules;
import syllogisms.FiveRulesTempRepo;
import syllogisms.Syllogism;
import syllogisms.SyllogismTempRepo;

public class SyllogismAndFiveRulesTest {

	@Test
	public void shouldShowSyllogismNameAndMajorAndMinorAndConclusion() {
		AProposition testA = new AProposition();
		EProposition testE = new EProposition();
		OProposition testO = new OProposition();
		Syllogism testSyllogism = new Syllogism(testA, testE, testO, "4");
		
		assertEquals("AEO4", testSyllogism.getSyllogismName());
	}
	
	@Test
	public void Rule1ShouldPassForAAA1andEEE4() {
		AProposition testMajor = new AProposition();
		AProposition testMinor = new AProposition();
		AProposition testConclusion = new AProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "1");
		
		EProposition testMajor2 = new EProposition();
		EProposition testMinor2 = new EProposition();
		EProposition testConclusion2 = new EProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "4");
		
		FiveRules testAAA1 = new FiveRules(testSyllogism);
		FiveRules testEEE4 = new FiveRules(testSyllogism2);
		String resultAAA1 = testAAA1.getRule1();
		String resultEEE4 = testEEE4.getRule1();
		
		
		assertEquals("Passes Rule 1", resultAAA1);
		assertEquals("Passes Rule 1", resultEEE4);
	}

	
	@Test
	public void Rule1ShouldFailForIII3andAAA2() {
		IProposition testMajor = new IProposition();
		IProposition testMinor = new IProposition();
		IProposition testConclusion = new IProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "3");
		
		AProposition testMajor2 = new AProposition();
		AProposition testMinor2 = new AProposition();
		AProposition testConclusion2 = new AProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "2");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		String testValue = testRules.getRule1();
		String testValue2 = testRules2.getRule1();
		
		assertEquals("Breaks Rule 1", testValue);
		assertEquals("Breaks Rule 1", testValue2);
	}
	
	@Test
	public void Rule3ShouldRPassForAIO4andEIA3() {
		AProposition testMajor = new AProposition();
		IProposition testMinor = new IProposition();
		OProposition testConclusion = new OProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "4");
		
		EProposition testMajor2 = new EProposition();
		IProposition testMinor2 = new IProposition();
		AProposition testConclusion2 = new AProposition();
		Syllogism testSyllogism2 = new Syllogism (testMajor2, testMinor2, testConclusion2, "3");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		String testValue1 = testRules.getRule3();
		String testValue2 = testRules2.getRule3();
		
		assertEquals("Passes Rule 3", testValue1);
		assertEquals("Passes Rule 3", testValue2);
	}
	
	@Test
	public void Rule3ShouldFailForEEI2andOOA4() {
		EProposition testMajor = new EProposition();
		EProposition testMinor = new EProposition();
		IProposition testConclusion = new IProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "2");
		
		OProposition testMajor2 = new OProposition();
		OProposition testMinor2 = new OProposition();
		AProposition testConclusion2 = new AProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "4");
	
		FiveRules testRules = new FiveRules(testSyllogism);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		String testValue = testRules.getRule3();
		String testValue2 = testRules2.getRule3();
		
		assertEquals("Breaks Rule 3", testValue);
		assertEquals("Breaks Rule 3", testValue2);
	}
	
	@Test
	public void Rule4ShouldPassForEI01andAAI3() {
		EProposition testMajor = new EProposition();
		IProposition testMinor = new IProposition();
		OProposition testConclusion = new OProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "1"); 
		
		AProposition testMajor2 = new AProposition();
		AProposition testMinor2 = new AProposition();
		IProposition testConclusion2 = new IProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "3");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		
		String testValue = testRules.getRule4();
		String testValue2 = testRules2.getRule4();
		
		assertEquals("Passes Rule 4", testValue);
		assertEquals("Passes Rule 4", testValue2);
	}
	
	@Test
	public void Rule4ShouldFailForOAA2andAAE1() {
		OProposition testMajor = new OProposition();
		AProposition testMinor = new AProposition();
		AProposition testConclusion = new AProposition();
		Syllogism testSyllogism = new Syllogism(testMajor, testMinor, testConclusion, "2");
		
		AProposition testMajor2 = new AProposition();
		AProposition testMinor2 = new AProposition();
		EProposition testConclusion2 = new EProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "1");
		
		FiveRules testRules = new FiveRules(testSyllogism);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		String testValue = testRules.getRule4();
		String testValue2 = testRules2.getRule4();
		
		assertEquals("Breaks Rule 4", testValue);
		assertEquals("Breaks Rule 4", testValue2);
	}
	
		
	@Test
	public void Rule5ShouldPassForBothAII2AndOOE4() {
		AProposition testMajor1 = new AProposition();
		IProposition testMinor1 = new IProposition();
		IProposition testConclusion1 = new IProposition();
		Syllogism testSyllogism1 = new Syllogism(testMajor1, testMinor1, testConclusion1, "2");
		
		OProposition testMajor2 = new OProposition();
		OProposition testMinor2 = new OProposition();
		EProposition testConclusion2 = new EProposition();
		Syllogism testSyllogism2 =  new Syllogism(testMajor2, testMinor2, testConclusion2, "4");
		
		FiveRules testRules1 = new FiveRules(testSyllogism1);
		FiveRules testRules2 = new FiveRules(testSyllogism2);
		String testValue1 = testRules1.getRule5();
		String testValue2 = testRules2.getRule5();
		
		assertEquals("Passes Rule 5", testValue1);
		assertEquals("Passes Rule 5", testValue2);
	}
	
	@Test
	public void Rule5ShouldFailForBothAAI1AndEEO3() {
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
		String testValue1 = testRules1.getRule5();
		String testValue2 = testRules2.getRule5();
		
		assertEquals("Breaks Rule 5", testValue1);
		assertEquals("Breaks Rule 5", testValue2);
	}
		
	@Test
	public void ShouldMakePropositionsWithStringInput() {
		DetermineProposition test1 = new DetermineProposition();
		Proposition aProposition = test1.makeProposition("A");
		
		DetermineProposition test2 = new DetermineProposition();
		Proposition eProposition = test2.makeProposition("E");
		
		DetermineProposition test3 = new DetermineProposition();
		Proposition iProposition = test3.makeProposition("I");
		
		DetermineProposition test4 = new DetermineProposition();
		Proposition oProposition = test4.makeProposition("O");
		
		assertEquals("A", aProposition.getPropositionName());
		assertEquals("E", eProposition.getPropositionName());
		assertEquals("I", iProposition.getPropositionName());
		assertEquals("O", oProposition.getPropositionName());
	}
	
	@Test
	public void ShouldAddSyllogismsToSyllogismRepo() {
		SyllogismTempRepo repo = new SyllogismTempRepo();
		
		AProposition testMajor1 = new AProposition();
		AProposition testMinor1 = new AProposition();
		IProposition testConclusion1 = new IProposition();
		Syllogism testSyllogism1 = new Syllogism(testMajor1, testMinor1, testConclusion1, "1");
		
		EProposition testMajor2 = new EProposition();
		EProposition testMinor2 = new EProposition();
		OProposition testConclusion2 = new OProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "3");
		
		repo.addSyllogism(testSyllogism1);
		repo.addSyllogism(testSyllogism2);
		
		Collection <Syllogism> individuals = repo.individualSyllogisms();
		
		assertThat(individuals, containsInAnyOrder(testSyllogism1, testSyllogism2));
	}
	
	@Test
	public void ShouldAddSyllogismsToFiveRulesRepo() {
		FiveRulesTempRepo repo = new FiveRulesTempRepo();
		AProposition testMajor1 = new AProposition();
		AProposition testMinor1 = new AProposition();
		IProposition testConclusion1 = new IProposition();
		Syllogism testSyllogism1 = new Syllogism(testMajor1, testMinor1, testConclusion1, "1");
		FiveRules testRules1 = new FiveRules(testSyllogism1);
		
		EProposition testMajor2 = new EProposition();
		EProposition testMinor2 = new EProposition();
		OProposition testConclusion2 = new OProposition();
		Syllogism testSyllogism2 = new Syllogism(testMajor2, testMinor2, testConclusion2, "3");
		FiveRules testRules2 =  new FiveRules(testSyllogism2);
		
		repo.addFiveRules(testRules1);;
		repo.addFiveRules(testRules2);
		
		Collection <FiveRules> individuals = repo.individualFiveRules();
		
		assertThat(individuals, containsInAnyOrder(testRules1, testRules2));
	}
}
