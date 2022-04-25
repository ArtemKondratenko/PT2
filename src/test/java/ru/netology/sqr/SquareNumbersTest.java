package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumbersTest {

    @Test
    void shouldSquareNumber() {
        SquareNumbers service = new SquareNumbers();
        int expected = 3;
        int resultRanges = service.calculateSquareNumber(200, 300);

        assertEquals(expected, resultRanges);

    }
}