import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

class BlockGridTest2 {

	@Test
	void testGetWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGraphicsWidth() {
		fail("Not yet implemented");
	}

	@Test
	void testGetGraphicsHeight() {
		fail("Not yet implemented");
	}

	@Test
	void testClear() {
		gridTest = new BlockGrid(1,2);
		Color prev1Color = gridTest.getColor();
		System.out.println("color from testClear before clear " + prev1Color.toString());
		gridTest.setColor(Color.GREEN);
		Color prevColor = gridTest.getColor();
		System.out.println("color from testClear before clear 2" + prevColor.toString());
		gridTest.clear();
		Color actualColor = gridTest.getColor();
		Boolean matchValue = actualColor.equals(Color.GREEN);
		assertEquals(true, matchValue);
		Color currentColor = gridTest.getColor();
		System.out.println("color from testClear after clear " + currentColor.toString());
	}

	@Test
	void testDraw() {
		fail("Not yet implemented");
		/*gridTest1 = new BlockGrid(3,4);  
		Color actualColor = gridTest.getSquare(1,2);
		Color actualColor = gridTest.getColor();
		Boolean matchValue = actualColor.equals(Color.BLUE);
		assertEquals(expectedHeight, actualHeight);
	    assertEquals(0, s.findSum(0));    //Test 1
	    assertEquals(0, s.findSum(-1));   //Test 2
	    assertEquals(5, s.findSum(1));    //Test 3
	    assertEquals(5, s.findSum(2));    //Test 4
	    assertEquals(17, s.findSum(5));   //Test 5
	    assertEquals(26, s.findSum(9));   //Test 6
	    assertEquals(36, s.findSum(10));  //Test 7
	    assertEquals(0, s.findSum(11));   //Test 8*/
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
		String ret = "";
		for(int i = 0; i < gridNullTest.getWidth(); i++) {
			if(i != 0)
				ret+="\n";
			for(int j = 0; j < gridNullTest.getHeight(); j++) {
	            if (gridNullTest.getSquare(i,j) != null) {
	            	ret+="#";
	        		//System.out.println("iterations " + stringValue);
	        		//assertEquals("---\n" + "---", stringValue);
	            }
				else
					ret+="-";
	        }
		} 
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
