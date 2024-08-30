
import java.lang.*;
import java.util.*;
import java.util.regex.*;

class Main {

    public static void main(String[] args) {
        System.out.println("Enter the passwords seperated by , :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] passwords = s.split(",");
        String[] validPass = new String[passwords.length];
        int passPointer = 0;
        for (int i = 0; i < passwords.length; i++) {
            // it must have at least 1 letter a-z
            // it must have at least 1 letter A-Z 
            // it must have at least 1 letter 0-9
            // it must have at least 1 letter @#$
            //check using regex
            Matcher matchera_z = (Pattern.compile("[a-z]")).matcher(passwords[i]);
            Matcher matcherA_Z = (Pattern.compile("[A-Z]")).matcher(passwords[i]);
            Matcher matcher0_9 = (Pattern.compile("[0-9]")).matcher(passwords[i]);
            Matcher matcher$ = (Pattern.compile("[@#$]")).matcher(passwords[i]);
            if (passwords[i].length() >= 6 && passwords[i].length() <= 10) {

                if (matchera_z.find() && matcherA_Z.find() && matcher0_9.find() && matcher$.find()) {
                    validPass[passPointer++] = passwords[i];
                }
            }

            // it must have at least 6 characters and at most 10 characters
        }

        for (int i = 0; i < passPointer; i++) {
            System.out.print(validPass[i]);
            if (i != passPointer - 1) {
                System.out.print(",");
            }
        }

    }
}
