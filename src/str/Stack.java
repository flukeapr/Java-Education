package str;

import java.util.Scanner;

class StackA
{
public int maxSize = 5; // size of stack array
public String[] stackArray;
public int top; // top of stack
//--------------------------------------------------------------
public StackA(int s) // constructor
{
	maxSize = s;// set array size
	stackArray = new String [maxSize];// create array
	top = -1;// no items yet
}
//--------------------------------------------------------------
public void push(String j) // put item on top of stack
{
	//top += 1;
	//stackArray[top] = j;// increment top, insert item (push data)
	stackArray[++top] = j;
}
//--------------------------------------------------------------
public String pop() // take item from top of stack
{
	//String topelement;
	//topelement = stackArray[top];// access item, decrement top (pop data)
	//stackArray[top] = "";
	//top -=1;
	return stackArray[top--];
	
	
}
//--------------------------------------------------------------
public boolean isEmpty() // true if stack is empty
{
		
							
		// check your stack (empty)
		return top==-1;
}
//--------------------------------------------------------------
public boolean isFull() // true if stack is full
{
	// check your stack (full)
	return (top >= maxSize-1);
}
//--------------------------------------------------------------
} // end class StackX
public class Stack {
	public static void main(String[] args)
	{
		String j;//declare variables
		//declare StackA variable
		int maxSize=5;
		StackA top;
		StackA st = new StackA(maxSize);
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 1;i < maxSize+1;i++) { //for loop = Stack Size
			System.out.print("Push Data "+ i + " : ");
			j=input.next();//push data
			
			st.push(j);
		}
		System.out.print("--------------------------\n");
		if(st.isFull()) { //check if not empty
			for(int i = 1;i < maxSize+1;i++) { //for loop = Stack Size
				System.out.print("Pop Data "+ i + " : ");//pop data
				System.out.print(st.pop());// display it
				System.out.println(" ");
			//System.out.print(st.isFull());
			}
		}
		System.out.println(" ");
		
		
	
	}
}
