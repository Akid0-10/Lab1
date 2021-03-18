package Exercise7;

public class Weight {

	private double weight;
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double calculateWeight() {
		return (weight/9.81)*3.711;
	}
	
}
