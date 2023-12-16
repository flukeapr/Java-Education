package str;

import java.util.*;
class gr<T>{
	
	// We use Hashmap to store the edges in the graph
		private Map<T, List<T> > map = new HashMap<>();
		private int[][] matrix ;
		
		gr(int size){
			matrix = new int[size][size];
			
		}

		// This function adds a new vertex to the graph
		public void addVertex(T s)
		{
			map.put(s, new LinkedList<T>());
		}

		// This function adds the edge
		// between source to destination
		public void addEdge(T source,
							T destination,
							boolean bidirectional)
			{
			if (!map.containsKey(source))
				addVertex(source);

			if (!map.containsKey(destination))
				addVertex(destination);

			map.get(source).add(destination);
				
				
				matrix[ (int) source][ (int) destination] =1;
			}

			

			// Prints the adjancency list of each vertex.
			@Override
			public String toString()
			{
				StringBuilder builder = new StringBuilder();

				for (T v : map.keySet()) {
					builder.append(v.toString() + ": ");
					for (T w : map.get(v)) {
						builder.append(w.toString() + " ");
					}
					builder.append("\n");
				}

				return (builder.toString());
			}
			
			public void print(int v) {
				System.out.print("   ");
				for(int k=0; k<v; k++) {
					System.out.print(k+" ");
					
				}
				
				System.out.println("");
				System.out.println("   -------");
				
				for(int i=0; i<matrix.length;i++) {
					System.out.print((i)+"| ");
					for(int j=0; j<matrix[i].length;j++) {
						System.out.print(matrix[i][j]+ " ");
						
					}
					System.out.println();
				}
				
				
			}
			
			
			
			
			
		}


	
	






public class Graph {
	
	
		public static void main(String[] args) {
			
			
			
			Scanner input = new Scanner(System.in);
			int vertex = 0 ;
			int num = 0;
			do {
			System.out.print("How many vertices? ");
			
			vertex = input.nextInt();
			}while(vertex>9);
			gr<Integer> graph = new gr<Integer>(vertex);
			for(int i=0; i<vertex; i++) {
				
				System.out.println("Adjacent of vertex "+i+":");
				
				while(true) {
				num=input.nextInt();
				
					if(num==-1) {
					
					break;
				}
					if(num>-1) {
						graph.addEdge(i, num, true);
						}
				}
				
			}
			System.out.println(graph.toString());
			graph.print(vertex);
		}
}
