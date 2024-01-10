
import java.util.Scanner;


public class TargetPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];
        for(int i=1;i<n+1;i++){
            price[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int sum=0;
        int sum2=0;
        for(int i=0;i<q;i++){
            sum=0;
            sum2=0;
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(m-(k/2)<=0 || m+(k/2)>=n+1){
                System.out.print("no ");
                for(int j=m-(k/2);j<=m+(k/2);j++){
                    if(j > 0 && j<n+1){
                        sum2+=price[j];
                    }
                }
                System.out.println(sum2);     
            }
            else{
                for(int j=m-(k/2);j<=m+(k/2);j++){
                    sum+=price[j];
                }  
                System.out.println(sum);
            }
        }
    }
}
