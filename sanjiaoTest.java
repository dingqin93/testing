package sanjiao;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class sanjiaoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testT() {
		sanjiao.T(11, 5, 12);
		sanjiao.T(11, 11, 11);
		sanjiao.T(3, 5, 4);
		sanjiao.T(1, 5, 4);
		sanjiao.T(4, 4, 3);
	}
	

	@Test
	public void testMain() {
		sanjiao.T(11, 5, 12);
		sanjiao.T(11, 11, 11);
		sanjiao.T(3, 5, 4);
		sanjiao.T(1, 5, 4);
		sanjiao.T(4, 4, 3);
		System.out.println(sanjiao.T(11, 5, 12));
		System.out.println(sanjiao.T(11, 11, 11));
		System.out.println(sanjiao.T(3, 5, 4));
		System.out.println(sanjiao.T(1, 5, 4));
		System.out.println(sanjiao.T(4, 4, 3));
		System.out.println();
	
	}

}
