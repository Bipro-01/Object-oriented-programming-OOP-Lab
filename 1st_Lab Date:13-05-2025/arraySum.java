

public class arraySum
{

    public static void main(String[] args) 
    {

       System.out.println("hellow world");

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int sum=0;
       for ( int i=0; i<arr.length; i++)
        {
            sum = sum + i;
        }

        System.out.println("sum is "+sum);

        float ava;
        ava =(float) sum / arr.length;
        sum =0;

        System.out.println("Avarage is "+ava);

   for ( int i=0; i<=10; i++)
        {
            if (arr[i]==6 || arr[i]==7)
            {
                continue;
            }
            else if( arr[i]==9)
            {
                break;
            }
            else
            {
                sum = sum+ arr[i];
            }

            
         }
         System.out.println("sum is "+sum);
    }

}