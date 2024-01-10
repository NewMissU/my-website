package Class;

import java.util.Scanner;

class FoodShop {
    // Enter your code here
    String name;
    String[] menu = new String[5];
    int nFoods = 0;
    public FoodShop(String name){
        this.name = name;
    }
    
    boolean addFood(String foodName){
        if(nFoods < 5){
            menu[nFoods] = foodName;
            nFoods++;
            System.out.print(nFoods + " ");
            return true;
        }else{
            System.out.print("-1 ");
            return false;
        }
        
    }
    
    void printMenu(){
        System.out.print(name+" ");
        for(int i=0;i<nFoods;i++){
            System.out.print(menu[i]+" ");
        }
        System.out.println("");
    }
}

public class FoodTiger2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        FoodShop[] fs = new FoodShop[N+1];
        for (int i = 1; i<=N; ++i) {
            String name = sc.next();
            fs[i] = new FoodShop(name);
        }

        final int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            int s = sc.nextInt();
            String foodName = sc.next();
            boolean ret = fs[s].addFood(foodName);
            System.out.println(ret);
        }

        for (int i = 1; i<=N; ++i) {
            fs[i].printMenu();
        }
    }
}
