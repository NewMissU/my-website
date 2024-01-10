package Class;

import java.util.Scanner;

class Theater {
    // You can enter your code here and only here.
    boolean threeD;
    boolean luxury;
    int numSeats;
    boolean[] seats;
    String title;
    int basePrice;
    public Theater(boolean threeD,boolean luxury,int numSeats){
        this.threeD = threeD;
        this.luxury = luxury;
        this.numSeats = numSeats;
        seats = new boolean[numSeats+1];
    }
    
    void setTitle(String title){
        if(title == null || title.length() == 0){
            System.out.println("invalid title");
            this.title = "";
        }
        else{
            this.title = title;
        }
    }
    
    void setBasePrice(int basePrice){
        if(basePrice <= 0){
            System.out.println("invalid price");
        }
        else{
            this.basePrice = basePrice;
        }
    }
    
    void printInfo(){
        if(threeD == true){
            System.out.println("3D");
        }
        else{
            System.out.println("No 3D");
        }
        if(luxury == true){
            System.out.println("Luxury");
        }
        else{
            System.out.println("Standard");
        }
        System.out.println(seats.length - 1);
        if(title.length() > 0){
            System.out.println(title);
        }
        else{
            System.out.println("title is not set");
        }
        if(basePrice > 0){
            System.out.println(basePrice);
        }
        else{
            System.out.println("price is not set");
        }
    }
        
}

// Do not modify the code below. You must leave it as is.
public class Theater1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeD1 = sc.nextInt();
        int luxury1 = sc.nextInt();
        int numSeats = sc.nextInt();
        boolean threeD = false;
        boolean luxury = false;
        if (threeD1 == 1) {
            threeD = true;
        }
        if (luxury1 == 1) {
            luxury = true;
        }
        Theater t = new Theater(threeD, luxury, numSeats);

        String dummy = sc.nextLine();// throw away a new line character
        String title = sc.nextLine();
        if (title.compareTo("-1") == 0) {
            t.setTitle(null);
        } else {
            t.setTitle(title);
        }
        
        int basePrice = sc.nextInt();
        t.setBasePrice(basePrice);
        t.printInfo();
    }
}
