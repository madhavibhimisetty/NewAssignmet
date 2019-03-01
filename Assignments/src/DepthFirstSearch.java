package Assignment5;
import java.util.ArrayList;
import java.util.List;
public class DepthFirstSearch {
	static class Node
	{
		int data;
		boolean visited;
		List<Node> neighbours;
 
		Node(int data)
		{
			this.data=data;
			this.neighbours=new ArrayList<>();
 
		}
		public void addneighbours(Node neighbourNode)
		{
			this.neighbours.add(neighbourNode);
		}
		public List<Node> getNeighbours() {
			return neighbours;
		}
		public void setNeighbours(List<Node> neighbours) {
			this.neighbours = neighbours;
		}
	}
		public  void dfs(Node node)
		{
			System.out.print(node.data + " ");
			List<Node> neighbours=node.getNeighbours();
	        node.visited=true;
			for (int i = 0; i < neighbours.size(); i++) {
				Node n=neighbours.get(i);
				if(n!=null && !n.visited)
				{
					dfs(n);
				}
			}
		}
public static void main(String arg[])
	{
		Node node4 =new Node(4);
		Node node1 =new Node(1);
		Node node2 =new Node(2);
		Node node3 =new Node(3);
		Node node6 =new Node(6);
		Node node5 =new Node(5);
		Node node7 =new Node(7);
		node4.addneighbours(node1);
		node4.addneighbours(node2);
		node1.addneighbours(node3);
		node2.addneighbours(node1);
		node2.addneighbours(node3);
		node2.addneighbours(node6);
		node2.addneighbours(node5);
		node3.addneighbours(node6);
		node6.addneighbours(node7);
		node5.addneighbours(node7);
		DepthFirstSearch dfsExample = new DepthFirstSearch();
		System.out.println("The DFS traversal of the graph using recursion ");
		dfsExample.dfs(node4);
}
}
