package sd_Worksheet_3_3119655;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class IntegrationTest {

	@Test
	 public void testShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("Circle1", 3.5));
        shapes.add(new Circle("Circle2", 5.0));
        shapes.add(new Rhombus("Rhombus1", 5, 4));
        shapes.add(new Rhombus("Rhombus2", 6, 7));
        shapes.add(new RightAngledTriangle("Triangle1", 3, 4));
        shapes.add(new RightAngledTriangle("Triangle2", 5, 12));

        for (Shape shape : shapes) {
            System.out.println(shape.toString() + ", Area: " + shape.area() + ", Perimeter: " + shape.perimeter());
        }
        }

}
