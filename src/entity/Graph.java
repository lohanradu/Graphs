package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph {
	private int numberOFVertices;
	private Map<Integer, List<Integer>> vertices = new HashMap<Integer, List<Integer>>();
	private List<Integer> edges = new ArrayList<>();

	public Graph(int numberOFVertices) {
		for (int index = 0; index < numberOFVertices; index++) {
			List<Integer> neighbors = new ArrayList<>();
			this.vertices.put(index, neighbors);

		}
	}

	public List<Integer> getEdges() {
		return edges;
	}

	public void setEdges(List<Integer> edges) {
		this.edges = edges;
	}

	public int getNumberOFVertices() {
		return numberOFVertices;
	}

	public Set<Integer> parseX() {
		return this.vertices.keySet();

	}

	public List<Integer> parseNout(int x) {
		// Returns an iterable containing the outbound neighbours of x
		return this.vertices.get(x);
	}

	public List<Integer> parseNin(int x) {
		// Returns an iterable containing the inbound neighbours of x

		List<Integer> inbound = new ArrayList<>();

		for (int i = 0; i < this.vertices.size(); i++) {
			for (int neighbor = 0; neighbor < this.vertices.get(i).size(); neighbor++) {
				if (x == this.vertices.get(i).get(neighbor)) {
					inbound.add(i);
				}
			}
		}

		return inbound;

	}

	public boolean isEdge(int firstVertex, int secondVertex) {
		// verifies if an edge between two vertices exists
		return this.vertices.get(firstVertex).contains(secondVertex);

	}

	public void addEdge(int firstVertex, int secondVertex) {
		if (!this.isEdge(firstVertex, secondVertex)) {
			this.vertices.get(firstVertex).add(secondVertex);

		}

	}

	public void setNumberOFVertices(int numberOFVertices) {
		this.numberOFVertices = numberOFVertices;
	}

	public Set<Integer> accessible(int startVertex) {

		Set<Integer> accessible = new HashSet<Integer>();
		accessible.add(startVertex);
		List<Integer> list = new ArrayList<>();
		list.add(startVertex);
		while (list.size() > 0) {
			int vertex = list.get(0);
			list.remove(0);
			List<Integer> lista = vertices.get(vertex);
			if (lista != null) {
				for (int neighbor : lista) {

					if (!accessible.contains(neighbor)) {
						accessible.add(neighbor);
						list.add(neighbor);
					}
				}
			}

		}
		return accessible;

	}

	public void setVertices(Map<Integer, List<Integer>> vertices) {
		this.vertices = vertices;

	}

	public Map<Integer, List<Integer>> getVertices() {
		return this.vertices;

	}

}
