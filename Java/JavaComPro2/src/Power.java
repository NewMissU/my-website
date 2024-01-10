
import java.util.Scanner;


public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n+1];
        for(int i=1;i<n+1;i++){
            price[i] = sc.nextInt();
        }
        int[] labor = new int[n+1];
        for(int i=1;i<n+1;i++){
            labor[i] = sc.nextInt();
        }
        int[] power = new int[n+1];
        for(int i=1;i<n+1;i++){
            power[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int sum=0;
        int sum2=0;
        int count=0;
        int ok_labor=0;
        int countpower=0;
        for(int i=0;i<q;i++){
            sum=0;
            sum2=0;
            ok_labor=0;
            count=0;
            countpower=0;
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
                    count++;
                    if(labor[j] >= 5){
                        ok_labor++;
                    }
                    if(power[j] == 1){
                        countpower++;
                    }
                }  
                if(ok_labor == count){
                    System.out.print(sum + " ");
                    if(countpower>=1){
                        System.out.print("labor");
                        System.out.println(" power");
                    }
                    else{
                        System.out.println("labor");
                    }
                }
                else{
                    System.out.println(sum);
                    if(countpower>=1){
                        System.out.print(sum);
                        System.out.println(" power");
                    }
                }
            }
        }
    }
}
