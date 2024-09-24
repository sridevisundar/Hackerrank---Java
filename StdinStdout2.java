import java.io.*;
import java.util.*;

public class StdinStdout2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        String a = scan.nextLine();
        scan.close();

        System.out.println("String: " + a);
        System.out.println("Double: " + x);
        System.out.println("Int: " + n);

    }
}

/**
 import java.io.*;
 import java.util.*;

 public class Solution {

 public static void main(String[] args) {
 Scanner scan = new Scanner(System.in);
 int n = scan.nextInt();
 double x = scan.nextDouble();
 scan.nextLine();
 String a = scan.nextLine();
 scan.close();

 System.out.println("String: " + a);
 System.out.println("Double: " + x);
 System.out.println("Int: " + n);

 }
 }
**/
