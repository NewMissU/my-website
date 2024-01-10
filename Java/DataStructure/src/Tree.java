
import java.util.Scanner;


public class Tree {
    private Object info;
    private Tree left = null;
    private Tree right = null;
    
    public Tree(Object info,Tree left, Tree right){
        this.info = info;
        this.left = left;
        this.right = right;
    }
    
    public Tree(Object info){
        this(info,null,null);
    }
    
    public Tree(){
        this.left = null;
        this.right = null;
    }
    
    public Object getInfo(){
        return this.info;
    }
    
    public void setInfo(Object info){
        this.info = info;
    }
    
    public Tree getLeft(){
        return this.left;
    }
    
    public Tree getRight(){
        return this.right;
    }
    
    public void setLeft(Tree node){
        this.left = node;
    }
    
    public void setRight(Tree node){
        this.right = node;
    }
    
    public void insert(int value){
        if(info == null){
            info = value;
        }
        else if(value < (int)info){
            if(left == null){
                left = new Tree(value);
            }
            else{
                left.insert(value);
            }
        }
        else if(value >= (int)info){
            if(right == null){
                right = new Tree(value);
            }
            else{
                right.insert(value);
            }
        }
    }
    
    public void printPreOrder(Tree tree){
        if(tree == null){ //break recursive
            System.out.print(" - ");
            return;
        }
        System.out.print(" " + tree.getInfo() + " ");
        if(tree.getLeft() != null || tree.getRight() != null){
            System.out.print("[");
            printPreOrder(tree.getLeft());
            printPreOrder(tree.getRight());
            System.out.print("]");
        }
    }
    
    public int maxHeight(Tree tree){
        if(tree == null){
            return -1;
        }
        else{
            int leftHeight =  maxHeight(tree.getLeft());
            int rightHeight = maxHeight(tree.getRight());
            //System.out.println("left info : " + tree.getInfo() + "       leftHeight : " + leftHeight );
            //System.out.println("right info : " + tree.getInfo() + "       rightHeight : " + rightHeight);
            
            if(leftHeight >= rightHeight){
                //System.out.println("height : " + (leftHeight+1));
                return leftHeight+1;
            }
            else{
                //System.out.println("height : " + (rightHeight+1));
                return rightHeight+1;
            }
        }
    }
    
    
    public Tree search(Tree tree,int value,String order){
        if(tree == null || value == (int)tree.getInfo()){
            System.out.print( "(" + order + ")" );
            return tree;
        }
        if(value < (int)tree.getInfo()){
            if(tree.getLeft() != null){
                order += "L";
            }
            return search(tree.getLeft(), value,order);
        }
        //value > (int)tree.getInfo()
        if(value >= (int)tree.getInfo() && tree.getRight() != null){
            order += "R";
        }
        return search(tree.getRight(), value,order);
    }
}
//13 19 28 26 5 43 42 1 9 25
//8 45 1 34 31 15 41 21 27 32 9 45 
class Bst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 20;
        int min = 10;
        int range = max-min+1;
        int n = (int)((Math.random() * range) + min); //random between 10-20
        //int n =10;
        System.out.println("--- Random numbers ["+ n +"] ---");
        Tree t = new Tree();
        for(int i=0;i<n;i++){
            int number = (int)(Math.random()*50); //random between 0-50
            //int number = sc.nextInt();
            System.out.print(number + " ");
            t.insert(number);
        }
        System.out.println("");
        //height
        int height = t.maxHeight(t);
        System.out.println("--- Tree (Height="+ height+") ---");
        
        //printpreorder
        t.printPreOrder(t);
        
        //Search
        System.out.println("");
        System.out.println("--- Search ---");
        for(;;){
            int random = (int)(Math.random()*50); 
            //System.out.println("random number : " +random);
            String order = "";
            System.out.print(random+": ");
            Object checkValue = t.search(t, random,order);
            if(checkValue == null){
                System.out.println(" Not Found! ");
            }
            else{
                System.out.println(" Found! ");
            }
            if(checkValue != null){ //have that value in tree
                break;
            }
        }
        
        
        //prototype 
        /*System.out.println("");
        System.out.println("--- Search ---");
        String order = "";
        System.out.print("16: ");
        if(t.search(t, 16,order) == null){
            System.out.println(" Not Found! ");
        }
        else{
            System.out.println(" Found! ");
        }*/
        
    }
}
