package DFS;

import java.util.LinkedList;

public class Graph {
	private int vertices;
	private LinkedList<Integer>[] adjecencyList;
	public Graph(int vertices) {
		this.vertices=vertices;
		this.adjecencyList=new LinkedList[vertices];
		for(int i=0;i<vertices;i++) {
			adjecencyList[i]=new LinkedList<Integer>();
		}
	}
	public void addEdge(int from,int to) {
	
	adjecencyList[from].add(to);
	}
	public void DFS(int start) {
        boolean[] visited = new boolean[vertices];
        System.out.println("Graph Traversal by using DFS from 0");
        DFSUtil(start, visited);
    }

    private void DFSUtil(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(current + " ");

        for (int neighbor : adjecencyList[current]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

}
