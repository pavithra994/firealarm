package ds.sliit.firealarm.DesktopServices.mainServers;

import ds.sliit.firealarm.model.Sensor;

import java.rmi.Naming;
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
    public void addFloor(String floorName) throws RemoteException {
        // sensor list
    }

    @Override
    public void addRoom(int roomNumber, int floorId) throws RemoteException {

    }

    @Override
    public void addSensor(Sensor sensor) throws RemoteException{
        System.out.println("New sensor added to list");
//        synchronized (fireSensorList){
//            this.fireSensorList.add(sensor);
//        }
        this.fireSensorList.add(sensor);
    }

    public static void main(String[] var0) {
        System.out.println("Loading temperature service");

        try {
            FireAlarmServer var1 = new FireAlarmServer();
            String var2 = "localhost";
            String var3 = "rmi://" + var2 + "/TemperatureSensor";
            Naming.rebind(var3, var1);

        } catch (RemoteException var5) {
            System.err.println("Remote Error - " + var5);
        } catch (Exception var6) {
            System.err.println("Error - " + var6);
        }

    }
}