package graph;

public class Vertex {
	private Object infos;

	public Vertex(Object infos) {
		this.setInfos(infos);
	}
	public Object getInfo() {
		return this.infos;
	}

	public void setInfos(Object infos) {
		this.infos = infos;
	}	
}
