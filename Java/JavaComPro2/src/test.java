
import java.util.Scanner;


public class test{
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("X = " + x);
        int [] arr = new int[5];
        for(int i =0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<5;i++){
            System.out.println(i + " " + arr[i]);
        }
        
    }

}