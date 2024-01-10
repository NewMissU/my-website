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

public class FanCompany1_1 {

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