package ru.netology.RadioMan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    // station tests
    @Test
    void stationNext() {
        Radio radio = new Radio(); // station by default = 0
        radio.next();
        int expected = 1;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationNextMoreThanNine() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationPrev() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationPrevLessThanZero() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationSet() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(5);
        int expected = 5;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationSetLessThanZero() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(-1);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationSetMoreThanNine() {
        Radio radio = new Radio(); // station by default = 0
        radio.setStation(10);
        int expected = 0;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    // volume tests
    @Test
    void volumePlus() {
        Radio radio = new Radio(); // volume by default = 0
        radio.volumePlus();
        int expected = 1;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeMinus() {
        Radio radio = new Radio(); // volume by default = 0
        radio.volumePlus();
        radio.volumeMinus();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumePlusMoreThanTen() {
        Radio radio = new Radio(); // volume by default = 0

        for (int i = 0; i <= 9; i++) {
            radio.volumePlus(); // press "+" 10 times, set volume = 10
        } // volume=10

        radio.volumePlus();
        int expected = 10;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

    @Test
    void volumeMinusLessThanZero() {
        Radio radio = new Radio(); // volume by default = 0
        radio.volumeMinus();
        int expected = 0;
        int actual = radio.getVolume();

        assertEquals(expected, actual);
    }

}
