package Midterm;

class Queue{ //by linklist
    
    private class Node {
        private Object info;
        private Node link;
        public Node(Object info,Node link)
        {
            this.info=info;
            this.link=link;
        }
        public Node(Object info)
        {
            this(info,null);
        }
        public Node()
        {
            this.link = null;
        }
        public Object getInfo() {
            return this.info;
        }   
        public Node getLink() {
            return this.link;
        }
        public void setInfo(Object info) 
        {
            this.info=info;
        }
        public void setLink(Node link) {
            this.link = link;
        }
    }
    
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
    
    public Object front() throws Exception{ // return info of first queue
        if(isEmptyQueue()){
            throw new Exception("QueueUnderflow");
        }
        return queueFront.getInfo();
    }
    
    public Object back() throws Exception{ // return info of last queue
        if(isEmptyQueue()){
            throw new Exception("QueueUnderflow");
        }
        return queueRear.getInfo();
    }
    
    public void enQueue(Object newInfo){
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
    
    public Object deQueue() throws Exception{
        Object itemInfo;
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

