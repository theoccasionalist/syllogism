package controllerTests;

import static org.junit.Assert.assertThat;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

import controllers.SyllogismController;

public class ControllerTests {

		@Test
		public void ShouldReturnSyllogismView () {
			SyllogismController testController = new SyllogismController();
			String testReturn = testController.shouldDisplaySyllogismsView();
					
			assertThat(testReturn, is("syllogisms"));
		}
}
