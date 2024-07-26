
//diamond pattern simple using while loop

import java.util.*;
import java.lang.*;
import java.io.*;

class While_DiamondPattern{

    public static void main (String[] args) throws java.lang.Exception
    {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
           
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
