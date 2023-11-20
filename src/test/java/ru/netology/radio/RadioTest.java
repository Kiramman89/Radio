package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setWaveTo1() {
        Radio station = new Radio();
        station.setCurrentWave(1);
        int actual = station.getCurrentWave();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setWaveTo0() {
        Radio station = new Radio();
        station.setCurrentWave(0);
        int actual = station.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setWaveToMinus1() {
        Radio station = new Radio();
        station.setCurrentWave(-1);
        int actual = station.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setWaveTo8() {
        Radio station = new Radio();
        station.setCurrentWave(8);
        int actual = station.getCurrentWave();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setWaveTo9() {
        Radio station = new Radio();
        station.setCurrentWave(9);
        int actual = station.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setWaveTo10() {
        Radio station = new Radio();
        station.setCurrentWave(10);
        int actual = station.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void setVolumeTo0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setVolumeToMinus1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setVolumeTo1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        int actual = volume.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setVolumeTo99() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        int actual = volume.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setVolumeTo100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        int actual = volume.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setVolumeTo101() {
        Radio volume = new Radio();
        volume.setCurrentVolume(101);
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void setStationFrom0To1() {
        Radio station = new Radio();
        station.setCurrentWave(0);
        station.next();
        int actual = station.getCurrentWave();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setStationFrom8To9() {
        Radio station = new Radio();
        station.setCurrentWave(8);
        station.next();
        int actual = station.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setStationFrom9To0() {
        Radio station = new Radio();
        station.setCurrentWave(9);
        station.next();
        int actual = station.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setStationFrom9To8() {
        Radio station = new Radio();
        station.setCurrentWave(9);
        station.prev();
        int actual = station.getCurrentWave();
        int expected = 8;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setStationFrom1To0() {
        Radio station = new Radio();
        station.setCurrentWave(1);
        station.prev();
        int actual = station.getCurrentWave();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void setStationFrom0To9() {
        Radio station = new Radio();
        station.setCurrentWave(0);
        station.prev();
        int actual = station.getCurrentWave();
        int expected = 9;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseVolumeFrom0To1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseVolumeFrom99To100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(99);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void increaseVolumeFrom100To101() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 100;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeFrom100To99() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 99;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeFrom1To0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(1);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeFrom0ToMinus1() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.decreaseVolume();
        int actual = volume.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(actual, expected);
    }
}

