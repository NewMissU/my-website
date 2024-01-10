
package Array2D;

import java.util.Scanner;

public class ArrayExploration2 {
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
        int countrepeat=0;
        int k = sc.nextInt();
        int[] tr = new int[k];
        int[] tc = new int[k];
        for(int i=0;i<k;i++){
            tr[i] = sc.nextInt();
            tc[i] = sc.nextInt();
            if(tr[i] >= 1 && tr[i] < row+1 && tc[i] >= 1 && tc[i] < col+1){
                //System.out.println("value : "+arr[tr][tc]);
                countrepeat=0;
                if(arr[tr[i]][tc[i]] % 2 == 0){ //even
                    counteven++;
                    if(arr[tr[i]][tc[i]]>0){
                        countpos++;
                    }
                    else if(arr[tr[i]][tc[i]]<0){
                        countneg++;
                    }
                }
                else{ //odd
                    countodd++;
                    if(arr[tr[i]][tc[i]]>0){
                        countpos++;
                    }
                    else if(arr[tr[i]][tc[i]]<0){
                        countneg++;
                    }
                }
            }
            else{ //out of row and col
                countrepeat++;
                int value = arr[tr[i-countrepeat]][tc[i-countrepeat]];
                if(value % 2 == 0){ //even
                    counteven++;
                    if(value>0){
                        countpos++;
                    }
                    else if(value<0){
                        countneg++;
                    }
                }
                else{ //odd
                    countodd++;
                    if(value>0){
                        countpos++;
                    }
                    else if(value<0){
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
