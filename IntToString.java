import java.io.*;
import java.util.*;

public class IntToString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n>=-100 && n<=100){
            String s= String.valueOf(n);
            System.out.println("Good job");
        }
        else {
            System.out.println("Wrong answer");
        }
    }
}
