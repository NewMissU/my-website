/*class Node {
    private int info;
    private Node link;
    public Node(int info,Node link)
   {
       this.info=info;
       this.link=link;
    }
    public Node(int info)
    {
        this(info,null);
    }
    public Node()
    {
        this.link = null;
    }
    public int getInfo() {
	return this.info;
    }
    public Node getLink() {
        return this.link;
    }
    public void setInfo(int info) 
    {
	this.info=info;
    }
    public void setLink(Node link) {
        this.link = link;
    }
}

class Stack{
    private int stackSize = 0;
    private Node stackTop = null; //head
    
    public Stack(){
        stackTop = null;
    }
    
    public boolean isEmptyStack(){
        return(stackTop == null);
    }
    
    public boolean isFullStack(){
        return false;
    }
    
    public void push(int newItem){ 
        Node newNode = new Node(newItem); //--> Node(info,null) link = null
        newNode.setLink(stackTop); //--> set link of Node = stackTop (null = top of stack)
        stackTop = newNode; //change head = newNode
        stackSize++; 
    }
    
    public int peek() throws Exception{
        if(isEmptyStack()){
            throw new Exception("StackUnderflow");
        }
        return stackTop.getInfo(); //stackTop = head , head.getInfo;
    }
    
    public int pop() throws Exception{
        int itemInfo; //keep object that throw away
        if(isEmptyStack()){
            throw new Exception("StackUnderflow");
        }
        itemInfo = stackTop.getInfo(); //itemInfo = info of the top of stack
        stackTop = stackTop.getLink(); //change stackTop to link that point to info below
        stackSize--; //delete info = size decrease
        return itemInfo;
    }
    
    public int getStacksize(){
        return stackSize;
    }
    
    public String toString() {
        Node trav = stackTop; //stackTop = head
        String str = "";
        for(int i=0;i<stackSize;i++){
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str;
    }
}

public class OddEvenStack {
    public static void main(String[] args) throws Exception {
        Stack sEven = new Stack();
        Stack sOdd = new Stack();
        int max = 20;
        int min = 10;
        int range = max-min+1;
        int n = (int) ((Math.random() * range) +10); //random between 10-20
        int countEven = 0;
        int countOdd = 0;
        System.out.println("--- Random Numbers ["+n+"] ---");
        for(int i = 0;i<n;i++){
            int x = (int) (Math.random()*100);
            if(x % 2 == 0){
                sEven.push(x);
                countEven++;
            }
            else{
                sOdd.push(x);
                countOdd++;
            }
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("--- Even Stack ["+countEven+"] --- ");
        System.out.println(sEven);
        System.out.println("--- Odd Stack ["+countOdd+"] --- ");
        System.out.println(sOdd);
        
        //method check 
        for(;;){
            if(sEven.getStacksize() == 0){
                System.out.println("===> Even is the winner!");
                break;
            }
            else if(sOdd.getStacksize() == 0){
                System.out.println("===> Odd is the winner!");
                break;
            }
            if(sEven.peek() > sOdd.peek()){
                sEven.pop();
            }
            else if(sEven.peek() < sOdd.peek()){ //peek() --> info of the top of those stack
                sOdd.pop();
            }
        }

    }
}
*/