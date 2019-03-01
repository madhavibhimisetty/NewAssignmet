package Assignment5;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
	 
public class BreathFirstSearch {
	 	private Queue<Node> queue;
		static ArrayList<Node> nodes=new ArrayList<Node>();
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
	 
		public BreathFirstSearch()
		{
			queue = new LinkedList<Node>();
		}
	 
		public void bfs(Node node)
		{
			queue.add(node);
			node.visited=true;
			while (!queue.isEmpty())
			{
	 
				Node element=queue.remove();
				System.out.print(element.data+ "\n");
				List<Node> neighbours=element.getNeighbours();
				for (int i = 0; i < neighbours.size(); i++) {
					Node n=neighbours.get(i);
					if(n!=null && !n.visited)
					{
						queue.add(n);
						n.visited=true;
	 
					}
				}
	 
			}
		}
public static void main(String arg[])
		{
			Node node2 =new Node(4);
			Node node1 =new Node(1);
			Node node4 =new Node(2);
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
			System.out.println("The BFS traversal of the graph is ");
			BreathFirstSearch bfsExample = new BreathFirstSearch();
			bfsExample.bfs(node4);
	 
		}
	}
	 


