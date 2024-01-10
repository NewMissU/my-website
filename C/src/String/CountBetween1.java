
package String;

import java.util.Scanner;

public class CountBetween1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int check[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int countx=0;

        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int county=0;
        
        int countout=0;
        
        for(int i=0;i<n;i++){
            if(arr[i] >= x1 && arr[i] <= x2 ){
                countx++;
                check[i]=1;
            }
            if(arr[i] >= y1 && arr[i] <= y2 ){
                county++;
                check[i]=1;
            }
            if(check[i]==0){
                countout++;
            }
        }
        
        
        
        System.out.println(countx);
        System.out.println(county);
        System.out.println(countout);
    }
}
