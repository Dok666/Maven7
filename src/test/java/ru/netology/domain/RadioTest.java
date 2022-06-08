package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio(20);
    Radio radio1 = new Radio();


    @Test
    void numberOfRadioStations5() {
        radio.setCurrentRadioStationNumber(15);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numberOfRadioStations6() {
        radio.setCurrentRadioStationNumber(-1);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void numberOfRadioStations0() {
        radio.setNumberOfRadioStations(1);

        int actual = radio.getNumberOfRadioStations();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numberOfRadioStations1() {
        radio.setNumberOfRadioStations(0);

        int actual = radio.getNumberOfRadioStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void numberOfRadioStations7() {
        radio.setNumberOfRadioStations(-1);

        int actual = radio.getNumberOfRadioStations();
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void numberOfRadioStations3() {
        radio.setNumberOfRadioStations(100);

        int actual = radio.getNumberOfRadioStations();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation() {
        radio.setCurrentRadioStationNumber(5);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation1() {

        radio.setCurrentRadioStationNumber(-1);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation2() {

        radio.setCurrentRadioStationNumber(10);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation3() {

        radio.setCurrentRadioStationNumber(21);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void setTheStation4() {

        radio.setCurrentRadioStationNumber(0);

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation() {

        radio.setCurrentRadioStationNumber(0);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation1() {

        radio.setCurrentRadioStationNumber(19);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void changeTheStation2() {

        radio.setCurrentRadioStationNumber(20);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void previousTheStation() {

        radio.setCurrentRadioStationNumber(0);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 20;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void previousTheStation1() {

        radio.setCurrentRadioStationNumber(9);

        radio.prev();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange() {

        radio.setSoundVolume(50);


        int actual = radio.getSoundVolume();
        int expected = 50;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange3() {

        radio.setSoundVolume(100);


        int actual = radio.getSoundVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange4() {

        radio.setSoundVolume(101);


        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange1() {

        radio.setSoundVolume(0);


        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void soundVolumeChange2() {

        radio.setSoundVolume(-1);


        int actual = radio.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void turnUpTheMaxSound() {

        radio.setSoundVolume(100);

        radio.maxVolume();

        int actual = radio.getSoundVolume();
        int expected = 100;
    }

    @Test
    void turnUpTheMaxSound1() {

        radio.setSoundVolume(101);

        radio.maxVolume();

        int actual = radio.getSoundVolume();
        int expected = 100;
    }

    @Test
    void minimizingSound() {

        radio.setSoundVolume(0);

        radio.minVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;
    }

    @Test
    void minimizingSound1() {

        radio.setSoundVolume(1);

        radio.minVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;
    }
}
