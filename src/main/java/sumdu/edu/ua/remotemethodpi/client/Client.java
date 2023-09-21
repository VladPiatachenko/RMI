package sumdu.edu.ua.remotemethodpi.client;

import java.math.BigDecimal;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Erlkonig
 */
public class Client {
    public static void main(String args[]) {
   
        try {
            String name = "Compute";
            Registry registry = LocateRegistry.getRegistry(null, 9999 );
            ComputeRemote comp = (ComputeRemote) registry.lookup(name);

            Task<BigDecimal> task = new Pi();
            BigDecimal pi = (BigDecimal) comp.executeTask(task);
            String s=pi.toEngineeringString();
            System.out.println(s);
        } catch (NotBoundException | RemoteException e) {
            System.err.println("ComputePi exception:" + e.getMessage());
            e.printStackTrace();
        }
    }
}


