package ds.sliit.firealarm.DesktopServices.mainServers;

import ds.sliit.firealarm.model.Sensor;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;


public class FireAlarmServer extends UnicastRemoteObject implements FireAlarmServerInterface{

    private List<Sensor> fireSensorList = new ArrayList<>();

    protected FireAlarmServer() throws RemoteException {
        super();
    }

    @Override
    public void addFloor(String floorName) {
        // sensor list
    }

    @Override
    public void addRoom(int roomNumber, int floorId) {

    }

    @Override
    public void addSensor(int roomId, Sensor sensor) throws RemoteException{
        System.out.println("New sensor added to list");
        synchronized (fireSensorList){
            this.fireSensorList.add(sensor);
        }
    }
}
