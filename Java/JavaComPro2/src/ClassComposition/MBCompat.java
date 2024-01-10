
package ClassComposition;

import java.util.Scanner;

class CPU{
    public String model;
    public int clocks;
    public int socket;
    public int memType;
    public boolean valid;
    public CPU(String model,int clocks,int socket,int memType){
        this.model = model;
        this.clocks = clocks;
        this.socket = socket;
        this.memType = memType;
        valid = isValidSpec(model, clocks, socket, memType);
    }
    
    boolean isValidSpec(String model,int clocks,int socket, int memType){
        int incorect = 0;
        if(model == null || model.length() == 0){
            incorect++;
        }
        if(clocks <= 0){
            incorect++;
        }
        if(socket <= 0){
            incorect++;
        }
        if(memType <= 0 || memType > 10){
            incorect++;
        }
        if(incorect > 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    void printInfo(){
        System.out.println(model);
        System.out.println(clocks);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }
}

class MainBoard{
    public String model;
    public int socket;
    public int memType;
    public boolean valid;
    
    public MainBoard(String model,int socket,int memType){
        this.model = model;
        this.socket = socket;
        this.memType = memType;
        valid = isValidSpec(model, socket, memType);
    }
    
    boolean isValidSpec(String model,int socket, int memType){
        int incorect = 0;
        if(model == null || model.length() == 0){
            incorect++;
        }
        if(socket <= 0){
            incorect++;
        }
        if(memType <= 0 || memType > 10){
            incorect++;
        }
        if(incorect > 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    void printInfo(){
        System.out.println(model);
        System.out.println(socket);
        System.out.println(memType);
        System.out.println(valid);
    }

}

class Computer{
    public boolean valid;
    MainBoard mb;
    CPU cpu;
    public Computer(MainBoard mb,CPU cpu){
        this.mb = mb;
        this.cpu = cpu;
        valid = isValidCom(mb, cpu);
    }
    
    boolean isValidCom(MainBoard mb,CPU cpu){
        if(mb.socket == cpu.socket && mb.memType == cpu.memType){
            valid = true;
        }
        else{
            valid = false;
        }
        if(mb.valid == false || cpu.valid == false){
            valid = false;
        }
        return valid;
    }
    
    void printInfo(){
        if(valid == true){
            System.out.println(cpu.model);
            System.out.println(cpu.clocks);
            System.out.println(mb.model);
            System.out.println(mb.socket);
            System.out.println(mb.memType); 
        }
        else{
            System.out.println("Invalid Spec");
            cpu.printInfo();
            mb.printInfo();
        }
        
    }
}


public class MBCompat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String model = sc.nextLine();
        int clocks = sc.nextInt();
        int socket = sc.nextInt();
        int memType = sc.nextInt();
        
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        CPU cpu = new CPU(model, clocks, socket, memType);
        
        sc.nextLine();
        model = sc.nextLine();
        socket = sc.nextInt();
        memType = sc.nextInt();
        if(model.length() == 0 && socket % 2 == 0){
            model = null;
        }
        MainBoard mb = new MainBoard(model,socket,memType);
        Computer com = new Computer(mb,cpu);
        com.printInfo();
    }
}
