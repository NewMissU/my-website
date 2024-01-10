
package Method;

import java.util.Scanner;

public class Car3 {
    
    int calculatePrice(int year, int km){
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int km = sc.nextInt();
        Car3 pr = new Car3();
        int price = pr.calculatePrice(year,km);
        System.out.println(price);
    }
}
