
import java.util.Scanner;

public class Box2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] capacitybox = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            capacitybox[i] = sc.nextInt();
        }
        int amountorder = sc.nextInt();
        int[] use_capacitybox = new int[n + 1];
        for(int i=0;i<amountorder;i++){
            int order = sc.nextInt();
            int amount = sc.nextInt();
            if (order == 1) {
                int boxtarget = sc.nextInt();
                if (use_capacitybox[boxtarget] < capacitybox[boxtarget] && amount <= capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    use_capacitybox[boxtarget] += amount;
                    System.out.println(use_capacitybox[boxtarget]);
                } else if (amount > capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    System.out.println("-1");
                }
            }
            if(order == 2){
                int startbox=1;
                while(true){
                    if(amount > use_capacitybox[startbox]){
                        amount -= use_capacitybox[startbox];
                    }
                    else if(amount <= use_capacitybox[startbox]){
                        //use_capacitybox[startbox] -= use_capacitybox[startbox] - amount;
                        amount = use_capacitybox[startbox] - amount;
                    }
                    else if(amount == 0){
                        System.out.println(use_capacitybox[startbox] + amount);
                        break;
                    }
                    if(use_capacitybox[startbox] == 0){
                        startbox++;
                    }
                }
            }
        }
    }
}
