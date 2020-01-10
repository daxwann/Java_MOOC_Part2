package application;

import java.util.Random;

public class Thermometer implements Sensor {
    private boolean on;

    public Thermometer() {
        this.on = false;
    }

    public int measure() {
        if (!this.on) {
            throw new IllegalStateException("Thermometer not on");
        }

        Random ran = new Random();

        return ran.nextInt(60) - 30;
    }

    public void on() {
        this.on = true;
    }

    public void off() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }
}
