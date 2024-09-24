import java.io.*;
import java.util.*;

public class SubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] myArray = new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            myArray[i] = scan.nextInt();
        }
        for (int i=0; i <n; i++){
            int sum=0;
            for (int j=i; j<n; j++){
                sum+=myArray[j];
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}