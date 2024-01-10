
import java.util.Scanner;

public class odd_vs_even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        for(int i=0;i<8;i++){
            int x = scan.nextInt();
            if(x%2==0){
                even += x;
            }
            else{
                odd += x;
            }
        }
        if(even>odd){
            System.out.println("even");
            System.out.println(even);
            System.out.println(odd);
        }
        else if(odd>even){
            System.out.println("odd");
            System.out.println(even);
            System.out.println(odd);
        }
        else if(odd==even){
            System.out.println("equal");
            System.out.println(even);
            System.out.println(odd);
        }
        
    }
}
