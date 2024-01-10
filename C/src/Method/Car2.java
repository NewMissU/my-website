
package Method;

public class Car2 {
    int year = 2001;
    int km = 8000;
    
    int calculatePrice(){
        int age = 2021 - year;
        int value = 10000 - km;
        return 25000 + value - (age * 1000);
    }
    
    public static void main(String[] args) {
        Car2 pr = new Car2();
        int price = pr.calculatePrice();
        System.out.println(price);
    }
}
