package ru.netology.RadioMan;

public class Radio {

    private int numberOfStations;
    private int station = 0; //в пределах от 0 до 9. Default = 0
    private int volume = 0; //в пределах от 0 до 10. Default = 0

    public Radio() { // default constructor with default number of stations=10
        this.numberOfStations = 10;
    }

    public Radio(int numberOfStations) { // constructor with number of stations in the parameter
        this.numberOfStations = numberOfStations;
    }

    // getters
    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    // station methods
    public void next() {
        if (station < numberOfStations - 1) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station > 0) {
            station--;
        } else {
            station = this.numberOfStations - 1;
        }
    }

    public void setStation(int stationNumber) { // выставлять номер радиостанции через прямое указание её номера
        if (stationNumber >= 0 && stationNumber <= numberOfStations - 1) { // с проверкой на допустимость номера станции.
            station = stationNumber;
        }
    }

    // volume methods
    public void volumePlus() {
        if (volume < 100) {
            volume++;
        }
    }

    public void volumeMinus() {
        if (volume > 0) {
            volume--;
        }
    }
}
