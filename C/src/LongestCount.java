
import java.util.Scanner;


public class LongestCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String x = "";
        int count=0;
        while(true){
            String str = sc.nextLine();
            if(str.length()==0){
                break;
            }
            //System.out.println("length : "+str.length());
            if(str.length()>max){
                max = str.length();
                count=0;
                count++;
                //x = str;
            }
            else if(str.length()==max){
                count++;
            }
            
        }
        System.out.println(max);
        System.out.println(count);
    }
}
