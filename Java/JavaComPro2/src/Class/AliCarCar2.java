package Class;

import java.util.Scanner;

class Car {
    int pass;
    String name;
    int price;
    int labor;
    public Car(int pass, String name, int price, int labor){
        this.pass = pass;
        this.name = name;
        this.price = price;
        this.labor = labor;
    }
    
    static boolean check(String name,int price, int labor){
        if(name != null && name.length() != 0 && price > 0 && labor > 0){
            return true;
        }else{
            return false;
        }
    }
}

class Factory{
    int count;
    boolean[] can_or_not;
    int labor_fac;
    public Factory(int count,boolean[] can_or_not,int labor_fac){
        this.count = count;
        this.can_or_not = can_or_not;
        this.labor_fac = labor_fac;
    }
}

public class AliCarCar2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Car[] cars = new Car[n];
        sc.nextLine();
        int count=0;
        for (int i = 0; i < n; ++i) {
            String name = sc.next();
            int price = sc.nextInt();
            int labor = sc.nextInt();
            if(Car.check(name, price, labor) == true){
                cars[count] = new Car(count, name, price, labor);
                //System.out.println(Car.check(name, price, labor));
                count++;
                System.out.println("valid");
            } 
            else {
                System.out.println("invalid");
            }
        }
        boolean[] can_or_not = new boolean[n];
        Factory[] f = new Factory[n];
        for (int i = 0; i < 5; ++i) {
            int labor_fac = sc.nextInt();
            for (int j = 0; j < 5; ++j) {
                int can = sc.nextInt(); // 0 = can't  1 = can
                if(can == 1){
                    can_or_not[j] = true;
                }
                else{
                    can_or_not[j] = false;
                }
            }
            f[i] = new Factory(count, can_or_not, labor_fac);
        }
        
        int k = sc.nextInt();
        for(int i = 0; i < k ;i++){
            int id = sc.nextInt();
            for(int j=0;j<count;j++){
                if(id == cars[j].pass){
                    if(f[j].can_or_not[j] == true){
                        System.out.println("okay " + (j+1));
                    }
                    else{
                        System.out.println("unable to build");
                    }
                }
                else{
                    System.out.println("invalid model");
                }
            }
        }
    }
}
