package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RightTriangleTest {
    @Test
    public void testAreAndPerimeter() {
        RightTriangle rt = new RightTriangle(3.0, 4.0);
        assertEquals(6.0, rt.getArea(), 1e-6);
        assertEquals(12.0, rt.getPerimeter(), 1e-6);
    }
    @Test public void testNumberOfSides() {
        RightTriangle rt = new RightTriangle(5.0, 6.0);
        assertEquals(3, rt.numberOfSides());
    }
    
}
