package Assignment5;
import java.util.*;
class Graph{
		class Edge{
			int v;
			public Edge(int v){
				this.v=v;
			}
			@Override
			public String toString(){
				return "("+v+")";
			}
		}
		List<Edge> G[];
		public Graph(int n){
			G=new LinkedList[n];
			for(int i=0;i<G.length;i++)
				G[i]=new LinkedList<Edge>();
		}
		boolean isConnected(int u,int v){
			for(Edge i: G[u])
				if(i.v==v) return true;
			return false;
		}
		void addEdge(int u,int v){
			G[u].add(0,new Edge(v)); 
		}
		@Override
		public String toString(){
			String result="";
			for(int i=0;i<G.length;i++)
				result+=i+"=>"+G[i]+"\n";
			return result;
		}
	}
public class AdjacencyList {
		public static void main(String[] args) {
			Graph g=new Graph(10);
			g.addEdge(0, 2);
			g.addEdge(1, 5);
			g.addEdge(2, 5);
			g.addEdge(9, 3);
			g.addEdge(1, 4);
			g.addEdge(1, 6);
			System.out.println(g);
			System.out.println("Path between two given nodes::"+g.isConnected(0,2));
		}
	}


