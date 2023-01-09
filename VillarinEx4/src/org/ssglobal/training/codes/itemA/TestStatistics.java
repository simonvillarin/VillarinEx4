package org.ssglobal.training.codes.itemA;

public class TestStatistics {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {6, 7, 8, 9, 10};
		int[] arr3 = {11, 12, 13, 14, 15};
		int[] arr4 = {16, 17, 18, 19, 20};
		int[] arr5 = {21, 22, 23, 24, 25};
 		
		Statistic s1 = new Statistic(arr1);
		s1.compute();
		
		Statistic s2 = new Statistic(arr2);
		s2.compute();
		
		Statistic s3 = new Statistic(arr3);
		s3.compute();
		
		Statistic s4 = new Statistic(arr4);
		s4.compute();
		
		Statistic s5 = new Statistic(arr5);
		s5.compute();
	}

}
