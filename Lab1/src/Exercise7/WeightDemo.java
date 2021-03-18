package Exercise7;

import java.text.DecimalFormat;

public class WeightDemo {

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
