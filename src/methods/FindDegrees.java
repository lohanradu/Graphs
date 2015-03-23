package methods;

import inputReader.InputReader;
import Util.Util;

public class FindDegrees implements Command {
	/*
	 * the function parses the list of edges and prints the in and out degree of
	 * a given vertice (non-Javadoc)
	 * 
	 * @see Controller.Command#execute()
	 */
	@Override
	public void execute() {
		int inDegree = 0, outDegree = 0, vertice;
		System.out.print("Vertex number > ");
		vertice = Util.getCommand();
		for (entity.Edge edge : InputReader.edges) {
			if (edge.getFirstVertice() == vertice) {
				outDegree++;

			}
			if (edge.getSecondVertice() == vertice) {

				inDegree++;
			}

		}

		System.out.println("In degree: " + inDegree);
		System.out.println("Out degree: " + outDegree);
	}
}