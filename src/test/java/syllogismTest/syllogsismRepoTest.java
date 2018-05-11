package syllogismTest;



import static org.junit.Assert.assertThat;


import org.junit.Test;

import static org.hamcrest.Matchers.is;

import propositions.AProposition;
import propositions.EProposition;
import propositions.IProposition;
import propositions.OProposition;
import syllogisms.Syllogism;
import syllogisms.SyllogismTempRepo;

public class syllogsismRepoTest {
	
	@Test
	public void addSyllogismsAndGetSyllogismsByName() {
		AProposition testProposition1 = new AProposition();
		AProposition testProposition2 = new AProposition();
		AProposition testConclusion = new AProposition();
		
		Syllogism testSyllogism = new Syllogism(testProposition1, testProposition2, testConclusion, "1");
		
		IProposition testProposition3 = new IProposition();
		EProposition testProposition4 = new EProposition();
		OProposition testConclusion2 = new OProposition();
		
		Syllogism testSyllogism2 = new Syllogism(testProposition3, testProposition4, testConclusion2, "3");
		
		SyllogismTempRepo testRepo = new SyllogismTempRepo();
		testRepo.addSyllogism(testSyllogism);
		testRepo.addSyllogism(testSyllogism2);
		
		assertThat(testRepo.getIndividualSyllogism("AAA1"), is(testSyllogism));
		assertThat(testRepo.getIndividualSyllogism("IEO3"), is(testSyllogism2));
	}
}
