package entity;

public class Edge {
	private int firstVertice;
	private int secondVertice;
	private int cost;

	public Edge(int firstVertice, int secondVertice, int cost) {
		this.firstVertice = firstVertice;
		this.secondVertice = secondVertice;
		this.cost = cost;

	}

	public int getFirstVertice() {
		return firstVertice;
	}

	public void setFirstVertice(int firstVertice) {
		this.firstVertice = firstVertice;
	}

	public int getSecondVertice() {
		return secondVertice;
	}

	public void setSecondVertice(int secondVertice) {
		this.secondVertice = secondVertice;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
