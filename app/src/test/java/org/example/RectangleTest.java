package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class RectangleTest {
    @Test
    public void testAreAndPerimeter() {
        Rectangle r = new Rectangle(4.0, 5.0);
        assertEquals(2.0, r.getArea(), 1e-6);
        assertEquals(18.0, r.getPerimeter(), 1e-6);
    }
    @Test public void testNumberOfSides() {
        Rectangle r = new Rectangle(1.0, 2.0);
        assertEquals(4, r.numberOfSides());
    }
}
