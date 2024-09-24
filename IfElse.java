import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElse {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if((N%2==0) && ((N>20)||(N==2)||(N==4))) {
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
    }
}

/**
import java.util.*;
public class Sampleswitch {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch(n%2) {
            case 0:
                switch(n) {
                    case 6,8,10,12,14,16,18,20:
                        System.out.println("Weird");
                        break;
                    default:
                        System.out.println("Not Weird");
                        break;
                }
                break;
            case 1:
                System.out.println("Weird");
                break;
        }
    }
}
**/
