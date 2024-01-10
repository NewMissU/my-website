package Midterm;
class Stack{
    
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
    
    public void push(Object newItem){ 
        Node newNode = new Node(newItem); //--> Node(info,null) link = null
        newNode.setLink(stackTop); //--> set link of Node = stackTop (null = top of stack)
        stackTop = newNode; //change head = newNode
        stackSize++; 
    }
    
    public Object peek() throws Exception{
        if(isEmptyStack()){
            throw new Exception("StackUnderflow");
        }
        return stackTop.getInfo(); //stackTop = head , head.getInfo;
    }
    
    public Object pop() throws Exception{
        Object itemInfo; //keep object that throw away
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

