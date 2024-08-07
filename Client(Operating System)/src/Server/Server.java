package Server;
import java.net.*;
import java.io.*;
 
public class Server
{
    Socket socket = null;
    ServerSocket server = null;
    DataInputStream in =  null;
    ObjectOutputStream out=null;
   
    public Server(int port)
    {
   try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
         // wait for client to connect 
            socket = server.accept();
            System.out.println("Client accepted");  
         // Read Data from File
            File file = new File("File.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line=reader.readLine();
            reader.close();
         //  Split data and put it ino object 
            String[] tokens = line.split(",");
            int id = Integer.parseInt(tokens[0]);
            String passportNo = tokens[1];
            String name = tokens[2];
            String fatherName = tokens[3];
            String dob = tokens[4];
            String username = tokens[5];
            String password = tokens[6];
            int type = Integer.parseInt(tokens[7]);
            Citizen citizen = new Citizen(id, passportNo, name, fatherName, dob, username, password, type);
        // Sending Object to Client        
            out = new ObjectOutputStream(socket.getOutputStream());
            out.writeObject((Object)citizen);
            System.out.println("Object Send to Client ");
        // reads message from Client
             in = new DataInputStream(socket.getInputStream());
             String line1 = in.readLine();
            System.out.println("Tax received from client "+line1);
            citizen.setIncomeTaxPercentage(Double.parseDouble(line1));
             System.out.println("Closing connection");
        // close connection
            socket.close();
            in.close();
           
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        Server server = new Server(5000);

        }
    }
 


    