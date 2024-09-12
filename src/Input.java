import java.util.Scanner;
public class Input {
     Scanner sc = new Scanner(System.in);
      String name;
      int id;
      double age;
      double bmi;
      
      
      public void getApplication() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Application: ");
        int nums = sc.nextInt(); 

        for (int i = 0; i < nums; i++) {
            System.out.println("Enter details of Application: " + (i + 1) + ":");

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Age: ");
            double pr = sc.nextDouble();
              boolean Approved = true;
              
               
         if (age < 50) {
            Approved = false;
            System.out.println("Not eligible");           
        }
           if (Approved) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible (Age too high)");
        }

            System.out.print("Enter BMI: ");
            double md = sc.nextDouble();
        }
  for (int i = 0; i < nums; i++) {
            System.out.println("Details of Application: " + (i + 1) + ":");
        }

        sc.close(); 
    
}
}