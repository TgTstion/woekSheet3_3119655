package sd_Worksheet_3_3119655;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapeTest {

	@Test
	   public void testCircle() {
        Circle circle = new Circle("Circle", 3.5);
        assertEquals(38.4845, circle.area(), 0.0001);
        assertEquals(21.9911, circle.perimeter(), 0.0001);
        assertEquals("Circle, Radius: 3.5", circle.toString());
    }

	@Test
	 public void testRhombus() {
        Rhombus rhombus = new Rhombus("Rhombus", 5, 4);
        assertEquals(20.0, rhombus.area(), 0.0001);
        assertEquals(20.0, rhombus.perimeter(), 0.0001);
        assertEquals("Rhombus, Side: 5.0, Height: 4.0", rhombus.toString());
    }

	@Test
	  public void testRightAngledTriangle() {
        RightAngledTriangle triangle = new RightAngledTriangle("Triangle", 3, 4);
        assertEquals(6.0, triangle.area(), 0.0001);
        assertEquals(12.0, triangle.perimeter(), 0.0001);
        assertEquals("Triangle, Base: 3.0, Height: 4.0", triangle.toString());
    }


}
