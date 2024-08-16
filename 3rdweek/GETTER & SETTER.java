// write a java program to define a class define instance methods for setting and retrieving values of instance variables and instantiate its object.
import java.lang.*;
import java.util.*;
class Student
{
    int rollno;
    String name;
    Student (int r, String n)
    {   rollno = r;
        name = n;
    }
    void setRoll(int r)
    {   rollno = r;
    }
    void setName(String n)
    {   name = n;
    }
    int getRoll()
    {   return rollno;
    }
    String getName()
    {   return name;
    }
}
class Main{
    public static void main(String[] args) {
        Student s = new Student(111, "ankit");
        System.out.println("The default details of student are: ");
        System.out.println("Roll number of student: " + s.getRoll());
        System.out.println("Name of student: " + s.getName());
        System.out.println("Enter roll no of student:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.println("Enter name of student:");
        String n = sc.next();
        s.setRoll(r);
        s.setName(n);
        System.out.println("The details of student after changing are: ");
        System.out.println("Roll number of student: " + s.getRoll());
        System.out.println("Name of student: " + s.getName());
    }
}
