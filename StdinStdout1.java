import java.util.Scanner;

public class StdinStdout1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<3; i++) {
            int a = scan.nextInt();
            System.out.println(a);
        }
        scan.close();
    }
}
