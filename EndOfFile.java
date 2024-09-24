/**
import java.io.*;
import java.util.*;
public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line=1;
        while(scan.hasNext()){
            String str=scan.nextLine();
            System.out.println(line+ " " + str);
            line++;
        }
        scan.close();
    }
}
**/

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int line=1;
        for(;scan.hasNext();line++) {
            String str=scan.nextLine();
            System.out.println(line+ " " + str);
        }
        scan.close();
    }
}
