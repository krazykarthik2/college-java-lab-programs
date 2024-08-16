import java.lang.*;
import java.util.*;

public class MeaningFulSubstr{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        int count =0 ;
        //n*n+1/2 , the sum of n numbers where n is length of the string
        System.out.println("There would be " + (s.length() * (s.length() + 1) / 2) + " meaningful substrings");
       for (int i = 0; i < s.length(); i++) {
           for (int j = i + 1; j <= s.length(); j++) {
               System.out.println(s.substring(i,j));
               count++;
           }
       }

       System.out.println(count);
    }
}
