package org.cayo.challenges;

import org.cayo.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CarGasDispenserTest extends AbstractTest {

	@Test
	public void carGasDispenserTest() {
		int[] cars = {2, 8, 4, 3, 2};
		int result = CarGasDispenser.solution(cars, 7, 11, 3);
		Assert.assertEquals(8, result);
		System.out.println(result);
	}

}
