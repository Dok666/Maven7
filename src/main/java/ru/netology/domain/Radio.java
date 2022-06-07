package ru.netology.domain;

public class Radio {

    private int numberOfRadioStations;    //Колиество радиостанций
    private int currentRadioStationNumber;    // Номер текущей радиостанции

    private int currentRadioStationNumber1;
    private int soundVolume;// Громкость звука

    public int getCurrentRadioStationNumber1() {
        return currentRadioStationNumber1;
    }

    public void setCurrentRadioStationNumber1(int currentRadioStationNumber1) {
        if(currentRadioStationNumber1 > numberOfRadioStations)
            return;
        this.currentRadioStationNumber1 = currentRadioStationNumber1;
    }

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;

    }

    public Radio() {

    }


    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > 9 ) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getNumberOfRadioStations() {
        return numberOfRadioStations;
    }

    public void setNumberOfRadioStations(int numberOfRadioStations) {
        if (numberOfRadioStations < 0)
            return;
        this.numberOfRadioStations = numberOfRadioStations;
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
        if (soundVolume > 100) {
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
        if (soundVolume == 100) {
            soundVolume = 100;
        }
    }

    public void minVolume() {                         // Минимальный звук
        if (soundVolume == 0) {
            soundVolume = 0;
        }
    }
}

