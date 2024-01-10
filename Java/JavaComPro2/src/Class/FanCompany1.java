/*
package Class;

import java.util.Scanner;

class Blade {
    //put class variable here

    int size;
    int number;
    int angle;
    double hp;
    boolean valid = true;
    Blade(int size, int number, int angle, double hp) {
         this.size = size;
         this.number = number;
         this.angle = angle;
         this.hp = hp;
         if(size % 2 !=0 || size < 16 || size > 24){
            valid = false;
            System.out.println("invalid size");
         }
         if(number < 3 || number > 5){
            valid = false;
            System.out.println("invalid number of blades");
         }
         if(angle != 27 && angle != 30 && angle != 33){
            valid = false;
            System.out.println("invalid angle");
         }
         if(hp <= 0){
            valid = false;
            System.out.println("invalid horsepower");
         }
    }

    void printInfo() {
        if(valid == false){
            System.out.println(size + " " + number + " " + angle + " " + hp + " false");
        }
        else{
            System.out.println(size + " " + number + " " + angle + " " + hp + " true");
        }
    }
}

public class FanCompany1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numb = sc.nextInt();
        int angle = sc.nextInt();
        double hp = sc.nextDouble();
        Blade ablade = new Blade(size, numb, angle, hp);
        ablade.printInfo();
    }

}
*/