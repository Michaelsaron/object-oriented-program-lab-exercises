class Person
{
    private String name;
    private long phno;

    public void read()
    {
        name = "abebe";
        phno = 9020304;
    }

    public void show()
    {
        System.out.println("Name = " + name);
        System.out.println("Phone = " + phno);
    }
}

class Student extends Person
{
    private int rollno;
    private String course;

    public void read()
    {
        super.read();
        rollno = 007;
        course = "software engineering ";
    }

    public void show()
    {
        super.show();
        System.out.println("Roll No. = " + rollno);
        System.out.println("Course = " + course);
    }
}

class Stud extends Person
{

    private String dept_name;
    private String id;

    public void read()
    {
        super.read();
        dept_name = "SWE";
        id = "9090";
    }

    public void show()
    {
        super.show();
        System.out.println("Departement = " + dept_name);
        System.out.println("studid = " + id);
    }
}

class Hierarchical
{

    public static void main(String args[])
    {
        Student s1 = new Student();

        s1.read();
        System.out.println(" Displaying Student Information");

        s1.show();

        
    }
}