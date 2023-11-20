package ru.netology.radio;

public class Radio {
    private int currentWave;
    private int currentVolume;

    public void next() {
        if (currentWave != 9) {
            currentWave++;
        } else {
            currentWave = 0;
        }
    }

    public void prev() {
        if (currentWave != 0) {
            currentWave--;
        } else {
            currentWave = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0)
            currentVolume = currentVolume - 1;
    }

    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > 9) {
            return;
        }
        if (currentWave < 0) {
            return;
        }
        this.currentWave = currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
