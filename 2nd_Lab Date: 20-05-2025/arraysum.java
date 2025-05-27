import java.util.*;

    public class arraysum {
        public static void main (String [] args)
        {
                int [] array = new int [10];
                
                int sum=0;
               
                Scanner input = new Scanner(System.in);

                for( int i=0; i<10 ; i++)
                {
                    System.out.println("Array "+ i+1 + "element");
                    array[i]=input.nextInt();
                }

                for( int i=0; i<10 ; i++)
                {
                    sum = sum + array[i];
                }

                System.out.println(sum);


                input.close();
        }


    
}