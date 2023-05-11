package Sort;

import java.util.Arrays;

public class Dijkstra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int graph[][]= {
				{
					1,4,2,0,0},
				{1,0,1,5,0},
				{
					2,1,0,8,10
				},
				{
					0,5,8,0,2
				},
				{
					0,0,10,2,0
				}
		};
		
		int source=0;
		int [] distance=dijkstra(graph,source);
		for(int i=0;i<distance.length;i++)
		{
			System.out.println("vertex "+i+":" +distance[i]);
		}
	}

	private static int[] dijkstra(int[][] graph, int source) {
		// TODO Auto-generated method stub
		int n=graph.length;
		int[] distances=new int[n];
		boolean[] visited=new boolean[n];
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[source]=0;
		
		for(int i=0;i<n-1;i++)
		{
			int minVertex=findMinVertex(distances,visited);
			visited[minVertex]=true;
			for(int j=0;j<n;j++)
			{
				if(graph[minVertex][j]!=0 &&!visited[j])
				{
					int nd=distances[minVertex]+graph[minVertex][j];
					if(nd<distances[j])
					{
						distances[j]=nd;
					}
					
					
				}
			}
		}
		return distances;
	}

	private static int findMinVertex(int[] distances, boolean[] visited) {
		// TODO Auto-generated method stub
		int min=-1;
		for(int i=0;i<distances.length;i++)
		{
			if(!visited[i]&&(min==-1||distances[i]<distances[min]))
			{
				min=i;
			}
			
		}
		return min;
	}

}
