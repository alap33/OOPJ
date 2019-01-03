public class Student
{
    String name;
    String div;
    int marks;

    //Default constructor//
    public Student()
    {

    }

   
    //paramitrized constructor//
    public Student(String name, String div, int marks)
    {
        this.name = name;
        this.div = div;
        this.marks = marks;

    }


    Student findTopper (Student stu1, Student stu2)
    {
        if(stu1.marks>stu2.marks)
            {
                return stu1;
            }

        else
        {
            return stu2;
        }


    }

    //it passes and returns the values//
    public static void main(String [] args)
    {
 
         Student s1 = new Student("yash", "Tc3", 90);
         Student s2 = new Student("alap","Tc3",95);

         Student topper = new Student();

         topper = topper.findTopper(s1,s2);

         System.out.println("Topper of the class "+topper.div+" is :"+topper.name);    

    }
}

