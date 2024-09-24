import java.util.*;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int myArray[][]= new int[6][6];
        for(int i=0;i<6;i++) {
            for(int j=0;j<6;j++) {
                myArray[i][j]=scan.nextInt();
            }
        }
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++) {
                int top=myArray[i][j]+myArray[i][j+1]+myArray[i][j+2];
                int middle=myArray[i+1][j+1];
                int bottom=myArray[i+2][j]+myArray[i+2][j+1]+myArray[i+2][j+2];
                int hourglass=top+middle+bottom;
                if(hourglass>maxsum){
                    maxsum=hourglass;
                }
            }
        }
        System.out.println(maxsum);
    }
}
