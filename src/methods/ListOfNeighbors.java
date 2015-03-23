package methods;

import inputReader.InputReader;

import java.util.ArrayList;
import java.util.List;

import Util.Util;

public class ListOfNeighbors implements Command {

	@Override
	public void execute() {
		int vertex;
		List<Integer> neighborList = new ArrayList<Integer>();
		System.out.print("Inset vertex > ");
		vertex = Util.getCommand();

		for (entity.Edge edge : InputReader.edges) {
			if (edge.getFirstVertice() == vertex) {
				neighborList.add(edge.getSecondVertice());
			}
		}

		for (int neighbor : neighborList) {
			System.out.print(neighbor + " ");
		}

		System.out.println();
	}

}
