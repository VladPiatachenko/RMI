package sumdu.edu.ua.remotemethodpi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Erlkonig
 */
public interface ComputeRemote extends Remote {
    <T> T executeTask(Task<T> t) throws RemoteException;
}
