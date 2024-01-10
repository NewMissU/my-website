
import java.util.Scanner;


public class LongestString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String x = "";
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.length()>max){
                max = str.length();
                x = str;
            }
        }
        System.out.println(x);
    }
}
