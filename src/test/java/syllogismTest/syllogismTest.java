package syllogismTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import propositions.AProposition;
import propositions.EProposition;
import propositions.OProposition;
import syllogisms.Syllogism;

public class syllogismTest {

	@Test
	public void shouldShowSyllogismNameAndMajorAndMinorAndConclusion() {
		AProposition testA = new AProposition();
		EProposition testE = new EProposition();
		OProposition testO = new OProposition();
		Syllogism testSyllogism = new Syllogism(testA, testE, testO, "4");
		
		assertEquals("AEO4", testSyllogism.getSyllogismName());
	}
	
}
