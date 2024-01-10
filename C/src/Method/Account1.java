
package Method;

import java.util.Scanner;

public class Account1 {
    int balance = 10000;
    int deposit(int dep){
        balance += dep;
        return balance;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account1 depo = new Account1();
        int dep = sc.nextInt();
        int newbalance = depo.deposit(dep);
        System.out.println(newbalance);
    }
}
