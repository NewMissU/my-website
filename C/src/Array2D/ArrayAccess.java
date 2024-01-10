
package Array2D;

import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[n+1];
        int[][] arr = new int[n+1][];
        for(int i=1;i<n+1;i++){
            k[i] = sc.nextInt();
            arr[i] = new int[k[i]];
            for(int j=0;j<k[i];j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        int countout=0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while(true){
            int posArray = sc.nextInt();
            if(posArray == 0){
                break;
            }
            int index = sc.nextInt();
            if(posArray >= 1 && posArray < n+1 && index >= 0 && index < k[posArray]){
                    //System.out.println("pos : "+posArray + " index : " + index);
                    //System.out.println("arr : "+arr[posArray][index]);
                    sum += arr[posArray][index];
                    if(arr[posArray][index] > max){
                        max = arr[posArray][index];
                    }
                    if(arr[posArray][index] < min){
                        min = arr[posArray][index];
                    } 
            }
            else{
                countout++;
            }
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        System.out.println(countout);
    }
}
