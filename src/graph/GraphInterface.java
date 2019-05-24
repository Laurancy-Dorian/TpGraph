package graph;

public interface GraphInterface {
	
	// Vertex part
	/**
	 * 
	 * @param vertex The vertex that has to be added in vertex collection
	 */
	public void addVertex(Vertex vertex);
	
	// Vertex part

	/**
	 * 
	 * @return all vertexes of the graph in a table shape
	 */
	public Vertex[] getVertexes();
	
	
	/**
	 * @param vertex The vertex that has to be removed from vertex collection
	 */
	public void removeVertex(Vertex vertex);
	

	/**
	 * Check if two vertex are connected
	 * @param vertex1 The first vertex that is supposed to be connected
	 * @param vertex2 The second vertex that is supposed to be connected
	 * @return true if both vertexes are connected
	 */
	public boolean connectedVertex(Vertex vertex1, Vertex vertex2);
	
	/**
	 * Give all Vertex neighbors
	 * @param vertex The Vertex that you want to know the neighbors
	 * @return A Vertex table
	 */
	public Vertex[] neighbors(Vertex vertex);
	
	// EDGE PART
	/**
	 * 
	 * @param edge The edge that has to be added in edge collection
	 */
	public void addEdge(Edge edge);
	
	/**
	 * remove an edge
	 * @param edge The edge that has to be removed from edge collection
	 */
	public void removeEdge(Edge edge);
	
	/**
	 * Rename an edge
	 * @param edge The edge that has to be renamed
	 * @param label The new label to apply
	 */
	public void renameEdge(Edge edge, String label);
	
}
