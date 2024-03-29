package Inheritance;

import java.util.Scanner;

class Product {

    // Enter Your Code Here.
    String name;
    String sku;
    double price;
    int weight;
    boolean valid;

    public Product(String name, String sku, double price, int weight) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.weight = weight;
    }

    boolean checkValidity() {
        int count_error = 0;
        if (name == null || name.length() == 0) {
            System.out.println("name is invalid");
            count_error++;
        }
        if (sku == null || sku.length() == 0) {
            System.out.println("sku is invalid");
            count_error++;
        }
        if (price < 0) {
            System.out.println("price is invalid");
            count_error++;
        }
        if (weight < 0) {
            System.out.println("weight is invalid");
            count_error++;
        }
        if (count_error > 0) {
            valid = false;
            return valid;
        } else {
            valid = true;
            return valid;
        }
    }

    void printInfo() {
        if (valid == true) {
            System.out.println(name + ", " + sku + ", " + price + ", " + weight);
        } else {
            System.out.println(name + ", " + sku + ", " + price + ", " + weight + ", " + "Invalid");
        }
    }
}

class Shoe extends Product{
    // Enter Your Code Here
    int gender;
    int size;
    int type;
    String brand;
    public Shoe(String name, String sku, double price, int weight,int gender,int size,int type,String brand) {
        super(name, sku, price, weight);
        this.gender = gender;
        this.size = size;
        this.type = type;
        this.brand = brand;
    }
    
    @Override
    void printInfo(){
        super.printInfo();
        if(gender == 1){ //female
            if(type == 1){ //sport
                System.out.println("female" +", "+ size +", "+ "sport" +", "+ brand);
            }
            else if(type == 2){ //formal
                System.out.println("female" +", "+ size +", "+ "formal" +", "+ brand);
            }
            else if(type == 3){ //casual
                System.out.println("female" +", "+ size +", "+ "casual" +", "+ brand);
            }
            
        }
        else{ //male
            if(type == 1){ //sport
                System.out.println("male" +", "+ size +", "+ "sport" +", "+ brand);
            }
            else if(type == 2){ //formal
                System.out.println("male" +", "+ size +", "+ "formal" +", "+ brand);
            }
            else if(type == 3){ //casual
                System.out.println("male" +", "+ size +", "+ "casual" +", "+ brand);
            }
        }
        
    }
    
    
}

public class ProductStore2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        /* Your Code */
        //Product[] pro = new Product[N];
        Shoe[] shoe = new Shoe[N];
        for (int i = 0; i < N; ++i) {
            sc.nextLine(); // throw away new-line char
            String name = sc.nextLine();
            String sku = sc.nextLine();
            double prices = sc.nextDouble();
            int weight = sc.nextInt();
            int gender = sc.nextInt();
            int size = sc.nextInt();
            int type = sc.nextInt();
            String brand = sc.next();
            /* Your Code */
            //pro[i] = new Product(name, sku, prices, weight);
            shoe[i] = new Shoe(name, sku, prices, weight, gender, size, type, brand);
        }

        // Call checkVaidity of each product object.
        for (int i = 0; i < N; ++i) {
            // Your Code
            boolean valid = shoe[i].checkValidity();
            System.out.println(valid);
        }

        // Call printInfo of each product object.
        for (int i = 0; i < N; ++i) {
            // Your Code
            shoe[i].printInfo();
        }
    }
}
