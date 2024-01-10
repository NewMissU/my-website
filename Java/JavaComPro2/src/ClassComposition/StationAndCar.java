package ClassComposition;

import java.util.Scanner;

class Station {
    // Enter your code here
    int benzin;
    int diesel;
    public Station(int benzin,int diesel){
        this.benzin = benzin;
        this.diesel = diesel;
    }
    
    void dispense(Car car){
        int gasType = car.gasType; // 1 ben , 2 diesel
        int needMorefuel = car.getNeededVol();
        if(gasType == 1){
            if(benzin > needMorefuel){
                benzin -= needMorefuel;
                System.out.println("Dispense " + needMorefuel + " liters of benzin");
            }
            else if(benzin <= needMorefuel){
                System.out.println("Dispense " + benzin + " liters of benzin");
                benzin -= benzin;
            }
        }
        else if(gasType == 2){
            if(diesel > needMorefuel){
                diesel -= needMorefuel;
                System.out.println("Dispense " + needMorefuel + " liters of diesel");
            }
            else if(diesel <= needMorefuel){
                System.out.println("Dispense " + diesel + " liters of diesel");
                diesel -= diesel;
            }
        }
    }
    
    void refillBenzin(int addBenzin){
        benzin += addBenzin;
        System.out.println("Station has "+ benzin +" liters of benzin");
    }
    
    void refillDiesel(int addDiesel){
        diesel += addDiesel;
        System.out.println("Station has "+ diesel +" liters of diesel");
    }
    
}
class Car {
    // Enter your code here
    int gasType;
    int capacity;
    int fuelNow;
    public Car(int gasType,int capacity,int fuelNow){
        this.gasType = gasType;
        this.capacity = capacity;
        this.fuelNow = fuelNow;
    }
    
    int getNeededVol(){
        int needMorefuel = capacity - fuelNow;
        return needMorefuel;
    }
}

public class StationAndCar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int benzin = sc.nextInt();
        int diesel = sc.nextInt();
        Station sta = new Station(benzin, diesel);
 
        final int Q = sc.nextInt(); 
        for (int i = 0; i < Q; ++i) {
            final int operation_A = sc.nextInt();
            final int B = sc.nextInt(); // opera = 1,2 -> gasType_B 
            final int C = sc.nextInt(); // opera = 1 -> capacity_C , opera = 2 -> addfuel
            final int D = sc.nextInt(); // opera = 1 -> fuelNow , opera = 2 -> D = 0
            if(operation_A == 1){
                Car car = new Car(B, C, D);
                sta.dispense(car);
            }
            else if(operation_A == 2){
                if(B == 1){ //benzin
                    sta.refillBenzin(C);
                }
                else if(B == 2){
                    sta.refillDiesel(C);
                }
            }
        }
    }
}
