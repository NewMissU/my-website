/*
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

class PurchaseOrder{
    int amount_product;
    Product[] products; //Object of Class Product
    int[] amount_per_product;
    int sumprice;
    int sumweight;
    public PurchaseOrder(int amount_product,Product[] products,int[] amount){ //Product[] products parameter of Object
        this.amount_per_product = new int[amount_product];
        this.products = products;
        this.amount_per_product = amount;
        for(int i =0;i<amount_product;i++){
            sumprice += products[i].price*amount_per_product[i];
            sumweight += products[i].weight*amount_per_product[i];
        }
    }
    
    void printInfo(){
        System.out.println(amount_per_product.length + " items = " + sumprice + " baht " + sumweight + " grams ");
        for(int i=0;i<amount_per_product.length;i++){
            System.out.println(products[i].name + " " + amount_per_product[i]+"x"+products[i].price 
                    + " = " + (amount_per_product[i]*products[i].price)); 
        }
    }

}

public class ProductShipping2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Product[] products = new Product[n];
        int[] amount = new int[n];
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int weight = in.nextInt();
            int price = in.nextInt();
            products[i] = new Product(name, weight, price);
            amount[i] = in.nextInt();
        }
        PurchaseOrder po = new PurchaseOrder(n, products, amount); //products = Object
        po.printInfo();
    }

}
*/