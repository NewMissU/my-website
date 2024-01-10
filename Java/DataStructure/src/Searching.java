import java.util.Random;

class SArr{
    private int arr[];
    private int cnt=0;
    public SArr(int num){
        arr = new int[num];
    }
    /*public SArr(){
        arr = new int[13];
    }*/
    public void randVal(int num){
        Random rand = new Random();
        //int m[] = {29, 85, 6, 19, 62, 0, 53, 36 ,60,19, 81, 2, 17};
        for(int i=0;i<num;i++){
            int m = rand.nextInt(100-0+1)+0;
            for(int j=0;j<i;j++){
                if(arr[j]==m){
                    cnt++;
                }
            }
            arr[i] = m;
        }
        /*for(int i=0;i<m.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]==m[i]){
                    cnt++;
                }
            }
            arr[i] = m[i];
        }*/
    }
    public void printVal(){
        System.out.println("--- Random Numbers [" + (arr.length-cnt) + "] ---");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    System.out.print("!");
                    break;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public int[] getArr(){
        int a[] = new int[arr.length-cnt];
        int p=0;
        for(int i=0;i<arr.length;i++){
            boolean c = true;
            for(int j=0;j<i;j++){
                if(arr[j]==arr[i]){
                    c=false;
                }
            }
            if(c){
                a[p] = arr[i];
                p++;
            }
        }
        return a;
    }
}
class  SHash{    
    private int arr[];
    private boolean check[];
    public SHash(){
        arr = new int[101];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        check = new boolean[101];
    }
    public void putMap(int[] a){
        for(int i=0;i<a.length;i++){
            int getkey = a[i]%(2*a.length);
            if(arr[getkey]!=-1){
                int p = getkey;
                while(arr[p]!=-1){
                    p++;
                }
                arr[p]=a[i];
                check[p]=true;
            }else{
                arr[getkey]=a[i];
            }
        }
    }
    public int getLength(){
        int length = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                length++;
            }
        }
        return length;
    }
    public void search(){
        int cnt = 0;
        int total=0;
        System.out.println("--- Finding Match ---");
        Random rand = new Random();
        for(;;){
            if(cnt==3){
                break;
            }
            boolean ch = false;
            int m = rand.nextInt(100-0+1)+0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]!=1){
                    if(m+arr[i]==100){
                        ch = true;
                        arr[i]=-1;
                        break;
                    }
                }
            }
            if(ch){
                cnt++;
            }
            else{
                System.out.print("!");
            }
            System.out.print(m+" ");
            total++;
        }
        System.out.println("");
        System.out.println("total finding: " + total);
    }
    public void printHash(){
        System.out.println("--- Hash Table [" + getLength() + "] ---");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=-1){
                System.out.print(i+":"+arr[i]);
                if(check[i]==true){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
public class Searching {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20-10+1)+10;
        SHash shash = new SHash();
        SArr sarr = new SArr(n);
        //SArr sarr = new SArr();
        sarr.randVal(n);
        sarr.printVal();
        shash.putMap(sarr.getArr());
        shash.printHash();
        shash.search();
        shash.printHash();
    }
    
}
