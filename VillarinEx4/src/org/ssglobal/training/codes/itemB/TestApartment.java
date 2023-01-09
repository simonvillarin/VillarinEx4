package org.ssglobal.training.codes.itemB;

public class TestApartment {

	public static void main(String[] args) {
		String[] names = {"Liza Lui", "Simon James", "Juan Dela Cruz"};
		
		Apartment apartment = new Apartment(50, "Unit 1111, Pasig City", names);
		int headCount = apartment.getHeadCount();
		String location = apartment.getLocation();
		
		System.out.println("Head count: " + headCount);
		System.out.println("Location: " + location);
	}

}
