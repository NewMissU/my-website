
import java.util.Scanner;


public class the_voice_su {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=1;i<n+1;i++){
            int gender = sc.nextInt();
            int scoreK1 = sc.nextInt();
            int scoreK2 = sc.nextInt();
            
            int countk1=0;
            int countk2=0;
            
            if(gender == 1 && countk1 < k){    //male
                if(scoreK1 >= 9 && scoreK2 >= 9){
                    System.out.println(i + " 1");
                    countk1++;
                }
                else if(scoreK2 >= 9 && countk2 < k){
                    System.out.println(i + " 2");
                    countk2++;
                }
            }
            else if(gender == 2){ //female
                if(scoreK1 >= 9 && scoreK2 >= 9 && countk2 < k){
                    System.out.println(i + " 2");
                    countk2++;
                }
                else if(scoreK1 >= 9 && countk1 < k){
                    System.out.println(i + " 1");
                    countk1++;
                }
            }
        }
    }
}
