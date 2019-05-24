package graph;

public class DirectedEdge extends Edge {
	/**
	 * @param startingVertex Origin of the edge
	 * @param endingVertex Destination of the edge
	 */
	public DirectedEdge(Vertex startingVertex, Vertex endingVertex) {
		this.setVertex1(startingVertex);
		this.setVertex2(endingVertex);
	}
	
	public Vertex getOrigin() {
		return this.getVertex1();
	}
	
	public void setOrigin(Vertex vertex) {
		this.setVertex1(vertex);
	}
	
	public Vertex getDestination() {
		return this.getVertex1();
	}
	
	public void setDestination(Vertex vertex) {
		this.setVertex1(vertex);
	}
}
