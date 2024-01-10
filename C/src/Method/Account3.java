
package Method;

import java.util.Scanner;

public class Account3 {
    int balance = 10000;
    int deposit(int amount){
        if(amount>0){
            balance += amount;
            return 0;
        }
        else{
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account3 depo = new Account3();
        int amount = sc.nextInt();
        int newbalance = depo.deposit(amount);
        if(newbalance == 0){
            System.out.println(depo.balance);
        }
        else{
            System.out.println("Error");
        }
    }
}
