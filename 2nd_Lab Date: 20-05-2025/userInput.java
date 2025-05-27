import java.util.Scanner;

public class userInput {
    public static void main (String [] args)
    {
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter which typy you want to scan from this code");
        System.out.println("If you want to intger type presee 1 ");
        System.out.println("If you want to String/charactet type presee 2 ");

        System.out.println("If you want to float type presee 3 ");

         System.out.println("If you want to double type presee 4 ");
      
        int a = in.nextInt();

        switch (a)
         {
            case 1:
                {
                    System.out.println("Enter the intger value");
                    int b = in.nextInt();
                    System.out.println("Your value is : "+b);
                    break;
                }
                
                case 2:
                {
                    System.out.println("Enter the String value");
                    String c = in.nextLine();
                    String name = in.nextLine();
                    System.out.println("Your String is : "+name);
                    break;
                }
                

                case 3:
                {
                    System.out.println("Enter the float value");
                    float d = in.nextFloat();
                    System.out.println("Your float value  is : "+d);
                    break;
                }
                
                case 4:
                {
                    System.out.println("Enter the Double value");
                    double e = in.nextDouble();
                    System.out.println("Your double value is : "+e);
                    break;
                }
                
        
            
        }
        in.close();
    
    }
}