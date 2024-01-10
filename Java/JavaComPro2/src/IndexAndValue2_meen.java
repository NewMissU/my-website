import java.util.Scanner;

public class IndexAndValue2_meen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        int index2 = sc.nextInt();

        int count=0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (index == i) {
                System.out.println(arr[i]);
                count++;
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (index < 0 || index >= n) {
            System.out.println("-1");
        }

        for (int i = 0; i < n; i++) {
            if (index2 == i) {
                System.out.println(arr[i]);
                count++;
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        if (index2 < 0 || index2 >= n) {
            System.out.println("-1");
        }
        if(count>0){
            System.out.println(max);
        }
        else if(count ==0){
            System.out.println("No");
        }
    }
}
