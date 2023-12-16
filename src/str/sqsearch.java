package str;

import java.util.Scanner;

public class sqsearch {
	public static void main(String[] args)  {
		
		int A[] = {10001, 10022, 10060, 11255, 15022, 20001, 21002, 23003, 25566, 30078, 40000, 50012, 66006};
		int id;
		Scanner input = new Scanner(System.in);
		System.out.print("ID :");
		id = input.nextInt();
		
		int index = sequentialSearch(A,id);
		
		
		if (index != -1) {
            System.out.printf("Found at A:[%d] " , index);
        } else {
            System.out.println("Not Found!");
        }
		
		
	}
	
	public static int sequentialSearch(int data[], int key) {
		int size = data.length;
	
		for(int i= 0; i<size;i++) {
			
			if(data[i]==key) {
				return i;
			
		}
		
			}
				
		return -1;
		
		
		
		
	}
	
	
}
