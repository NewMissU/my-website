/*
package Class;
import java.util.Scanner;


class Item {
    double weight;
    boolean type; // true = ornament , false = bar
    public Item(boolean type , double weight){
        this.weight = weight;
        this.type = type;
    }
    
    double saleprice(double pricegold){
        double price_sell;
        if(type == true){
            price_sell = (pricegold*weight) + (weight * 1000); 
            return price_sell;
        }
        else{
            price_sell = pricegold*weight;
            return price_sell;
        }
    }
    
    double buyprice(double pricegold){
        double price_buy;
        if(type == true){
            price_buy = (pricegold*weight)*(98.00/100); //ornament
            return price_buy;
        }
        else{
            price_buy = (pricegold-100)*weight; //bar
            return price_buy;
        }
    }
    
    void showdetail(double pricegold){
        if(type == true){
            System.out.print("ornament " + weight +" baht");
        }
        else{
            System.out.print("bar " + weight +" baht");
        }
    }
}

public class SUGoldShop1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double pricegold = input.nextDouble();
        Item[] arrayx = new Item[n];
        for (int i = 0; i < n; i++) {
            String cmdline = input.next();
            String attgold = input.next();
            double weight = input.nextDouble();
            if (attgold.equalsIgnoreCase("t")) {
                arrayx[i] = new Item(true, weight);
            } else {
                arrayx[i] = new Item(false, weight);
            }
            arrayx[i].showdetail(pricegold);
            if (cmdline.equalsIgnoreCase("s")) {
                System.out.println(" sale " + arrayx[i].saleprice(pricegold));
            } else if (cmdline.equalsIgnoreCase("b")) {
                System.out.println(" buy " + arrayx[i].buyprice(pricegold));
            }
        }
    }
}
*/