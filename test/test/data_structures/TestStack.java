package test.data_structures;

import model.data_structures.Stack;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestStack<T> {

	private Stack stack;
	
	@Before
	public void setUp1() {
		stack = new Stack();
	}

	public void setUp2() {
		for(Integer i =0; i< 100; i++){
			stack.push(i);
		}
	}

	@Test
	public void testStack() {
		setUp1();
		assertEquals(0, stack.size());
		assertNull(stack.peek());
		assertTrue(stack.isEmpty());
	}

	@Test
	public void testPush(){
		setUp2();
		stack.push(100);		
		assertEquals(100, stack.peek());
		assertEquals(101, stack.size());
	}
	
	@Test
	public void testPop(){
		setUp2();
		Comparable pop = stack.pop();
		assertEquals(99, pop);
		assertEquals(99, stack.size());
	}
	

}