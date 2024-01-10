
import java.util.Scanner;


public class testLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("length : " + arr.length);
        //System.out.println("");
    }
}
