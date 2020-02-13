package test.data_structures;

import model.data_structures.Queue;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class TestQueue<T> {
	private Queue queue;

	@Before
	public void setup1(){
		queue = new Queue();
	}

	@SuppressWarnings("unchecked")
	public void setup2(){
		for(Integer i = 0; i <= 17; i++){
			queue.enqueue(i);
		}
	}
	
	@Test
	public void testQueue(){
		assertEquals(0, queue.size());
		assertNull(queue.peek());
		assertTrue(queue.isEmpty());
		
	}
	
	@Test
	public void testEnqueue(){
		setup2();
		queue.enqueue(17);
		assertEquals(17, queue.darUltimo());
		assertEquals(18, queue.size());
	}
	
	@Test
	public void testDequeue(){
		setup2();
		Comparable dequeued = queue.dequeue();
		assertEquals(0, dequeued);
		assertEquals(16, queue.size());
	}
}
