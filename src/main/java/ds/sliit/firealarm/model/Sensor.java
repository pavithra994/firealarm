package ds.sliit.firealarm.model;

public class Sensor {
    private int sensorId;
    private String sensorType;
    private int reading;

    public Sensor(String sensorType) {
        // create new sensor
        // initialize the sensor id from firebase data base
        this.sensorType = sensorType;
    }

    public Sensor(int sensorId) {
        // get sensor by id
        // retrieve data from firebase
        this.sensorId = sensorId;
    }

    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }
}
