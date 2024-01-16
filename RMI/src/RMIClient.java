import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        try {
            Calculator calc = (Calculator) Naming.lookup("rmi://localhost:1099/calculator");
            System.out.println("Enter Two Numbers , please!");
            float a=sc.nextInt();
            float b = sc.nextInt();
            float result=calc.add(a, b);
            System.out.println("SUM is : "+result);
            float re=calc.mul(a, b);
            System.out.println("mul is : "+re);
           float res=calc.sub(a, b);
            System.out.println("sub is : "+res);
           float resul=calc.div(a, b);
            System.out.println("div is : "+resul);
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            System.err.println("RMI client exception: " + e.getMessage());
        }
    }
}
