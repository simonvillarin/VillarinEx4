package org.ssglobal.training.codes.itemA;

public record Statistic(int... data) {	
	private double mean() {
		int sum = 0;
		
		for (int value : data) {
			sum += value;
		}
		return sum / data.length;
	}
	
	private double geometricMean() {
		int product = 1;
		
		for (int value : data) {
			product *= value;
		}
		
		return Math.sqrt(product);
	}
	
	private double variance() {
		double mean = mean();
		double totalSquared = 0;
		
		for (int value : data) {
			double difference = value -= mean;
			double squared = difference * difference;
			totalSquared += squared;
		}	
		return totalSquared / data.length;
	}
	
	private void max() {
		int max = data[0];
		
		for (int value : data) {
			if (value > max) {
				max = value;
			}
		}
		System.out.println("The maximum number is: " + max);
	}
	
	public void compute() {
        System.out.println("Mean: " + mean());
        System.out.println("Geometric mean: " + geometricMean());
        System.out.println("Variance: " + variance());
        max();
    }
}
