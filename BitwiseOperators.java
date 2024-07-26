import java.util.*;
class BitwiseOperators{
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println("the value of x&y is :"+(x&y));
        System.out.println("the value of x|y is :"+(x|y));
        System.out.println("the value of x^y is :"+(x^y)); 
    }
}
