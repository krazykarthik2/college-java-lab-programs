import java.util.*;
import java.lang.*;
import java.io.*;
class CalcTipAndTax_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost: ");
        float cost = sc.nextFloat();
        System.out.println("Enter the tip in percentage: ");
        float tip = sc.nextFloat();
        System.out.println("Enter the tax in percentage: ");
        float tax = sc.nextFloat();
        float tipAmount  = (cost*tip/100);
        float taxAmount = (cost*tax/100);
        System.out.println("The tip amount is: "+tipAmount);
        System.out.println("The tax amount is: "+taxAmount);
        float sum = cost + tipAmount + taxAmount;
        int total =(int)( Math.ceil(sum));
        System.out.println("The total billed amount is: "+total);
    }
}
