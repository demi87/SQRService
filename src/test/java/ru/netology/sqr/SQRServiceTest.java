package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldSqrLimit() {
        SQRService service = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = service.counter(min, max);
        assertEquals(expected, actual);

    }
    @Test
    void shouldSqrOverLimit() {
        SQRService service = new SQRService();
        int min = 20000;
        int max = 30000;
        int expected = 0;
        int actual = service.counter(min, max);
        assertEquals(expected, actual);

    }
    @Test
    void shouldSqrOneValue() {
        SQRService service = new SQRService();
        int min = 1;
        int max = 100;
        int expected = 1;
        int actual = service.counter(min, max);
        assertEquals(expected, actual);

    }
    @Test
    void shouldSqrHoleValue() {
        SQRService service = new SQRService();
        int min = 270;
        int max = 300;
        int expected = 1;
        int actual = service.counter(min, max);
        assertEquals(expected, actual);

    }
}