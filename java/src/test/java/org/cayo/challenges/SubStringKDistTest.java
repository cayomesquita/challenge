package org.cayo.challenges;

import java.util.Arrays;
import java.util.List;

import org.cayo.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class SubStringKDistTest extends AbstractTest {

	@Test
	public void subStringsKDistTest() {
		List<String> retorno = SubStringKDist.subStringsKDist("abcd", 3);
		Assert.assertNotNull(retorno);
		Assert.assertArrayEquals(Arrays.asList("abc", "bcd").toArray(), retorno.toArray());
		System.out.println(Arrays.toString(retorno.toArray()));
	}

}
