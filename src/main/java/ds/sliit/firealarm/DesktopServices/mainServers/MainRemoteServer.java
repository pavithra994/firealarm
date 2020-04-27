package ds.sliit.firealarm.DesktopServices.mainServers;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainRemoteServer {
    private static final int SERVERPORT = 9001;

    private static FireAlarmServer fireAlarmServer;

    public static void main(String[] args) throws Exception{
        System.out.println("Starting server...");
        try{
            fireAlarmServer = new FireAlarmServer();

            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("//127.0.0.1/fireAlarm", fireAlarmServer);
            System.out.println("Server is Connected.");

        }
        catch (RemoteException e){
            System.err.println("Server is not working properly "+ e);
        }
    }
}
