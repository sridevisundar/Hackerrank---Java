import java.util.*;
public class SubstringComparisons {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int k = scan.nextInt();

        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 0; i <= s.length() - k; i++) {
            String substr = s.substring(i, i + k);
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }
            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}
