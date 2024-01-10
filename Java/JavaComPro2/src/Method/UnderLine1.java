
package Method;

import java.util.Scanner;

public class UnderLine1 {
    
    static void print(Scanner sc, int n){
        for(int i=0;i<n;i++){
            String str = sc.next();
            System.out.println(str);
            System.out.println("--------------------");
        }
    }
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(sc,n);
        
    }

    /* Non-method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            System.out.println(str);
            System.out.println("--------------------");
        }
        
    }*/
}
