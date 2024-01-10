/*
package Class;

import java.util.Scanner;

class Dept{
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int amountteacher;
    int amountstudent;
    public Dept(int amountteacher,int amountstudent){
        this.amountteacher = amountteacher;
        this.amountstudent = amountstudent;
        computeIncome(amountteacher,amountstudent);
    }
    
    void computeIncome(int amountteacher,int amountstudent){
        ministryBudget = (amountteacher*500000)+(amountstudent*3000);
        eduFee = amountstudent*5000;
        serviceFee = 300000;
        donation = 100000;
    }
    
    void printReport(){
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = "+donation);
    }
    
}


public class Department1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountteacher = sc.nextInt();
        int amountstudent = sc.nextInt();
        Dept dept = new Dept(amountteacher,amountstudent);
        dept.printReport();
    }
}*/
