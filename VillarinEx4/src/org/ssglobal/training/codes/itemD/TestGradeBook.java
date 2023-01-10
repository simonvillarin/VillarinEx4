package org.ssglobal.training.codes.itemD;

public class TestGradeBook {

	public static void main(String[] args) {
		GradeBook gradeBook = new GradeBook();
		gradeBook.addGrades(1.0);
		gradeBook.addGrades(2.0);
		gradeBook.addGrades(3.0);
		gradeBook.addGrades(4.0);
		gradeBook.addGrades(5.0);
		gradeBook.addGrades(6.0);
		gradeBook.addGrades(7.0);
		gradeBook.addGrades(8.0);
		gradeBook.addGrades(9.0);
		gradeBook.addGrades(10.0);
		gradeBook.printGrades();
		System.out.println("Average grade: " + gradeBook.averageGrades());
		gradeBook.deleteGrades(1.0);
		gradeBook.deleteGrades(2.0);
		gradeBook.deleteGrades(3.0);
		gradeBook.deleteGrades(4.0);
		gradeBook.deleteGrades(5.0);	
		gradeBook.deleteGrades(11.0);
		gradeBook.printGrades();
	}

}
