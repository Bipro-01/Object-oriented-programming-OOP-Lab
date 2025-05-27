
import java.util.Scanner;

public class Circule {
    
    static void output( double value)
    {
        System.out.println(value);
    }

    static double calculation( double a, double b)
    {
        double d;
        d =a*b;
        return d;
    }
    public static void main (String [ ] args)
    {
        double area;
        double radius;
        final double PI = 3.1416D;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius value : ");
        radius = input.nextInt();


        area = calculation(radius, PI);
      
        output(area);
        input.close();
        
    }
}