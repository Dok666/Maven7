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
    void changeTheStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);

        radio.next();

        int actual = radio.getCurrentRadioStationNumber();
        int expected = 1;

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
    void soundVolumeChange() {
        Radio radio = new Radio();
        radio.setSoundVolume(8);


        int actual = radio.getSoundVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void increaseSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(9);

        radio.riseInSound();

        int actual = radio.getSoundVolume();
        int expected = 10;
    }

    @Test
    void TurnDownTheVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(10);

        radio.loweringTheSoundLevel();

        int actual = radio.getSoundVolume();
        int expected = 9;
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
    void minimizingSound() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);

        radio.minVolume();

        int actual = radio.getSoundVolume();
        int expected = 0;
    }
}
