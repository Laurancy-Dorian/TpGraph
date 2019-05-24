package graph;

public class UndirectedEdge extends Edge{
	
	/**
	 *  
	 * @param vertex1 One Vertex connected the Edge
	 * @param vertex2 Another Vertex connected to the Edge
	 */
	public UndirectedEdge(Vertex vertex1, Vertex vertex2) {
		this.setVertex1(vertex1);
		this.setVertex2(vertex2);
	}
}
