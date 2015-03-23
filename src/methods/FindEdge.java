package methods;

import inputReader.InputReader;
import Util.Util;

public class FindEdge implements Command {
	/*
	 * the class when called inserts two vertices and parses the list of edges
	 * to find if there is an edge (non-Javadoc)
	 * 
	 * @see Controller.Command#execute()
	 */
	@Override
	public void execute() {
		int vertice1, vertice2, cost = 0;
		boolean isEdge = false;
		
		System.out.print("Insert the first vertice: ");
		vertice1 = Util.getCommand();
		System.out.print("Insert the second vertice: ");
		vertice2 = Util.getCommand();

		for (entity.Edge edge : InputReader.edges) {
			if (edge.getFirstVertice() == vertice1
					&& edge.getSecondVertice() == vertice2) {
				isEdge = true;
				cost = edge.getCost();
				break;
			}
		}

		System.out.println("The existence of the edge is " + isEdge + " with the cost "+ cost + "\n");

	}
}
