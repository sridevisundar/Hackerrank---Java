import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        int q = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<q;i++){
            String query=scan.next();
            if(query.equals("Insert")){
                int x = scan.nextInt();
                int y = scan.nextInt();
                list.add(x,y);
            }
            else if(query.equals("Delete")){
                int x= scan.nextInt();
                list.remove(x);
            }
            if (scan.hasNextLine()) {
                scan.nextLine();
            }
        }
        for(Integer num:list) {
            System.out.print(num+" ");
        }
    }
}