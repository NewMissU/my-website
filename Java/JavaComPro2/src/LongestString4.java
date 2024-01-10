
import java.util.Scanner;


public class LongestString4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String x = "";
        while(true){
            String str = sc.nextLine();
            if(str.length()==0){
                break;
            }
            if(str.length()>=max){
                max = str.length();
                x = str;
            }
        }
        System.out.println(x);
        
        /*for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.length()>=max){
                max = str.length();
                x = str;
            }
        }
        System.out.println(x);*/
    }
}
