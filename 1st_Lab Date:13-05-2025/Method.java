public class Method {
    
    static void myMethod()
    {
        System.out.println("Bipro");

    }

    static void myMethod(String fristname, String lastname)
    {
        System.out.println(fristname+ " "+lastname);

    }

    static void myMethod(int a,int b)
    {
        System.out.println(a+b);

    }
        public static void main(String[] args)
         {
            
        myMethod();
        myMethod("Hellow ","Chakroborty");
        myMethod(12,5);

         }

}
