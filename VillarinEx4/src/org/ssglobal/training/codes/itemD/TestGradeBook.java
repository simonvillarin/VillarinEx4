package org.ssglobal.training.codes.itemD;

public class TestGradeBook {

	public static void main(String[] args) {
		GradeBook gradeBook = new GradeBook();
		gradeBook.addGrades(1);
		gradeBook.addGrades(2);
		gradeBook.addGrades(3);
		gradeBook.addGrades(4);
		gradeBook.addGrades(5);
		gradeBook.addGrades(6);
		gradeBook.addGrades(7);
		gradeBook.addGrades(8);
		gradeBook.addGrades(9);
		gradeBook.addGrades(10);
		gradeBook.printGrades();
		System.out.println("Average grade: " + gradeBook.averageGrades());
		gradeBook.deleteGrades(1);
		gradeBook.deleteGrades(2);
		gradeBook.deleteGrades(3);
		gradeBook.deleteGrades(4);
		gradeBook.deleteGrades(5);	
		gradeBook.deleteGrades(11);
		gradeBook.printGrades();
	}

}
