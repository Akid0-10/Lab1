package Exercise7;

import java.text.DecimalFormat;

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
	
	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Weight weight1 = new Weight();
		weight1.setWeight(50);
		
		System.out.println("Weight on Earth: "+ 
		df.format(weight1.getWeight())+ " kg");
		
		System.out.println("Weight on Mars: "+ 
		df.format(weight1.calculateWeight())+ " kg");
	}

}
