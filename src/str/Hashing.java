package str;
import java.util.*;

class Hashing { 
    private int[] hash_table = new int[10];

    Hashing(){ 
	for(int j=0; j<10; j++) 
	    hash_table[j] = -1;
    } 

    public void display() {
	System.out.print("Table: ");
	for (int i = 0; i < hash_table.length; i++) {
        int data = hash_table[i];
        if (data != 0) {
            System.out.print(data);
        } else {
            System.out.print(" * ");
        }
    }
	//add code here
   }
   
   public void insert(int key)  { 
	   
	   
	   
	   int currentIndex = 0;
	   while (currentIndex < hash_table.length) {
		   hash_table[currentIndex] = key ;
		   currentIndex++;
	  //if(data[i]==i) {
		 //   hash_table[i] = data[i];
		//  }else {
		//	  hash_table[i] = 0;
			  
		//  }
		   if (currentIndex == 7) {
               break;
           }
	   }
	  
	//add code here
	  
   } 
   
   public static void main(String[] args) { 
        Hashing hashtab = new Hashing(); 
        String msg = "";
        int num=0,  i = 0;
        Scanner input = new Scanner(System.in);
        for(i=0; i<7; i++) {
            msg = input.nextLine();
            num = Integer.parseInt(msg);
            hashtab.insert(num);
        }
        hashtab.display(); 
    }
}
