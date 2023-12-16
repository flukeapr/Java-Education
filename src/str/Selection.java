package str;

public class Selection {
	public static void main(String[] args)  {
		
		
		 int data[ ] = {120, 60, 20, 80, 79, 30, 45};
		int max = data.length;
		
		System.out.println("Before: ");
		print(data);
		
		
		
		selectionSort(data,max);
		
		System.out.println("\nAfter: ");
		print(data);
		
	}
	
	static void selectionSort(int data[],int max) {
		int i, j, maxIndex, temp;
		for( i = 0; i < max-1; i++) {//ทำกี่รอบ
			
			maxIndex = i;
			for(j=i+1; j< max ; j++) {
				
				if(data[j]>data[maxIndex]) { // เงื่อนไขในการเช็คตัวไหนมีค่ามากกว่า
					maxIndex = j;
					
					
				}
				
			}
			
			temp = data[i]; // สำหรับ สามบรรทัดนี้สลับตำแหน่ง เอาตังมากไว้ข้างหน้า
			data[i]= data[maxIndex];
			data[maxIndex]= temp;
		}
		
		
		
	}
	
	
	static void print(int[] data) {
		
		for (int num : data) {
			
			System.out.print(num+" ");
			
		}
		
		
		
	}
	
}
