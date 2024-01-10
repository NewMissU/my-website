
import java.util.Scanner;


public class HowLongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        for(int i=1;i<n+1;i++){
            arr[i] = sc.nextInt();
        }
        
        
        int count=0;
        int max=0;
        // loop max
        for(int i=1;i<n+1;i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count=0;
            }
            if(count > max){
                max = count;
            }
        }
        //System.out.println("max : " + max);
        System.out.println(max);
        //loop print
        for(int i=1;i<n+1;i++){
            if(arr[i] == 1){
                count++;
            }
            else{
                count=0;
            }
            if(count==max){
                System.out.print((i-max+1) + " ");
                //System.out.println("position " + (i-max+1));
            }
        }  
    }
}
