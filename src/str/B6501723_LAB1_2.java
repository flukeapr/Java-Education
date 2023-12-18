package array;
//LabArray.java
//demonstrates array class with low-level interface
//to run this program: C>java LabArray


class SimpleArray
{
	private long[] a; // ref to array a

	
	public SimpleArray(int size) // constructor
	{ a = new long[size]; } // create array

	
	public void setElem(int index, long value) // set value
	{ a[index] = value; }

	
	public long getElem(int index) // get value
	{ return a[index]; }


	public long findMax(int nElems) {
		long max = a[0]; 
		
		int maxindex = 0; 
		for(int i = 0; i < a.length; i++) { // loop for find max element
		if( a[i] > max) {  // if element more than max 
			max= a[i];  // max = element i
		 maxindex = i; // and maxindex = i in loop
		}
		}
		return maxindex;
	}


	public long removeMax(int nElems) {
		
		long max = a[0];
		
		int maxindex = 0;
		for(int i = 0; i < a.length; i++) { // same on top
		if( a[i] > max) {
			max= a[i];	
	         
	         for (int i1 = 1; i1<nElems; i1++) { // loop for new array after remove
					a[i1] = a[i1+1];
	        }
	       
	    }
		
	    
		}
	    return max;
		
		}
	
		
		
			 
		
		
	
	
	// TODO: (1) add a method findMax(int nElems) to return an index of the max element
	
	// TODO: (2) add a method removeMax() to remove the max element and shift all the elements up
	
} // end class LowArray



class B6501723_LAB1_2
{
	public static void main(String[] args)
	{
		SimpleArray arr; // reference
		arr = new SimpleArray(100); // create LowArray object
		int nElems = 0; // number of items in array
		int j; // loop variable
		
		
		arr.setElem(0, 77); // insert 10 items
		arr.setElem(1, 99);
		arr.setElem(2, 44);
		arr.setElem(3, 55);
		arr.setElem(4, 22);
		arr.setElem(5, 88);
		arr.setElem(6, 11);
		arr.setElem(7, 00);
		arr.setElem(8, 66);
		arr.setElem(9, 33);
		nElems = 10; // now 10 items in array
		
		
		for(j=0; j<nElems; j++) // display items
			System.out.print(arr.getElem(j) + " ");
		System.out.print("\nIndex Number : ");
			
		System.out.println(arr.findMax(nElems));
		
		System.out.print(arr.removeMax(nElems)); // display max element 
			
		System.out.println(" has been removed.");
		
for(j=0; j<nElems; j++) // display items after remove max
	
	 	System.out.print(arr.getElem(j) + " ");
		System.out.println("");

		
	} // end main()
} // end class LabArray