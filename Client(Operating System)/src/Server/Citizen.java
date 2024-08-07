package Server;
import java.io.Serializable;

public class Citizen implements Serializable
{
  
 int id;
 String passportNo;
 String name;
 String fatherName;
 String dob;
 String username;
 String password;
 int type;
 double incomeTaxPercentage;
 public Citizen(int id, String passportNo, String name, String fatherName, String dob, String username, String password,
int type) {
 this.id = id;
 this.passportNo = passportNo;
 this.name = name;
 this.fatherName = fatherName;
 this.dob = dob;
 this.username = username;
 this.password = password;
 this.type = type;
 }
 public void setIncomeTaxPercentage(double i){
     incomeTaxPercentage=i;
 }
}
