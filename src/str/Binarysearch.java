package str;

import java.util.Scanner;

public class Binarysearch {
	
	 public static int Number [ ] = { 00000, 11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999};
	public static void main(String[] args)  {
		
		
		int num;
		 Scanner input = new Scanner(System.in);
		System.out.print("search ID: ");
		num = input.nextInt();
		
		int index =binarySearch(Number, num);
		
		
		
		if(index !=-1) {
			
		System.out.printf("\nFound at A:[%d] :" , index);
		System.out.print(num);
		
		
		}else
			System.out.print("Not Found!");
		
		
	}
	
	public static int binarySearch(int data[], int key) {
		
		int found =0, index =-1;
		int first =0;
		int last = data.length-1;
		int mid;
		
		while(first<=last) {
			mid = (first+last)/2;
			
			int midNumber = data[mid];
			
			if(key == midNumber) {
				
				return mid;
			}else {
				if(key<midNumber) {
				last = mid-1;

				
				}else
					
					
				first = mid +1;
				
			}
			
		}
		return -1;
		
		
		
	}
	
	
}
