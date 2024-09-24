import java.io.*;
import java.util.*;

public class Loops2 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0;i<q;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int result =a;
            for(int j=0;j<n;j++){
                result+=Math.pow(2,j)*b;
                System.out.print(result + " ");
            }
            System.out.println();
        }

    }
}
