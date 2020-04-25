package ds.sliit.firealarm.DesktopServices.mainServers;

import ds.sliit.firealarm.model.Sensor;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface FireAlarmServerInterface extends Remote{
    /**
     * this interface contain all the rmi call back methods
     * add floor
     * add sensor
     * get sensor reading by sensorId
     * */
    public void addFloor(String floorName);
    public void addRoom(int roomNumber, int floorId);
    public void addSensor(int roomId, Sensor sensor) throws RemoteException;

}
