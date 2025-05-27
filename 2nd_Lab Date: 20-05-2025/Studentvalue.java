public class Studentvalue {
    
    String name;
    int id;
    double cgpa;

    void display()
    {
    System.out.println("Student name is : "+this.name);
    System.out.println("Student id is : "+this.id);
    System.out.println("Student Cgpa is : "+this.cgpa );
    }
    
    void setvalue (String name, int id, double cgpa)
    {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

   double getCgpa()
    {
        return this.cgpa;
    }

public static void main(String[] args) {
    System.out.println("Hi");
}

}