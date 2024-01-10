package ClassComposition;

import java.util.Scanner;

class Item {
    // Insert your code here, and only here.
    String name;
    String id;
    int price;
    int shipping;
    int volume;
    int quan;
    boolean valid;
    public Item(String name,String id,int price,int shipping,int volume,int quan){
        this.name = name;
        this.id = id;
        this.price = price;
        this.shipping = shipping;
        this.volume = volume;
        this.quan = quan;
        valid = basicCheck(name, id, price, shipping, volume);
    }
    
    public boolean basicCheck(String name,String id,int price,int shipping,int volume){
        if(name.length() >= 3 && id.length() >= 3 && price > 0 && volume > 0 && shipping >= 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean cutStock(int n){
        if(n > quan){
            return false;
        }
        else{
            this.quan = quan-n;
            return true;
        }
    }
    
    public void printInfo(){
        System.out.println(name + " " + id + " " + price);
        System.out.println(shipping + " " + volume + " " + quan + " " + valid);
    }
    
}

class Cart {
    // Insert your code here, and only here.
    int capacity;
    Item item;
    int inCart = 0;
    public Cart(int capacity,Item item){
        this.capacity = capacity;
        this.item = item;
    }
    
    public void printStats(){
        int sum_price = item.price*inCart; 
        int sum_shipping = inCart * item.shipping;
        int final_price = sum_price + sum_shipping;
        System.out.print(inCart + " " + sum_price + " " + sum_shipping + " " + final_price + " ");
        if(inCart == 0){
            System.out.println("0");
        }
        else if(inCart*item.volume <= capacity){
            System.out.println("1"); 
        }
        else{
            System.out.println("2+");
        }
    }
    
    public boolean adjustQuan(int q){
        
        if(q > 0){ // q = +
            boolean check = item.cutStock(q);
            if(check == true){
                inCart += q;
                return true;
            }
            else{
                return false;
            }
        }
        else{ // q = -
            if((-q) <= inCart){ // q = -5 , inCart = 4
                inCart -= (-q); // 4 - (-5)
                item.cutStock(q);
                return true;
            }
            else{
                return false;
            }
            
        }
    }
    
}

public class ItemAndCart2 {

    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        int price = sc.nextInt();
        int shipping = sc.nextInt();
        int volume = sc.nextInt();
        int quan = sc.nextInt();
        Item item = new Item(name, id, price, shipping,
                volume, quan);
        int capacity = sc.nextInt();
        Cart cart = new Cart(capacity, item);

        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = sc.nextInt();
            System.out.println(cart.adjustQuan(q));
            cart.printStats();
        }
    }
}
