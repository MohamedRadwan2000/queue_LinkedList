package queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class queueLLTest {
    @Test
    void tese_1(){
        queueLL k=new queueLL();
        k.enqueue(1);
        k.enqueue(2);
        k.enqueue(3);
        k.enqueue(4);
        assertEquals(4,k.size());
        assertEquals((Object) 1,k.dequeue());
        assertEquals(3,k.size());
        assertEquals((Object) 2,k.dequeue());
        assertEquals(2,k.size());
        assertEquals((Object) 3,k.dequeue());
        assertEquals(1,k.size());
        assertEquals((Object) 4,k.dequeue());
        assertEquals(0,k.size());

    }
    @Test
    void tese_2(){
        queueLL k=new queueLL();
        assertThrows(RuntimeException.class,()->{k.dequeue();});
        k.enqueue(8);
        assertEquals(8,k.dequeue());
        assertEquals(0,k.size());
    }

}