package swt;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class ViereckTest {

	@Test
	public void test() {
		Viereck v = new Viereck(new Point(0, 0), new Point(0, 1), 
                new Point(1, 1), new Point(1, 0));
		assertTrue(v.isQuadrat());
		v = new Viereck(new Point(0, 0), new Point(0, 1), 
                new Point(5, 4), new Point(5, 0));
		assertFalse(v.isQuadrat());
	}

}
