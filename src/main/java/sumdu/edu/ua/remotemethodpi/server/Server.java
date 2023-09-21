package sumdu.edu.ua.remotemethodpi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import sumdu.edu.ua.remotemethodpi.client.ComputeRemote;

/**
 *
 * @author Erlkonig
 */
public class Server {
    public static void main(String[] args) {
        System.setProperty("java.security.policy", "server.policy");
   
        try {
            String name = "Compute";
            ComputeRemote engine = new ComputeRemoteImpl();
            ComputeRemote stub = (ComputeRemote)UnicastRemoteObject.exportObject(engine, 0);
            Registry registry = LocateRegistry.createRegistry(9999);
            registry.rebind(name, stub);
            System.out.println("ComputeRemote bound");
        } catch (Exception e) {
            System.err.println("ComputeRemote exception:");
            e.printStackTrace();
        }
    }
}

