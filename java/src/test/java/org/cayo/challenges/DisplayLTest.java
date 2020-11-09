package org.cayo.challenges;

import org.cayo.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class DisplayLTest extends AbstractTest {

    @Test
    public void displayLTest() {
		String result = DisplayL.solution(4);
		Assert.assertEquals("L\nL\nL\nLLLL", result);
		System.out.println(result);
    }

}
