
package Class;

import java.util.Scanner;

class FieldManager{
    int amountbed;
    int[] bedreserved;
    public FieldManager(int n){
        amountbed = n;
        bedreserved = new int[n+1];
    }
    
    int reserveBed(){
       for(int i=1;i<amountbed+1;i++){
           if(bedreserved[i] == 0){
               bedreserved[i] = 1;
               return i;
           }
       }
       return -1;
    }
    
    boolean discharge(int numbed){
        if(bedreserved[numbed] == 1){
            bedreserved[numbed] -= 1;
            return true;
        }
        else{
            return false;
        }
    }
    
    void reportBed(){
        int sum =0;
        for(int i=1;i<amountbed+1;i++){
            sum += bedreserved[i];
        }
        System.out.println(sum);
    }
}

public class FieldHospital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FieldManager fm = new FieldManager(n);
        int q = sc.nextInt();
        for(int i = 0; i < q; ++i){
            int k = sc.nextInt();
            int numbed = sc.nextInt(); 
            if(k == 1 && numbed == 0){
                int reser = fm.reserveBed();
                if(reser != -1){
                   System.out.println("Bed "+ reser +" reserved"); 
                }
                if(reser == -1){
                    System.out.println("No bed vacancy");
                }
            }
            else if(k == 2 && numbed != 0){
                boolean result = fm.discharge(numbed);
                if(result == true){
                    System.out.println("Patient discharged");
                }
                else{
                    System.out.println("Invalid bed number");
                }
            }
            else if(k == 3 && numbed == 0){
                fm.reportBed();
            }
        }
    }
}
