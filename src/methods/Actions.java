package methods;

import java.util.HashMap;
/*
 * The class has a field with a map which creates the connections between method id and actual method
 * in main class we instantiate the class and initialize it
 * 
 */
public class Actions {
	static public HashMap<Integer, Command> commandList = new HashMap<Integer, Command>();
	Exit exit = new Exit();
	GetNumberOfVertices getNumberOFVertices = new GetNumberOfVertices();
	FindDegrees findDegrees = new FindDegrees();
	FindEdge findEdge = new FindEdge();
	ListOfNeighbors listOfNeighbors = new ListOfNeighbors();
	Accessible accessible = new Accessible();
	
	public void Initialize() {
/*
 * Here we create the map of functions
 */
		commandList.put(0, exit);
		commandList.put(1, getNumberOFVertices);
		commandList.put(2, findEdge);
		commandList.put(3, findDegrees);
		commandList.put(4, listOfNeighbors);
		commandList.put(5, accessible);
	}

	public void Execute(int id) {
/*
 * this method executes the functions from the map
 */
		
		commandList.get(id).execute();
	}
}
