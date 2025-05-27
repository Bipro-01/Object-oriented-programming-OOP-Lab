import java.util.Scanner;

public class Student
 {

    
        public static void main(String[] args)  
        {
            System.out.println("Hello this is my code");
            
        
            Studentvalue s1 = new Studentvalue ();
            s1.setvalue("Bipro", 120, 5.7D);
           
            s1.display();
    
            Studentvalue s2 = new Studentvalue();
            s2.name = "himu";
            s2.id = 738;
            s2.cgpa = 3.50F;
            s2.display();

            Studentvalue s3 = new Studentvalue();
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name : ");
            s3.name = sc.nextLine();

            System.out.println("Enter the Student Id : ");
            s3.id = sc.nextInt();

            System.out.println("Enter the Student age : ");
            s3.cgpa = sc.nextFloat();

            s3.display();
            sc.close();
        }
    }