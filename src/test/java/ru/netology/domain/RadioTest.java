package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void setTheStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void previousTheStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void previousTheStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange() {
        Radio radio = new Radio();
        radio.setSoundVolume(8);


        int actual = radio.getSoundVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange1() {
        Radio radio = new Radio();
        radio.setSoundVolume(11);


        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange2() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);


        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void turnUpTheMaxSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);

        radio.maxVolume();

        int actual = radio.getSoundVolume();
        int expected = 10;
    }

    @Test
    void turnUpTheMaxSound1() {
        Radio radio = new Radio();
        radio.setSoundVolume(11);

        radio.maxVolume();

        int actual = radio.getSoundVolume();
        int expected = 10;
    }

    @Test
    void minimizingSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.minVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;
    }

    @Test
    void minimizingSound1() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);

        radio.minVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;
    }
}
