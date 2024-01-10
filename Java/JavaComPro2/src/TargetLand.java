
import java.util.Scanner;


public class TargetLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];
        for(int i=1;i<n+1;i++){
            price[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int sum=0;
        int valk=0;
        for(int i=0;i<q;i++){
            sum=0;
            int k = sc.nextInt();
            int m = sc.nextInt();
            if(m-(k/2)<=0 || m+(k/2)>=n+1){
                System.out.println("no");
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
