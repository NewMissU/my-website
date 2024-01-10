/*
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

public class AliCarCar1 {

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

        for(int i = 0; i < count ; ++i){
            System.out.println((i+1) + " " + cars[i].name);
        }
    }
}
*/