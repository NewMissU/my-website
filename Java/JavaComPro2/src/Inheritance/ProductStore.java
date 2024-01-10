/*
package Inheritance;

import java.util.Scanner;

class Product {
    // Enter Your Code Here.
    String name;
    String sku;
    double price;
    int weight;
    boolean valid;
    public Product(String name,String sku,double price,int weight){
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }
    
    boolean checkValidity(){
        int count_error = 0;
        if(name == null || name.length() == 0){
            System.out.println("name is invalid");
            count_error++;
        }
        if(sku == null || sku.length() == 0){
            System.out.println("sku is invalid");
            count_error++;
        }
        if(price < 0){
            System.out.println("price is invalid");
            count_error++;
        }
        if(weight < 0){
            System.out.println("weight is invalid");
            count_error++;
        }
        if(count_error > 0){
            valid = false;
            return valid;
        }
        else{
            valid = true;
            return valid;
        }
    }
    
    void printInfo(){
        if(valid == true){
            System.out.println(name + ", " + sku + ", " + price + ", " + weight); 
        }
        else{
            System.out.println(name + ", " + sku + ", " + price + ", " + weight + ", " + "Invalid");
        }
    }
}

public class ProductStore {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        // Your Code
        Product[] pro = new Product[N];
        for (int i = 0; i < N; ++i) {
            scan.nextLine(); // throw away new-line char
            String name = scan.nextLine();
            String sku = scan.nextLine();
            double prices = scan.nextDouble();
            int weight = scan.nextInt();
            // Your Code
            pro[i] = new Product(name, sku, prices, weight);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            // Your Code
            boolean valid = pro[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            // Your Code
            pro[i].printInfo();
        }
    }
}
*/