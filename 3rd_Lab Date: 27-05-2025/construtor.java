public class construtor {
   public static String Company_name;
    public String name;
    public float salary;

public void insert_value (String company, String name , float salary)
{
    construtor.Company_name = company;
    this.name = name;
    this.salary = salary;

    
}

public construtor()
{

   // System.out.println("THe costructor is perfectly succed");
}
    
public construtor(String name, float salary)
{
    this.name = name;
    this.salary = salary;
}
public construtor(String company)
{
    construtor.Company_name=company;
}

public void display()
{

    System.out.println("Company name is : "+construtor.Company_name);
    System.out.println("The Employee name is : "+this.name);
    System.out.println("The Employee salary is : "+this.salary);
}


    public static void main(String[] args) 
    {
        construtor emp = new construtor();
        emp.insert_value("Google","Bipro", 5.5f);
        emp.display();
        construtor emp1 = new construtor("facebook");
        emp.display();
        construtor emp2 = new construtor("Nahihan",5.6f);
        emp2.display();
        emp1.display();

        
    }
}