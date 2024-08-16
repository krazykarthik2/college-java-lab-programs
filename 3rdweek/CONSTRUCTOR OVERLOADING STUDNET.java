//write a java program to define a class describe its constructors, overload the constructors and instantiate its object
import java.lang.*;
import java.util.*;
public class Student
{
    int rollno;
    String name;
    Student(int r, String n)
    {
        rollno = r;
        name = n;
    }
    Student(int r){
        rollno = r;
    }
    Student(String n){
        name = n;
    } 
    public void display() 
    {
        System.out.println(rollno+" "+name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111, "ankit");
        Student s2 = new Student(222);
        Student s3 = new Student("mohit");
        s1.display();
        s2.display();
        s3.display();
        
    }
}
