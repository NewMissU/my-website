
import java.util.Scanner;


public class NumMixer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }
        int formation = sc.nextInt();
        
        //calculate
        int[] mix2arr = new int[n*2];
        int startA = 0;
        int startB = n-1;
        int countstartA=0;
        int countstartB=n-1;
        //Form 1
        if(formation > 0){
            for(int i=0;i<n*2;i++){
                for(int j=startA;j<n;j++){
                    if(i%2==0){
                        mix2arr[i] = A[j];
                        countstartA++;
                        break; //for change value i
                    }
                }
                for(int k=startB;k>=0;k--){
                    if(i%2!=0){
                        mix2arr[i] = B[k];
                        countstartB--;
                        break; //for change value i
                    }
                }
                startA = countstartA;
                startB = countstartB;
            }
        }
        //Form 2
        else if(formation <= 0){
            for(int i=0;i<n*2;i++){
                for(int k=startB;k>=0;k--){
                    if(i%2==0){
                        mix2arr[i] = B[k];
                        countstartB--;
                        break; //for change value i
                    }
                }
                for(int j=startA;j<n;j++){
                    if(i%2!=0){
                        mix2arr[i] = A[j];
                        countstartA++;
                        break; //for change value i
                    }
                }
                startA = countstartA;
                startB = countstartB;
            }
        }
        
        //print
        for(int i=0;i<n*2;i++){
            System.out.print(mix2arr[i] + " ");
        }
    }
            
}
