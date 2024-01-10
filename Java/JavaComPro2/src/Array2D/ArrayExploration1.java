
package Array2D;

import java.util.Scanner;

public class ArrayExploration1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row+1][col+1];
        for(int r=1;r<row+1;r++){
            for(int c=1;c<col+1;c++){
                arr[r][c] = sc.nextInt();
            }
        }
        int countpos = 0;
        int countneg = 0;
        int counteven = 0;
        int countodd = 0;
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int tr = sc.nextInt();
            int tc = sc.nextInt();
            if(tr >= 1 && tr < row+1 && tc >= 1 && tc < col+1){
                //System.out.println("value : "+arr[tr][tc]);
                if(arr[tr][tc] % 2 == 0){ //even
                    counteven++;
                    if(arr[tr][tc]>0){
                        countpos++;
                    }
                    else if(arr[tr][tc]<0){
                        countneg++;
                    }
                }
                else{ //odd
                    countodd++;
                    if(arr[tr][tc]>0){
                        countpos++;
                    }
                    else  if(arr[tr][tc]<0){
                        countneg++;
                    }
                }
            }
        }
       //System.out.println("pos : "+countpos);
        //System.out.println("neg : " + countneg);
        //System.out.println("even : "+counteven);
        //System.out.println("odd : "+countodd);
        System.out.println(countpos + " " + countneg + " " + counteven + " " + countodd);
        
        
    }
}
