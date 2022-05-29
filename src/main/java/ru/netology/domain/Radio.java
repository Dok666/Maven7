package ru.netology.domain;

public class Radio {

    private int currentRadioStationNumber;
    private int soundVolume;

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void next() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prev() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > 10) {
            return;
        }
        if (soundVolume < 0) {
            return;
        }
        this.soundVolume = soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void maxVolume() {                          //Максимальный звук
        if (soundVolume == 10) {
            soundVolume = 10;
        }
    }

    public void minVolume() {                         // Минимальный звук
        if (soundVolume == 0) {
            soundVolume = 0;
        }
    }
}

