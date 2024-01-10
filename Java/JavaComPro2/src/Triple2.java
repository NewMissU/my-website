
import java.util.Scanner;


public class Triple2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R+1][C+1];
        for(int r=1;r<R+1;r++){
            for(int c=1;c<C+1;c++){
                arr[r][c] = sc.nextInt();
            }
        }
        int v = sc.nextInt();
        
        //loop check
        int newC=0;
        for(int r=1;r<R+1;r++){
            int count=0;
            for(int c=1;c<C+1;c++){
                if(arr[r][c] == v){
                    count++;
                    //System.out.print(arr[r][c] + " ");
                    //System.out.println("c = " + c + " count = " + count);
                    if(count==3){
                        count=0;
                        int position = c-2;
                        //System.out.print("position: " + position + " "); // position start with : 1 2 3 -->
                        System.out.print(position + " ");
                        newC=c; //next start c 
                        //System.out.println("|change start c to: " + newC +"| ");    // c start with : 0 1 2 -->
                        //c=newC-1;
                        c=newC-2;
                    }
                }
                else{
                    count=0;
                }
            }
            if(count==0){
                System.out.println("");
                System.out.println("0");
            }
        }
    }
}
