package ejemploEstaticos;

public class Cohete {
	private static int numCohetes;

	public Cohete() {
		numCohetes++;
	}

	public int getCohetes() {
		return numCohetes;
	}

}
