package str;
import java.util.*;
public class Bubblesort {
	
	
	
	
	private static int numSort;

	public static void main(String[] args)  {
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.print("Input Number of integers to Sort: ");
		numSort = input.nextInt();
		
		int[] num = new int[numSort];
		int count=0;

		System.out.println("Enter "+ numSort + " integers");
		
		for(int i= 1; i<=numSort; i++) {
			System.out.print("Enter "+i+":");// input
			
				
			
			
			num[i-1]=input.nextInt();
			
			
			
			
			
			
		}
	
		bubbleSort(num,numSort);
		
		
		
		
		
	}
	
	
	
	
	static void bubbleSort(int data[],int max) {
		
		 
		
		int i, j, countswap;
		
		for(i = 1; i <=max-1; i++) {
			for(j= max-1; j>=i; j--) {
				countswap=0;
				if(data[j]>data[j-1]) {
					
					int temp = data[j];
					data[j]=data[j-1];
					data[j-1]=temp;
					
				}
				
				
			}
			
			
			
		}
		System.out.print("Sorted list number: ");

/*for (int num : data) {
			
			System.out.print(num+" ");
			
		}*/
for(int x= 1; x<=numSort; x++) {
			System.out.print("\nData"+x+":");
			System.out.print(data[x-1]);
}
		
	}
	

	
}
