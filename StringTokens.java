import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if (s.isEmpty() || s.isBlank()) {
            System.out.println("0");
            return;
        }
        String[] words=s.split("\\s+|!+\\s*|,+\\s*|\\?+\\s*|\\.+\\s*|_+\\s*|'+\\s*|@+\\s*");
        System.out.println(words.length);
        for (String w:words){
            System.out.println(w);
        }
    }
}