/*
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

public class ItemAndCart1 {
    // Do not change the code below this line.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();
        int price = sc.nextInt();
        int shipping = sc.nextInt();
        int volume = sc.nextInt();
        int quan = sc.nextInt();
        Item item = new Item(name, id, price,
                shipping, volume, quan);
        item.printInfo();

        int n = sc.nextInt();
        for (int i = 0; i < n; ++i) {
            int q = sc.nextInt();
            System.out.println(item.cutStock(q));
            item.printInfo();
        }
    }

}
*/