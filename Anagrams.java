import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        if(ch1.length!=ch2.length) {
            System.out.println("Not Anagrams");
            return;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram=true;

        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i]!=ch2[i]) {
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("Anagrams");
        }
        else {
            System.out.println("Not Anagrams");
        }
    }
}