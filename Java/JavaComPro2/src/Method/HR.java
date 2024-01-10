
package Method;

import java.util.Scanner;

class Employee { 
    int exWork=0;
    int opWork=0;
   
    String Name;
    String ID;
    int TYPE;
    int Wage;
    public Employee(String name, String ID,int type,int wage){
        Name = name;
        this.ID = ID;
        TYPE = type;
        Wage = wage;
                
    }
    
    boolean workExecutive(int hour){ //executive hour
        if(hour > 0){
            exWork+=hour;
            return true;
        }
        else{
            System.out.println("Invalid hour for executive work");
            return false;
        }
    }
    
    boolean workOperation(int hour){ //opertion hour
        if(hour > 0){
           opWork+=hour;
           return true;
        }
        else{
            System.out.println("Invalid hour for operation work");
            return false;
        }
    }
     
    int calPayment(){ //money
        int money=0;
        if(TYPE == 1){
            money = (Wage*exWork) + (2*Wage*opWork);
        }
        else if(TYPE == 2){
            money = (Wage*opWork) + (2*Wage*exWork);
        }
        return money;
    }
    
    void printStats(){ //show
        System.out.println("ID: "+ ID);
        System.out.println("Name: "+Name);
        if(TYPE == 1){
            System.out.println("Position: " + "Executive");
        }
        else if(TYPE == 2){
            System.out.println("Position: " + "Operation");
        }
        System.out.println("Ex Hour: "+exWork);
        System.out.println("Op Hour: "+opWork);
        System.out.println("Wage: "+Wage);
        System.out.println("Payment: " + calPayment());
    }
}

public class HR {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in); 
        String name = scan.next(); 
        String ID = scan.next(); 
        int type = scan.nextInt(); 
        int wage = scan.nextInt(); 
        Employee employee = new Employee(name,ID,type,wage); 
        final int N = scan.nextInt(); 
        for(int i = 0; i < N; ++i){ 
            int workType = scan.nextInt(); //T
            int hour = scan.nextInt(); //H
            if(workType == 1){
                //employee.workExecutive(hour);
                //System.out.println(employee.workExecutive(hour));
                System.out.println(employee.workExecutive(hour) + " "+ employee.calPayment());
            }
            else if(workType == 2){
                //employee.workOperation(hour);
                System.out.println(employee.workOperation(hour) + " "+ employee.calPayment());
            }
            
        }
        employee.printStats();
    } 
}
