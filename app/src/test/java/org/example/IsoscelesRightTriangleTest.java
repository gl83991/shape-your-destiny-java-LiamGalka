package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IsoscelesRightTriangleTest {
    @Test
    public void testIsoscelesRightTriangle() {
        double leg = 3.0;
        IsoscelesRightTriangle irt = new IsoscelesRightTriangle(leg);
        assertEquals((leg * leg) / 2, irt.getArea(), 1e-6);
        double expectedPerimeter = leg + leg + Math.sqrt(2) * leg;
        assertEquals(expectedPerimeter, irt.getPerimeter(), 1e-6);
        assertEquals(3, irt.numberOfSides());
    }
}
