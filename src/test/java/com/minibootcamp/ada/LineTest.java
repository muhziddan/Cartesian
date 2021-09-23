package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void testCalculateLengthGivenTwoIdenticalPointsExpectReturnZero() {
        assertEquals(0.0, Line.calculateLength(0, 0, 0, 0));
    }

    @Test
    void testCalculateLengthGivenHorizontalLineExpectReturnItsLength() {
        assertEquals(2.0, Line.calculateLength(5, 0, 7, 0));
    }

    @Test
    void testCalculateLengthGivenHorizontalLineWithMinusDeltaValueExpectReturnItsLength() {
        assertEquals(4.0, Line.calculateLength(9, 0, 5, 0));
    }

    @Test
    void testCalculateLengthGivenVerticalLineExpectReturnItsLength() {
        assertEquals(5.0, Line.calculateLength(5, 4, 5, 9));
    }

    @Test
    void testCalculateLengthGivenVerticalLineWithMinusDeltaValueExpectReturnItsLength() {
        assertEquals(6.0, Line.calculateLength(9, 8, 9, 2));
    }
}
