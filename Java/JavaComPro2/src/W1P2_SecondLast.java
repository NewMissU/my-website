
import java.util.Scanner;


public class W1P2_SecondLast {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x < 10){
            System.out.println("0");
        }
        else{
            System.out.println(x/10%10);
        }
    }
    
}
