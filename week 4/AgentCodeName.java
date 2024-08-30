
import java.lang.*;
import java.util.*;

public class AgentCodeName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String codeName = "";
        String confirm = "";

        // (a) Prompt to get the user to enter a suitable name into the codeName string
        System.out.print("Enter a suitable code name: ");
        codeName = sc.nextLine();

        // (b) Use a while loop to ensure the string entered is greater than 6 characters
        while (!(codeName.length() > 6)) {
            System.out.println("INVALID CODENAME");
            System.out.print("Please enter a valid code name: ");
            codeName = sc.nextLine();
        }

        // (c) Ask the user to re-enter the code name into the confirm string
        System.out.print("Re-enter the code name to confirm: ");
        confirm = sc.nextLine();

        if (codeName.equals(confirm)) {
            System.out.println("CODE NAME CONFIRMED");
        } else {
            System.out.println("CODE NAME MIS-MATCH");
            System.exit(0);
        }

        if (codeName.length() > 0 && codeName.charAt(codeName.length() - 1) == 'X') {
            //test case passed nothing to do 
        } else {
            System.out.println("Code name must end with 'X'.");
            System.exit(0);
        }

        if (codeName.startsWith("Agent")) {
            //test case passed nothing to do 
        } else {
            System.out.println("Code name must start with 'Agent'.");
            System.exit(0);
        }

        sc.close();
    }
}
