
package String;

import java.util.Scanner;

public class CharWatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[3];
        for(int i=0;i<3;i++){
            alphabet[i] = sc.next().charAt(0);
        }
        String text = sc.next();
        int n = sc.nextInt();
        int count[] = new int[3];
        int countout =0;
        for(int i=0;i<n;i++){
            int index = sc.nextInt();
            //check
            for(int j=0;j<3;j++){
                if(index-1 < 0 || index-1 > text.length()-1){
                    countout++;
                    break;
                }
                if(text.charAt(index-1) == alphabet[j]){
                    count[j]++;
                }
            }
        }
        
        for(int j=0;j<3;j++){
            System.out.println(count[j]);
        }
        System.out.println(countout);
    }
}
