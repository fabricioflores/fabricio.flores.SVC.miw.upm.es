package miw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C51Test {
	
	private C51 c51;
	
	@Before
    public void before() {
        c51 = new C51();
    }

	@Test
	public void testM1() {
		assertTrue(c51.m1().equals("m1"));
	}
	
	@Test
	public void testM2() {
		assertTrue(c51.m2().equals("m2"));
	}

}
