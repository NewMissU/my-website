
import java.util.Scanner;


public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String subintext = sc.next();
        int index = -2;
        boolean check = false;
        for(int i=0;i<text.length();i++){
            int in = text.indexOf(subintext, i);
            if(in != index && in != -1){
                System.out.print((in+1) + " ");
                index = in;
                check = true;
            }
        }
        if(check == false){ // !check or check != true
            System.out.print("string not found" );
        }
    }
}
