
package Method;

import java.util.Scanner;

public class Account2 {
    int balance = 10000;
    void deposit(int amount){
        balance += amount;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account2 depo = new Account2();
        int amount = sc.nextInt();
        depo.deposit(amount);
        System.out.println(depo.balance);
    }
}
