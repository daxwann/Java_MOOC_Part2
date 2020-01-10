package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor sensor) {
        if (sensor == null) {
            return;
        }

        this.sensors.add(sensor);
    }

    public void on() {
        for (Sensor sensor : this.sensors) {
            sensor.on();
        }
    }

    public void off() {
        for (Sensor sensor : this.sensors) {
            sensor.off();
        }
    }

    public boolean isOn() {
        for (Sensor sensor : this.sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    public int measure() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("Sensor is not on");
        }

        int sum = 0;

        for (Sensor sensor : this.sensors) {
            sum += sensor.measure();
        }

        int avg = sum / this.sensors.size();
        this.readings.add(avg);
        return avg;
    }

    public List<Integer> readings() {
        return this.readings;
    }
}
