import java.lang.*;
import java.util.*;
class Demo{
    public static void main(String [] args){
        int a,b,c;
        System.out.println("Enter the 3 numerals:");
        Scanner scan = new Scanner(System.in);
        a= scan.nextInt();
        b= scan.nextInt();
        c =scan.nextInt();
        scan.close();
        int max = a>b?a:b;
        max = max>c?max:c;
        System.out.println("Maximum value is:"+ max);
    }
}
