import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

class BlockGridTest {
	
	private BlockGrid gridTest;

	@Test
	void testBlockGrid() {
		gridTest = new BlockGrid(10,20);
		int actualWidth = gridTest.getWidth();
		int actualHeight = gridTest.getHeight();
		assertEquals(10, actualWidth);
		assertEquals(20, actualHeight);
		
		//Color actualColor = gridTest.getSquare(1,2);
		//System.out.println("color from testBlockGrid " + actualColor.toString());
	}

	@Test
	void testDrawSquareIntInt() {
		
		gridTest = new BlockGrid(3,4);
		gridTest.drawSquare(1,2);
		Color actualColor = gridTest.getSquare(1,2);
		// expectedColor = Color.WHITE; 
		Boolean matchValue = actualColor.equals(Color.WHITE);
		//Boolean matchValue = gridTest.getSquare(1,2).equals(Color.WHITE);
		assertEquals(true, matchValue);
	}

	@Test
	void testDrawSquarePoint() {
		Point pointTest = new Point (3,2);
		gridTest = new BlockGrid(5,4);
		gridTest.drawSquare(pointTest);
		Color actualColor = gridTest.getSquare(pointTest);
		// expectedColor = Color.WHITE; 
		Boolean matchValue = actualColor.equals(Color.WHITE);
		assertEquals(true, matchValue);
	}

	@Test
	void testSetColor() {
		gridTest = new BlockGrid(1,2);
		gridTest.setColor(Color.BLUE);
		Color actualColor = gridTest.getColor();
		//System.out.println("color from testSetColor" + actualColor.toString());
		Boolean matchValue = actualColor.equals(Color.BLUE);
		assertEquals(true, matchValue);
	}


	@Test
	void testGetGraphicsWidth() {
		gridTest = new BlockGrid(7,1);
		int actualWidth = gridTest.getGraphicsWidth();
		int expectedWidth = 7 * 25;
		assertEquals(expectedWidth, actualWidth);
	}

	@Test
	void testGetGraphicsHeight() {
		gridTest = new BlockGrid(1,7);
		int actualHeight = gridTest.getGraphicsHeight();
		int expectedHeight = 7 * 25;
		assertEquals(expectedHeight, actualHeight);
	}

	@Test
	void testClear() {	
		gridTest = new BlockGrid(3,5);
		gridTest.setColor(Color.GREEN);
		gridTest.drawSquare(1,2);
		Color prevColor = gridTest.getSquare(1,2);
		//System.out.println("color from testClear before clear " + prevColor.toString());
		Boolean matchValue = prevColor.equals(Color.GREEN);
		assertEquals(true, matchValue);
		gridTest.clear();
		int actualWidth = gridTest.getWidth();
		int actualHeight = gridTest.getHeight();
		assertEquals(3, actualWidth);
		assertEquals(5, actualHeight);
		assertNotNull(gridTest);
		
		/*Color newColor = gridTest.getSquare(1,1);
		BlockGrid newGrid = new BlockGrid(3,5);
		//System.out.println("color from testClear newGrid " + newGrid.toString());
		//System.out.println("color from testClear after clear " + gridTest.toString());
		Boolean value = gridTest.equals(newGrid.getSquare(1,1));
		//assertNotNull(gridTest.getSquare(3,5));
		//assertNull(newColor);
		assertEquals(false, value);*/
	}

	@Test
	void testDraw() {
		BlockGrid gridnullTest = new BlockGrid(0,0);
		gridnullTest.draw(null);
		Color old = gridnullTest.getColor();
		//System.out.println("color from testDraw for null " + old.toString());
		Boolean matchValue = old.equals(Color.WHITE);
		assertEquals(matchValue, true);

		BlockGrid gridTest = new BlockGrid(5,7);

		TetrisBlock.RIGHT_L.setLocation(3,5).draw(gridTest);

		int iterations = 0;
		
		for(int i = 0; i < gridTest.getWidth(); i++) {
			for(int j = 0; j < gridTest.getHeight(); j++) {
	            iterations++;
	        }
		} 
		
		assertEquals(35, iterations); 
        //setForeground(Color.RED);  
		TetrisBlock.RIGHT_L.setLocation(5,3).draw(gridTest);
		TetrisBlock.SQUARE.setLocation(2,3).draw(gridTest);
		TetrisBlock.LEFT_L.setLocation(5,7).draw(gridTest);
		TetrisBlock.TEE.setLocation(3,2).draw(gridTest);
		TetrisBlock.LONG .setLocation(1,2).draw(gridTest);

 
		//TetrisBlock b = TetrisBlock.SQUARE.setLocation(5,2);
	}

	@Test
	void testToString() {
		BlockGrid gridNullTest = new BlockGrid(3,2);
		String stringValue = gridNullTest.toString();
		assertEquals("---\n" + "---", stringValue);
		
		BlockGrid gridTest = new BlockGrid(2,4);
		gridTest.drawSquare(1,2);
		String stringValueNew = gridTest.toString();
		assertEquals("--\n" + "--\n" + "-#\n" + "--", stringValueNew);
	}

	/*@Test
	void testMain() {
		fail("Not yet implemented");
	}*/

}
