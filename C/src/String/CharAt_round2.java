package String;

import java.util.Scanner;


public class CharAt_round2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int target = sc.nextInt();
        if(target <= 0 || target > str.length()){
            System.out.println("invalid position");
        }
        else{
            System.out.println(str.charAt(target-1));
        }
        
    }
}
