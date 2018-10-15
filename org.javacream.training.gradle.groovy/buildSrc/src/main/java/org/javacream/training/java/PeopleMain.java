package org.javacream.training.java;

public class PeopleMain{
	public static void main(){
		PeopleController peopleController = new PeopleController();
		peopleController.add("Sawitzki", "Rainer", 183, 1l);
		peopleController.add("Sawitzki", "Klaus", 182, 2l);
		System.out.println(peopleController.findById(1l));
	}
}