public class techervalude {
    
    String name;
    int id;
    double salary;

    void display()
    {
    System.out.println("Teacher name is : "+this.name);
    System.out.println("Teacher id is : "+this.id);
    System.out.println("Teacher Cgpa is : "+this.salary +"$");
    }
    
    void setvalue (String name, int id, double cgpa)
    {
        this.name = name;
        this.id = id;
        this.salary = cgpa;
    }

   double getCgpa()
    {
        return this.salary;
    }

public static void main(String[] args) {
    System.out.println("Hi");
}

}