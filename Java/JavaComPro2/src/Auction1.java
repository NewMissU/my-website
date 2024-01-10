
import java.util.Scanner;


public class Auction1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];
        for(int i=1;i<n+1;i++){
            price[i] = sc.nextInt();
        }
        int round = sc.nextInt();
        int[] new_price = new int[n+1];
        for(int j=0;j<round;j++){
            for(int i=1;i<n+1;i++){
                new_price[i] = sc.nextInt();
                if(new_price[i] > price[i]){
                    price[i] = new_price[i];
                }
                System.out.print(price[i] + " ");
            }
            System.out.println("");
        }
    }
}
