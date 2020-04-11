package queues;


public class queueLL implements IQueues {
    static class QueueNode{
        Object data;
        QueueNode next;
        QueueNode(Object n){
            this.data=n;
            this.next=null;
        }
    }
    private QueueNode head;
    private QueueNode tail;
    private int size=0;
    public void enqueue(Object n){
       QueueNode new_node=new QueueNode(n);
       if(size==0){
           head=new_node;
           tail=new_node;
       }
       else{tail.next=new_node;
       tail=tail.next;
       }
        size++;
    }
   public Object dequeue(){
        if(size==0){
            throw new RuntimeException("queue is empty");
        }
        else {
            Object n=this.head.data;
            head=head.next;
            size--;
            return n;
        }
   }
   public int size(){
        return this.size;
   }
   public boolean isEmpty(){
        if(size==0){
            return true;
        }
        else {
            return false;
        }
   }
}
