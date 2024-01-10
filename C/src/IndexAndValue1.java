
import java.util.Scanner;


public class IndexAndValue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int count=0;
        for(int i=0;i<2;i++){
            int index = sc.nextInt();
            if(index >= 0 && index < n){
                System.out.println(arr[index]);
                count++;
            }
            else{
                System.out.println("-1");
            }
        }
        System.out.println(count);
    }
}
