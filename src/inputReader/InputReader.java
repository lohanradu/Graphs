package inputReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import entity.Edge;

public class InputReader {

	public static int noOfVertices;
	public static int noOfEdges;
	public static List<Edge> edges = new ArrayList<Edge>();
	public static Map<Integer, List<Integer>> vertices = new HashMap<Integer, List<Integer>>();

	public void readInput() throws FileNotFoundException {

		try (Scanner scanner = new Scanner(new File("in.txt"))) {

			noOfVertices = readVertex(scanner);
			noOfEdges = scanner.nextInt();
			for (int edge = 0; edge < noOfEdges; edge++) {
				int firstVertex = readVertex(scanner);
				int secondVertex = readVertex(scanner);
				int cost = readVertex(scanner);
				if (vertices.containsKey(firstVertex)) {
					vertices.get(firstVertex).add(secondVertex);
				} else {
					vertices.put(firstVertex, new ArrayList<>());
					vertices.get(firstVertex).add(secondVertex);
				}
				edges.add(new Edge(firstVertex, secondVertex, cost));

			}
		}
	}

	/*
	 * private static Edge readEdge(Scanner scanner) { return new
	 * Edge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()); }
	 */
	private static int readVertex(Scanner scanner) {

		return scanner.nextInt();
	}

}
