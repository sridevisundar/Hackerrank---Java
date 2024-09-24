import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();

        char[] ch= s.toCharArray();
        String sNew = new String(ch);
        boolean isPalindrome= true;

        for (int i = 0; i < ch.length / 2; i++) {
            if(ch[i]!=ch[ch.length - i - 1]){
                isPalindrome=false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

/**
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s= scan.nextLine();

        char[] ch= s.toCharArray();
        String str="";

        for(int i=0;i<ch.length;i++){
            for(int j=ch.length-1;j>=0;j--){
                if(ch[i]==ch[j]){
                    str=s;
                }
                else {
                    str="";
                }
            }
        }
        if (str.isEmpty()){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }
    }
}
**/

