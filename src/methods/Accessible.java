package methods;

import inputReader.InputReader;

import java.util.Set;

import entity.Graph;
import Util.Util;

public class Accessible implements Command {
	@Override
	public void execute() {

		System.out.print("Insert starting Vertex : ");
		int startVertex = Util.getCommand();
		Graph graph = new Graph(InputReader.noOfVertices);
		graph.setVertices(InputReader.vertices);
		Set<Integer> accessible = graph.accessible(startVertex);
		for (int vertex : accessible) {
			System.out.print(vertex + " ");
			System.out.println();
			
		}

	}

}
