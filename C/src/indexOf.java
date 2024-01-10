
import java.util.Scanner;


public class indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String subintext = sc.next();
        int index = text.indexOf(subintext);
        if(index >= 0){
            System.out.println(index+1); // +1 because string start with 0 but we need start with 1
        }
        else{
            System.out.println("string not found");
        }
    }
    
}
