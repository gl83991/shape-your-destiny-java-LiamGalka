package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testAreAndPerimeter() {
        Circle c = new Circle(1.0);
        double expectedArea = Math.PI;
        double expectedPerimeter = 2 * Math.PI;

        assertEquals(expectedArea, c.getArea(), 1e-6);
        assertEquals(expectedPerimeter, c.getPerimeter(), 1e-6);
    }
}
