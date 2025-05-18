package Dijkstra;

public class ShortestPath {
	
	public static int V=6;
	public int MinDis(int dist[],int visited[]) {
		
		int min=Integer.MAX_VALUE;
		int index=-1,i;
		for(i=0;i<V;i++) {
			if(dist[i]<min&&visited[i]==0) {
				min=dist[i];
				index=i;
			}
		}
		return index;
		
	}
	public void print(int dist[]) {
		System.out.println("index     "+"distance from source");
		for(int i=0;i<V;i++) {
			System.out.println(i+"    "+dist[i]);
			
			
			
		}
	}
	
	 public void dijkstra(int graph[][],int src) {
		 int dist[]=new int [V];
		 int visited[]=new int[V];
		 for(int i=0;i<V;i++) {
			 dist[i]=Integer.MAX_VALUE;
			 visited[i]=0;
			
		 }
		 dist[src]=0;
		 for(int i=0;i<V-1;i++) {
		 int u=MinDis(dist,visited);
		 visited[u]=1;
		 for(int j=0;j<V;j++) {
			 if(graph[u][j]!=0 && visited[j]==0&& dist[u] != Integer.MAX_VALUE) {
				 if(dist[u]+graph[u][j]<dist[j]) {
					 dist[j]=dist[u]+graph[u][j];
				 }
				 
				 
				 
			 }
			 
			 
		 }
		 
		 
		 
		 
		 
		 }
		 
		 print(dist);
		 }
		 
		
		
		
		
	}


