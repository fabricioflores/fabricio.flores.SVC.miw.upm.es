package miw;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C31Test {
	
	private C31 c31;
	
	@Before
    public void before() {
        c31 = new C31();
    }

	@Test
	public void testM1() {
		assertTrue(c31.m1().equals("m1"));
	}
	
	@Test
	public void testM2() {
		assertTrue(c31.m2().equals("m2"));
	}

}
