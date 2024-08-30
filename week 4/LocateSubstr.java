//1.	Write a Java program to locate a substring in given main string. Display the previous and next characters of substring. Assume that substring and main string are non-empty strings entered by user.
import java.lang.*;
import java.util.*;
class Demo{
    public static void main(String[] args){
        System.out.println("Enter 2 strings:");
        Scanner sc =  new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int startIndex = s1.indexOf(s2);
        if (startIndex==-1){
            System.out.println("2nd string not found in 1st string");
        }
        else if( startIndex==0){
            System.out.println("It started from the beginning");
        }else {
            System.out.println("letter before:" + s1.charAt(startIndex-1));
        }
        int endIndex = startIndex+ s2.length()-1;
        if( endIndex==s1.length()-1)  {
            System.out.println("It lasted towards the end");
        }else {
            System.out.println("letter after:"+s1.charAt(endIndex+1));
        }
    
    }
}
