package Server;
import java.net.*;
import java.io.*;
public class Client
{
private Socket socket = null;
private ObjectInputStream input = null;
private DataOutputStream out = null;

public Client(String address, int port)
{
    try
    {
    socket = new Socket(address, port);
    System.out.println("Connected");
    // read data from server
    input = new ObjectInputStream(socket.getInputStream());
    Citizen cit=(Citizen)input.readObject();
        System.out.println("Obect Read from server");
           int age = calculateAge(cit.dob);
                if (age < 30) {
                    cit.incomeTaxPercentage=7.0;
                } else if (age >= 40 && age <= 50) {
                    cit.incomeTaxPercentage=5.0;
                } else if (age > 50 && age <= 60) {
                    cit.incomeTaxPercentage=3.0;
                } else {
                    cit.incomeTaxPercentage=0.0;
                }
                double tax=cit.incomeTaxPercentage;
                String line = Double.toString(tax);
                // send tax back to server 
                out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(line);
                
        input.close();
        out.close();
        socket.close();

    }
    catch(Exception i)
    {
    System.out.println(i);
    }
}
public static void main(String args[]) {
Client client = new Client("127.0.0.1", 5000);        
}
int calculateAge(String dob){
    return 2023-Integer.parseInt(dob.substring(dob.length()-4));
}            
            
}


