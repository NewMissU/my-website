
package Method;

import java.util.Scanner;

public class ThreeNumber {
    static void findsomething(int type, int[] number){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int middle = 0;
        if(type == -1){
            for(int i=0;i<3;i++){
                if(number[i] < min){
                    min = number[i];
                }
            }
            System.out.println(min);
        }
        else if(type == 1){
            for(int i=0;i<3;i++){
                if(number[i] > max){
                    max = number[i];
                }
            }
            System.out.println(max);
        }
        else if(type == 0){
            for(int i=0;i<3;i++){
                if(number[i] > max){
                    max = number[i];
                }
                if(number[i] < min){
                    min = number[i];
                }
            }
            for(int i=0;i<3;i++){
                if(number[i] != max && number[i] != min){
                    middle = number[i];
                }
            }
            System.out.println(middle);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []number = new int[3];
        for(int i=0;i<3;i++){
            number[i] = sc.nextInt();
        }
        int type = sc.nextInt();
        findsomething(type,number);
        
    }

    
    
    
    
    
    
    
    
    //method
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []number = new int[3];
        for(int i=0;i<3;i++){
            number[i] = sc.nextInt();
        }
        int type = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int middle = 0;
        if(type == -1){
            for(int i=0;i<3;i++){
                if(number[i] < min){
                    min = number[i];
                }
            }
            System.out.println(min);
        }
        else if(type == 1){
            for(int i=0;i<3;i++){
                if(number[i] > max){
                    max = number[i];
                }
            }
            System.out.println(max);
        }
        else if(type == 0){
            for(int i=0;i<3;i++){
                if(number[i] > max){
                    max = number[i];
                }
                if(number[i] < min){
                    min = number[i];
                }
            }
            for(int i=0;i<3;i++){
                if(number[i] != max && number[i] != min){
                    middle = number[i];
                }
            }
            System.out.println(middle);
        }
    }*/
}
