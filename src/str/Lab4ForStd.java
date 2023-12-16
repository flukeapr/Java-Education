package str;
import java.util.Scanner;

public class Lab4ForStd {
	public static int maxsize=5;
	public static String[] number = new String[maxsize];
	public static int front =0;
	public static int rear=-1;
	
	
	
	public static void main (String[] args) {
		String num = ""; // Declare variables
		Scanner input = new Scanner(System.in);
		
		
		
		for(int i= 1; i<=maxsize; i++) {
			
			System.out.print("Enqueue Data " +i+ ": ");// input
			
			num = input.next();
			
			enqueue(i,num);
		
		}
		
		
		
		
		dequeue();
                   }
	public static void dequeue() {
		int size;
		size = rear - front +1;

		
		for(int i= 1; i<=maxsize; i++) { 
			System.out.println("Dequeued data "+ i+": " + number[front++]);
			
			if(front == size) {
				front = 0;
				rear=-1;
				System.out.println("");
				System.out.println("Queue is empty.");
		
		}
		}
	// dequeue
	}
		
	public static void enqueue(int i, String num) {
		int size;
		size = rear - front +1;
		if(size == maxsize-1) {
			System.out.println("");
			System.out.println("Queue is full.");
			System.out.println("");
			// enqueue
			
		}rear++;
		number[rear] = num;
		
		
	}

}
