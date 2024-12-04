package org.tnsif.capgemini.c2tc.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//adding the elements
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		stack.add(5);
		
		//displaying the stack
		System.out.println("Stack after pushes "+stack);
		
		//top element without removing it
		System.out.println("Top element "+stack.peek());
		
		//pop operation to remove an element
		System.out.println("Pop operation: "+stack.pop());
		System.out.println(stack);
		
		//checking if stack is empty
		System.out.println("Stack is empty "+stack.isEmpty());
		
		//search
		int position = stack.search(2);
		if(position != -1)
		{
			System.out.println("Element found at position "+position);
		}
		else
		{
			System.out.println("Element not found "+position);
		}

	}

}
