
package Class;

import java.util.Scanner;

class Dept{
    int ministryBudget;
    int eduFee;
    int serviceFee;
    int donation;
    int amountteacher;
    int amountstudent;
    int salary;
    int elec;
    int eduCost;
    int totalincome;
    int totalexpense;
    int Income;
    int Expense;
    public Dept(int amountteacher,int amountstudent){
        this.amountteacher = amountteacher;
        this.amountstudent = amountstudent;
        Income = computeIncome();
        Expense = computeExpense();
    }
    
    int computeIncome(){
        ministryBudget = (amountteacher*500000)+(amountstudent*3000);
        eduFee = amountstudent*5000;
        serviceFee = 300000;
        donation = 100000;
        totalincome = ministryBudget+eduFee+serviceFee+donation;
        return totalincome;
    }
    
    int computeExpense(){
        salary = amountteacher*600000;
        elec = (amountstudent+amountteacher)*2000;
        eduCost = amountstudent*4000;
        totalexpense = salary+elec+eduCost;
        return totalexpense;
    }
    
    void printReport(){
        System.out.println("total income = "+totalincome);
        System.out.println("total expense = "+totalexpense);
        System.out.println("income - expense = " + (Income-Expense));
        System.out.println("ministry budget = "+ministryBudget);
        System.out.println("education fee = "+eduFee);
        System.out.println("service fee = " + serviceFee);
        System.out.println("donation = "+donation);
        System.out.println("salary = " + salary);
        System.out.println("electricity = "+ elec);
        System.out.println("educational cost = "+ eduCost);
    }
    
}

public class Department2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amountteacher = sc.nextInt();
        int amountstudent = sc.nextInt();
        Dept dept = new Dept(amountteacher,amountstudent);
        dept.printReport();
    }
}
