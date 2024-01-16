import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    float add(float a, float b) throws RemoteException;
     float mul(float a, float b) throws RemoteException;
      float div(float a, float b) throws RemoteException;
       float sub(float a, float b) throws RemoteException;
}
