import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SyntaxChecker {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        scan.nextLine();
        for (int i=0;i<n;i++) {
            String s= scan.nextLine();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }
}