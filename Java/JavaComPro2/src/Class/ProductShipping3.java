package Class;

import java.util.Scanner;

class Product {

    String name;
    int weight;
    int price;

    public Product(String name, int weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    void printInfo() {
        System.out.println(weight + " grams of " + name + " costs " + price + " baht.");
    }
}

class PurchaseOrder {

    int amount_product;
    Product[] products; //Object of Class Product
    int[] amount_per_product;
    int sumprice;
    int sumweight;

    public PurchaseOrder(int amount_product, Product[] products, int[] amount) { //Product[] products parameter of Object
        this.amount_per_product = new int[amount_product];
        this.products = products;
        this.amount_per_product = amount;
        for (int i = 0; i < amount_product; i++) {
            sumprice += products[i].price * amount_per_product[i];
            sumweight += products[i].weight * amount_per_product[i];
        }
    }

    void printInfo() {
        System.out.println(amount_per_product.length + " items = " + sumprice + " baht " + sumweight + " grams ");
        for (int i = 0; i < amount_per_product.length; i++) {
            System.out.println(products[i].name + " " + amount_per_product[i] + "x" + products[i].price
                    + " = " + (amount_per_product[i] * products[i].price));
        }
    }
}

class Truck {
    //Write your code here
    int capacity;
    PurchaseOrder po;
    int destination;
    double price_transfer;
    public Truck(int capacity){
        this.capacity = capacity;
        this.destination = 0;
        this.price_transfer = 0;
    }
    
    void add(PurchaseOrder po , int destination){
        this.po = po;
        this.destination = destination;
    }
    
    void setFee(){
        this.price_transfer = (po.sumweight*destination)/1000.0; //sumweight (grams)
    }
    
    double getFee(){
        this.price_transfer = (po.sumweight*destination)/1000.0;
        return price_transfer;
    }
    
}

public class ProductShipping3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        Truck[] trucks = new Truck[m];
        for (int i = 0; i < m; i++) {
            int capacity = in.nextInt();
            trucks[i] = new Truck(capacity);
        }
        int n = in.nextInt();
        int dest = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount);
        //-------
        int minvalue = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < m; i++) {
            if ((trucks[i].capacity >= po.sumweight) && (minvalue > trucks[i].capacity)) {
                minvalue = trucks[i].capacity;
                minIndex = i;
            }
        }
        System.out.println("minIndex : "+minIndex);
        if (minIndex >= 0) {
            trucks[minIndex].add(po, dest);
            System.out.println("Truck#" + (minIndex + 1));
            System.out.println("Fee=" + trucks[minIndex].getFee());
        } else {
            System.out.println("No truck");
            System.out.println("Fee=" + po.sumweight * dest / 1000.0);
        }
    }
}
