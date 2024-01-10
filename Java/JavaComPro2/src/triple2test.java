
import java.util.Scanner;

public class triple2test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int arr[][] = new int[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                arr[r][c] = sc.nextInt();
            }
        }
        int v = sc.nextInt();
        
        //loop check
        int newC;
        for(int r=0;r<R;r++){
            int count=0;
            int startC=0;
            for(int c=startC;c<C;c++){
                if(arr[r][c] == v){
                    count++;
                    //System.out.print(arr[r][c] + " ");
                    System.out.println("c = " + c + " count = " + count);
                    if(count==3){
                        count=0;
                        int position = (c+1)-2;
                        System.out.print("position: " + position + " "); // position start with : 1 2 3 -->
                        newC=c-1; //next start c 
                        System.out.println("|change start c to: " + newC +"| ");    // c start with : 0 1 2 -->
                        startC=newC;
                    }
                }
                else{
                    count=0;
                }
                /*if(count==3){
                    count=0;
                    int position = (c+1)-2;
                    System.out.print("position: " + position + " "); // position start with : 1 2 3 -->
                    newC=c-1; //next start c 
                    System.out.println("|start c: " + newC +"| ");    // c start with : 0 1 2 -->
                    c=newC;
                }*/
                
            }
            System.out.println("");
            /*if(count==0){
                System.out.println("");
                System.out.println("0");
            }*/
        }
    }
}
