public class inheritance
{

    private  String name;
    private  float salary;


 public void setName(String Name)
 {
    this.name = Name;

 }
 public void setSalary(float salary)
 {
    this.salary = salary;
 }

 public String getName()
 {
    return name;
 }

 public float getSalary()
 {
    return salary;
 }




    public static void main(String[] args) 
    {

      inheritance emp = new inheritance();
       emp.setName("Bipro");
       emp.setSalary(5.6f);
        inheritance emp1 = new inheritance();
       emp1.setName("Nahihhan");
       emp1.setSalary(4.6f);
          System.out.println(emp.getName());
        System.out.println(emp.getSalary());
       System.out.println(emp1.getName());
        System.out.println(emp1.getSalary());
    }
     
}