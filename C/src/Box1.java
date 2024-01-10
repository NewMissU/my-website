
import java.util.Scanner;

public class Box1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] capacitybox = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            capacitybox[i] = sc.nextInt();
        }
        int amountorder = sc.nextInt();
        int[] use_capacitybox = new int[n + 1];
        for (int i = 0; i < amountorder; i++) {
            int order = sc.nextInt();
            int amount = sc.nextInt();
            int boxtarget = sc.nextInt();
            if (order == 1) {
                if (use_capacitybox[boxtarget] < capacitybox[boxtarget] && amount <= capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    use_capacitybox[boxtarget] += amount;
                    System.out.println(use_capacitybox[boxtarget]);
                } else if (amount > capacitybox[boxtarget] - use_capacitybox[boxtarget]) {
                    System.out.println("-1");
                }
            }

            if (order == 2) {
                if (amount <= use_capacitybox[boxtarget]) {
                    use_capacitybox[boxtarget] -= amount;
                    System.out.println(use_capacitybox[boxtarget]);
                } else {
                    System.out.println("-1");
                }
            }
        }

    }
}
