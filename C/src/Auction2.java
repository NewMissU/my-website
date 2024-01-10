
import java.util.Scanner;


public class Auction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];
        for(int i=1;i<n+1;i++){
            price[i] = sc.nextInt();
        }
        int round = sc.nextInt();
        int[] new_price = new int[n+1];
        int[] max_price = new int[n+1];
        int[] count = new int[n+1];
        for(int j=0;j<round;j++){
            for(int i=1;i<n+1;i++){
                new_price[i] = sc.nextInt();
//                if(price[i] > max_price[i]){
//                    max_price[i] = price[i];
//                }
                if(new_price[i] > price[i]){
                    if(count[i] >= 3){
                        price[i] = max_price[i];
                    } 
                    else{
                        price[i] = new_price[i];
                        max_price[i] = price[i];
                    }
                }
                else if(new_price[i] <= price[i]){
                    count[i]++;
                }
                System.out.print(price[i] + " ");
                System.out.print("max_price : " + i + " ");
                System.out.print(max_price[i] + " ");
            }
            System.out.println("");
        }
    }
}
