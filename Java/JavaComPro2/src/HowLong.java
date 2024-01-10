
import java.util.Scanner;


public class HowLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i] = sc.nextInt();
        }
        
        
        for(int i=0;i<3;i++){
            int count=0;
            int target = sc.nextInt();
            for(int j=target;j<n+1;j++){
                if(arr[j] == 0){
                    break;
                } 
                count++;
            }
            System.out.println(count);
        }
    }
}
