import java.util.Scanner;
public class userID {
        Scanner sc = new Scanner(System.in);
    String name;
    int id;
    double age;
    double bmi;
    
    public void adddata(String sname,int uid, double uage, double ubmi){ 
    this.name = sname;
    this.id = uid;
    this.age = uage;
    this.bmi = ubmi;
    }
    
    public void viewApp(){
      System.out.printf("%-10s | %-10.2f |%-10.2f |%-10.2f |%-10.2f |%-10.2f | ", this.name, this.id, this.age, this.bmi);
     
    
       sc.close(); 
    }  
    
}
