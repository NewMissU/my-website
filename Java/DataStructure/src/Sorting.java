import java.util.Random;
class SArr{
    private int[] arr;
    
    public SArr(int size){
        arr = new int[size];
    }
    
    public void randVal(int m){
        /*Random rand = new Random();
        int randomNum = rand.nextInt(max – min + 1) + min;*/
        int min = -(m);
        int max = m;
        Random rand = new Random();
        for(int i=0;i<arr.length;i++){
            arr[i] = rand.nextInt(max - min + 1) + min; //random between -m to m
        }
    }
    
    public void insertSort(){
        int i,j;
        for(i=1;i<arr.length;i++){
            int temp = arr[i]; //copy value to change index
            for(j=i ; j > 0 && arr[j-1] > temp ;j--){ 
                arr[j] = arr[j-1]; //arr[j] index: i = j
            }
            arr[j] = temp;
        }
    }
    
    public void selectionSort(){
        int i,j,minIndex,temp;
        int n = arr.length;
        for(i=0;i<n-1;i++){
            minIndex = i; //keepIndex of first index
            for(j=i+1 ; j<n ; j++){
                if(arr[j] < arr[minIndex]){ //find index minimum
                    minIndex = j; 
                }
            }
            if(minIndex != i){ //minIndex is changed
                temp = arr[i]; //keep value at index i
                arr[i] = arr[minIndex]; // change value at index i to min value
                arr[minIndex] = temp; // change value at index of minimum value to value of first index
            }
        }
    }
    
    public void bubbleSort(){
        boolean swapped = true;
        int j=0;
        int temp;
        while(swapped){
            swapped = false;
            j++;
            for(int i=0; i<arr.length - j; i++){
                if(arr[i] > arr[i+1]){ // before > after swap index , before < after index not change
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swapped = true; //true just once = loop
                }
            }
        }
    }
    
    public void shellSort(){
        int j;
        for(int gap=arr.length/2; gap>0; gap/=2){ 
            for(int i=gap; i <arr.length;i++){
                int temp = arr[i];                              //assume gap = 6
                for(j=i; j>=gap && temp < arr[j-gap] ;j-=gap){ //arr[j-gap] first: j-6 = 0 second: j-0 = j third: j-(-6) =j+6
                    arr[j] = arr[j-gap];
                }
                arr[j] = temp;
            }
        }
    }
    
    public void printVal(){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}


public class Sorting {
    public static void main(String[] args) {
        Random rand = new Random();
        //insertion
        int n = rand.nextInt(20 - 10 + 1) + 10; //(max-min+1)+min
        int m = rand.nextInt(50 - 10 + 1) +10;
        SArr sarr1 = new SArr(n);
        sarr1.randVal(m);
        System.out.println("Random "+ n +" numbers ["+ (-m) +".."+ m +"] :");
        sarr1.printVal();
        System.out.println("Insertion Sort :");
        sarr1.insertSort();
        sarr1.printVal();
        System.out.println("------------------------------");
        
        //selection
        n = rand.nextInt(20 - 10 + 1) + 10; //(max-min+1)+min
        m = rand.nextInt(50 - 10 + 1) +10;
        SArr sarr2 = new SArr(n);
        sarr2.randVal(m);
        System.out.println("Random "+ n +" numbers ["+ (-m) +".."+ m +"] :");
        sarr2.printVal();
        System.out.println("Selection Sort :");
        sarr2.selectionSort();
        sarr2.printVal();
        System.out.println("------------------------------");
        
        //bubble
        n = rand.nextInt(20 - 10 + 1) + 10; //(max-min+1)+min
        m = rand.nextInt(50 - 10 + 1) +10;
        SArr sarr3 = new SArr(n);
        sarr3.randVal(m);
        System.out.println("Random "+ n +" numbers ["+ (-m) +".."+ m +"] :");
        sarr3.printVal();
        System.out.println("Bubble Sort :");
        sarr3.bubbleSort();
        sarr3.printVal();
        System.out.println("------------------------------");

        //shell
        n = rand.nextInt(20 - 10 + 1) + 10; //(max-min+1)+min
        m = rand.nextInt(50 - 10 + 1) +10;
        SArr sarr4 = new SArr(n);
        sarr4.randVal(m);
        System.out.println("Random "+ n +" numbers ["+ (-m) +".."+ m +"] :");
        sarr4.printVal();
        System.out.println("Shell Sort :");
        sarr4.shellSort();
        sarr4.printVal();
        System.out.println("------------------------------");
    }
}
