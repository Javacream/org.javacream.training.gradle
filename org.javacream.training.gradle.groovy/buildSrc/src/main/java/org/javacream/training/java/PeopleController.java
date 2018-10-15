package org.javacream.training.java;

import java.util.*;

class PeopleController{
	private Map<Long, Person> people = new HashMap<>();
	public void add(String lastname, String firstname, Integer height, Long id){
		people.put(id, new Person(lastname, firstname, height, id));
	}
	
	public Person findById(Long id){
		return people.get(id);
	}
}