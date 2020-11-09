package org.cayo;

import java.time.Duration;
import java.time.Instant;

import org.junit.After;
import org.junit.Before;

public class AbstractTest {
	
	private static Instant init; 
	
	@Before
	public void before() {
		init = Instant.now();
	}
	
	@After
	public void after() {
		Duration duration = Duration.between(init, Instant.now());
		System.out.println(String.format("Duration: %d ms", duration.toMillis()));
	}
	
}
