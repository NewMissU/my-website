
import java.util.Random;

public class SearchFindingMatch {
    public static void main(String[] args) {
        int usedNumber[] = new int[100+1]; //0-100
        Random rand = new Random();
        int n = rand.nextInt(20 - 10 + 1) + 10; //(max-min+1)+min
        System.out.println("--- Random Numbers ["+ n +"] ---");
        int count = 0;
        for(;;){
            boolean isReplicate = false;
            if(count == n){
                break;
            }
            if(count != n){
                int number = rand.nextInt(100 - 0 + 1) +0;
                for(int i =0;i<100+1;i++){ //0-100
                    if(usedNumber[i] == number){
                        isReplicate = true;
                    }
                }
                if(isReplicate == false){
                    usedNumber[number] = number;
                    count++;
                }
                
            }
        }
        System.out.println("");
        for(int i =0;i<usedNumber.length;i++){
            System.out.print(usedNumber[i] + " ");
        }
    }
}
