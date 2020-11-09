package org.cayo.challenges;

import org.cayo.AbstractTest;
import org.junit.Assert;
import org.junit.Test;

public class Insert5Test extends AbstractTest {

//        System.out.println(code.solution2(268));
//        System.out.println(code.solution2(670));
//        System.out.println(code.solution2(0));
//        System.out.println(code.solution2(-999));
//        System.out.println(code.solution2(-1));
//        System.out.println(code.solution2(-7999));
//        System.out.println(code.solution2(7999));
//        System.out.println(code.solution2(6));
//        System.out.println(code.solution2(666));

	@Test
	public void insert5Test() {
		int result = Insert5.solution(670);
		Assert.assertEquals(6750, result);
		System.out.println(result);
	}

}
