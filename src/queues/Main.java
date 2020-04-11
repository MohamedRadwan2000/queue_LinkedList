package queues;

public class Main {

    public static void main(String[] args) {
	queueLL k=new queueLL();
	k.enqueue(5);
	k.enqueue(7);
	k.enqueue(8);
	k.dequeue();
	int x=k.size();
	for(int i=0;i<x;i++){
	    System.out.println(k.dequeue());
    }
    }
}
