
import java.util.Scanner;


public class reserve_3_vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dayA = 0;
        int dayB = 0;
        int dayC = 0;
        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            if(dayA <= dayB && dayA <= dayC){
                dayA+=t;
                System.out.println("A");
                //System.out.println("A"+ " day :" + dayA);
            }
            else if(dayB<=dayC){
                dayB+=t;
                System.out.println("B");
                //System.out.println("B"+ " day :" + dayB);
            }
            else{
                dayC+=t;
                System.out.println("C");
                //System.out.println("C" + " day :" + dayC);
            }
        }
    }
    
}
