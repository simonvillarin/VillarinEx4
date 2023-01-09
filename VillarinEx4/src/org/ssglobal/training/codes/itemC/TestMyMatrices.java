package org.ssglobal.training.codes.itemC;

public class TestMyMatrices {

	public static void main(String[] args) {
		int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] matrix2 = {{10, 11, 12, 13}, {14, 15, 16, 17}};
		int[][] matrix3 = {{18, 19}, {20, 21}, {22, 23}, {24, 25}};
		
		MyMatrices myMatrices = new MyMatrices();
		myMatrices.addMatrices(matrix1, matrix2, matrix3);
	}

}
