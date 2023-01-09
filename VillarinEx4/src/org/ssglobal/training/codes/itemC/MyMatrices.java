package org.ssglobal.training.codes.itemC;

public class MyMatrices {
	public void addMatrices(int[][]... matrices) {
		boolean isEqual = true;
		
		for (int[][] matrix : matrices) {
			int rows = matrix.length;
			int columns = matrix[0].length;
			
			if (rows != columns) {
				isEqual = false;	
			} else {
				isEqual = true;
			}
		}
		
		if (isEqual) {
			matrixAddition(matrices);
		} else {
			System.out.println("Invalid matrices");
		}
	}
	
	private void matrixAddition(int[][]... matrices) {
		int sum = 0;
		
		for (int[][] matrix : matrices) {
			for (int[] row : matrix) {
				for (int column : row) {
					sum += column;
				}
			}
		}
		System.out.println("The sum of all matrices: " + sum);
	}
}
