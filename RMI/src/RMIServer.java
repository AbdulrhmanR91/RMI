

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            Calculator calc = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("calculator", calc);
            System.out.println("RMI server running...");
        } catch (MalformedURLException | RemoteException e) {
            System.err.println("RMI server exception: " + e.getMessage());
        }
    }
}
