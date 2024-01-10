
import java.util.Scanner;


public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int position = sc.nextInt();
        for(int i=1;i<n+1;i++){
            arr[i] = sc.nextInt();
        }
        
        
        while(true){
            if(position >= n+1){
                System.out.println("out of bounds");
                break;
            }
            System.out.println(position +" "+ arr[position]);
            position+=arr[position];   
        }
    }
}
