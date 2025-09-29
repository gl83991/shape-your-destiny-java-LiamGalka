package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testSquareAsRectangle() {
        double side = 3.0;
        Square sq = new Square(side);
        assertEquals(side * side, sq.getArea(), 1e-6);
        assertEquals(4 * side, sq.getPerimeter(), 1e-6);
        assertEquals(4, sq.numberOfSides());
    }
    
}
