package methods;

import inputReader.InputReader;

public class GetNumberOfVertices implements Command {
//Prints on the screen the number of vertices
	@Override
	public void execute() {

		System.out.println("The number of Vertices is " + InputReader.noOfVertices + "\n");

	}
}
