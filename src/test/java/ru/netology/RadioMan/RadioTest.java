package ru.netology.RadioMan;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    // station tests
    @Test
    void stationNext() {
        Radio radio = new Radio(); // station by default = 0 - default constructor with 10 stations
        radio.next();
        int expected = 1;
        int actual = radio.getStation();

        assertEquals(expected, actual);
    }

    @Test
    void stationNextMoreThanNumber() {
        int number = 10;
        Radio radio = new Radio(number); // station by default = 0
        radio.setStation(number - 1);
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
        int number = 15;
        Radio radio = new Radio(15); // station by default = 0
        radio.setStation(0);
        radio.prev();
        int expected = number - 1;
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
    void stationSetMoreThanNumber() {
        int number = 99;
        Radio radio = new Radio(number); // station by default = 0
        radio.setStation(number);
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
    void volumePlusMoreThanHundred() {
        Radio radio = new Radio(); // volume by default = 0
        
        for (int i = 0; i <= 99; i++) {
            radio.volumePlus(); // press "+" 10 times, set volume = 10
        } // volume=10

        radio.volumePlus();
        int expected = 100;
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
