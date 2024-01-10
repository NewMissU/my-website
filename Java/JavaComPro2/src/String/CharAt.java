package String;

import java.util.Scanner;


public class CharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int index = sc.nextInt();
        if(index>0 && index-1 < text.length()){
            char ch = text.charAt(index-1);
            System.out.println(ch);
        }
        else{
            System.out.println("invalid position");
        } 
    }
}
