/*
package ClassComposition;

import java.util.Scanner;


class Blade {
    //put class variable here
    int size;
    int number;
    int angle;
    double hp;
    boolean valid;
    Blade(int size, int number, int angle, double hp) {
         this.size = size;
         this.number = number;
         this.angle = angle;
         this.hp = hp;
         int incorrect = 0;
         if(size >= 16 && size <= 24 && size % 2 == 0){
             valid = true;
         }
         else{
             incorrect++;
             System.out.println("invalid size");
         }
         if(number >= 3 && number <= 5){
             valid = true;
         }
         else{
             incorrect++;
             System.out.println("invalid number of blades");
         }
         if(angle == 27 || angle == 30 || angle == 33){
             valid = true;
         }
         else{
             incorrect++;
             System.out.println("invalid angle");
         }
         if(hp > 0){
             valid = true;
         }
         else{
             incorrect++;
             System.out.println("invalid horsepower");
         }
         if(incorrect > 0){
             valid = false;
         }
         
    }
    void printInfo() {
        System.out.print(size + " " + number + " " + angle + " " + hp + " " + valid);
    }
}

class Motor {

    double V, I, eff;

    Motor(double V, double I, double eff) {
        this.V = V;
        this.I = I;
        this.eff = eff/100.0;
    }

    Motor(double I, double eff) {
        //call constructor choose from these keywords
        //this(220,I,eff/100.0);
         this.V = 220;
         this.I = I;
         this.eff = eff/100.0;
 }
    double horsepower() {
        return V*I*eff/746.0;
    }

    void printInfo() {
        double hp = horsepower();
        System.out.println(V + " " + I + " " + eff + " "
                + String.format("%.2f", hp));
    }
}

public class FanCompany2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble();
        double i = sc.nextDouble();
        double eff = sc.nextDouble();
        Motor motor = null;
        if (v == 220) {
            motor = new Motor(220,i,eff);
        } else {
            motor = new Motor(v, i, eff);
        }
        motor.printInfo();
    }
}
*/