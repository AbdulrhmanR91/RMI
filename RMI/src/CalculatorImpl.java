import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements Calculator {
    public CalculatorImpl() throws RemoteException {
        super();
    }

    @Override
    public float add(float a, float b) throws RemoteException {
        return a + b;
    }
    @Override
        public float mul(float a, float b) throws RemoteException {
        return a * b;
    }
    @Override
        public float div(float a, float b) throws RemoteException {
        return a / b;
    }
    @Override
        public float sub(float a, float b) throws RemoteException {
        return a - b;
    }
    
}
