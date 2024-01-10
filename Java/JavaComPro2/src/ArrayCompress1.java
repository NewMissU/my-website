
import java.util.Scanner;


public class ArrayCompress1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        
        //calculate compress
        int count_k = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == k){
                count_k++;
            }
        }
        int[] sum = new int[count_k+1];
        int startposition=0;
        int countstart_nextposition=0;
        for(int j=0;j<count_k+1;j++){
            
            for(int i=startposition;i<n;i++){   //startposition start with 0 --> n-1
                countstart_nextposition++;  
                if(arr[i] == k){
                    break;
                }
                else{
                    sum[j]+=arr[i];
                }
            }
            //change position start of another round , if don't do = value repeat
            startposition = countstart_nextposition;
            
        }
        
        //Print
        for(int j=0;j<count_k+1;j++){
            if(j != count_k){
                System.out.print(sum[j] + " " + k + " ");
            }
            else{
                System.out.print(sum[j]);
            }
            
        }
        
    }
}
