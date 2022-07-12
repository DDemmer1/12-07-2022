package de.demmer.dennis.test;

import org.junit.Assert;
import org.junit.Test;

import de.demmer.dennis.Hund;

public class HundTest {

	@Test
	public void dogAgeConverterTest() {
		Hund hund = new Hund(0,"");
//		Assert.assertEquals(7, hund.convertDogAge(1));
		
		if(hund.convertDogAge(2)!=14) {
			Assert.fail("Test schlug fehl. Hunde Jahr ist != 14");
		}
		
		
		
	}
	
}
