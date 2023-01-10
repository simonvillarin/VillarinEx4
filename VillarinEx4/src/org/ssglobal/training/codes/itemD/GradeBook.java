package org.ssglobal.training.codes.itemD;

public class GradeBook {
	private double[] grades = new double[0];

	public void printGrades() {
		for (double grade : grades) {
			System.out.print(grade + " ");
		}
		System.out.println("");
	}

	public double averageGrades() {
		int sum = 0;

		for (double grade : grades) {
			sum += grade;
		}

		return sum / grades.length;
	}

	protected void addGrades(double newGrade) {
		double[] temp = new double[grades.length + 1];

		for (int i = 0; i < grades.length; i++) {
			temp[i] = grades[i];
		}
		temp[temp.length - 1] = newGrade;
		grades = temp;
	}

	protected void deleteGrades(double newGrade) {
        double[] temp = new double[grades.length - 1];
        int tempIndex = 0;
		boolean exists = false;
		
        for (double grade : grades) {
            if (grade == newGrade) {
                exists = true;
                break;
            }
        }       
        if (!exists) {
            System.out.println("Grade does not exist");
            return;
        }  
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] != newGrade) {
                temp[tempIndex] = grades[i];
                tempIndex++;
            }
        }
        grades = temp;
	}
}
