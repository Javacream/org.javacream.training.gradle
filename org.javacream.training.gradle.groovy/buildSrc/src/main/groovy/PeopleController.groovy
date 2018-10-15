package org.javacream.training.groovy

class PeopleController{
	Map people = [:]
	def add(String lastname, String firstname, Integer height, Long id){
		people.put(id, new Person(lastname, firstname, height, id))
	}
	
	Person findById(Long id){
		return people.get(id)
	}
}