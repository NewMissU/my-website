
package Method;

import java.util.Scanner;

public class Underline2 {
    static void print(Scanner sc, int n){
        for(int i=0;i<n;i++){
            String str = sc.next();
            System.out.println(str);
            int amount = sc.nextInt();
            for(int j=0;j<amount;j++){
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(sc,n);
    }
}
