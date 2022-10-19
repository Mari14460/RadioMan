package ru.netology.RadioMan;

public class Radio {
    private int station = 0; //в пределах от 0 до 9. Default = 0
    private int volume = 0; //в пределах от 0 до 10. Default = 0

    // getters
    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    // station methods
    public void next() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void setStation(int stationNumber) { // выставлять номер радиостанции через прямое указание её номера
        if (stationNumber >= 0 && stationNumber <= 9) { // с проверкой на допустимость номера станции.
            station = stationNumber;
        }
    }

    // volume methods
    public void volumePlus() {
        if (volume < 10) {
            volume++;
        }
    }

    public void volumeMinus() {
        if (volume > 0) {
            volume--;
        }
    }
}
