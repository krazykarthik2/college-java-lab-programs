import java.lang.*;
import java.util.*;
class DoWhileArmStrong
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp = n;
        int digit =0;
        do{
            digit = n%10;
            sum+=Math.pow(digit, 3);
            n/=10;
        }while(n!=0);
        System.out.println("given number= "+temp);
        System.out.println("sum of cubes of digits= "+sum);
        if(temp==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
