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

class Queue{ //by linklist
    private Node queueFront = null;
    private Node queueRear = null;
    private int count = 0;
    
    public void initializeQueue(){
        queueFront = null;
        queueRear = null;
        count = 0;
    }
    
    public boolean isEmptyQueue(){
        return (queueFront == null);
    }
    
    public boolean isFullQueue(){
        return false; // queue no limit
    }
    
    public int front() throws Exception{ // return info of first queue
        if(isEmptyQueue()){
            throw new Exception("QueueUnderflow");
        }
        return queueFront.getInfo();
    }
    
    public int back() throws Exception{ // return info of last queue
        if(isEmptyQueue()){
            throw new Exception("QueueUnderflow");
        }
        return queueRear.getInfo();
    }
    
    public void enQueue(int newInfo){
        Node newNode = new Node(newInfo);
        if(queueFront == null){ // == null --> mean it is first queue
            queueFront = newNode; //keep value of first Node in queueFront
            queueRear = newNode; //keep value of last Node in queueRear
        }
        else{ // not a first queue change only queueRear
            queueRear.setLink(newNode); // queueRear point to newNode
            queueRear = queueRear.getLink(); // queueRear.getLink() = newNode
        }
        count++;
    }
    
    public int deQueue() throws Exception{
        int itemInfo;
        if(isEmptyQueue()){
            throw new Exception("QueueUnderflow");
        }
        itemInfo = queueFront.getInfo();
        queueFront = queueFront.getLink(); // 0 --> 1 delete Node.0 --> now first queue = Node.1
        if(queueFront == null){
            queueRear = null;
        }
        count--;
        return itemInfo;
    }
    
    public int getSize(){
        return count;
    }
    
    @Override
    public String toString(){
        Node trav = queueFront;
        String str = "";
        for(int i=0;i<count;i++){
            str = str.concat(trav.getInfo() + " ");
            trav = trav.getLink();
        }
        return str;
    }
}

public class OddEvenQueue {
    public static void main(String[] args) throws Exception {
        Queue qEven = new Queue();
        Queue qOdd = new Queue();
        int max = 20;
        int min = 10;
        int range = max-min+1;
        int n = (int) ((Math.random() * range) +10); //random between 10-20
        System.out.println("--- Random Numbers ["+n+"] ---");
        for(int i = 0;i<n;i++){
            int x = (int) (Math.random()*100); // 0-100
            if(x % 2 == 0){
                //add x to queue
                qEven.enQueue(x);
            }
            else{
                qOdd.enQueue(x);
            }
            System.out.print(x + " ");
        }
        System.out.println("");
        
        System.out.println("--- Even Queue ["+qEven.getSize()+"] --- ");
        System.out.println(qEven);
        System.out.println("--- Odd Queue ["+qOdd.getSize()+"] --- ");
        System.out.println(qOdd);
        
        //compare 2 queue
        int countRound=0;
        int countEvenWin=0;
        int countOddWin=0;
        for(;;){     
            if(qEven.getSize() == 0){
                System.out.println("===> Winner is Even!");
                System.out.println("Round="+countRound + ", Win=(E:"+countEvenWin +",O:"+countOddWin+"), Odd left="+qOdd.getSize() );
                break;
            }
            if(qOdd.getSize() == 0){
                System.out.println("===> Winner is Odd!");
                System.out.println("Round="+countRound + ", Win=(E:"+countEvenWin +",O:"+countOddWin+"), Even left="+qEven.getSize() );
                break;
            }
            if(qEven.front() > qOdd.front()){
                qEven.deQueue();
                countEvenWin++;
                int valueOddDequeue = qOdd.deQueue();
                qOdd.enQueue(valueOddDequeue);
            }
            else if(qOdd.front() > qEven.front()){
                qOdd.deQueue();
                countOddWin++;
                int valueEvenDequeue = qEven.deQueue();
                qEven.enQueue(valueEvenDequeue);
            }
            countRound++;
        }
    }
}
*/