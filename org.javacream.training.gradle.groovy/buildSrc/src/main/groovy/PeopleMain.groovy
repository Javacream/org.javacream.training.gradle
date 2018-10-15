package org.javacream.training.groovy

class PeopleMain{
	def static main(){
		def peopleController = new PeopleController()
		peopleController.add "Sawitzki", "Rainer", 183, 1
		peopleController.add "Sawitzki", "Klaus", 182, 2
		println(peopleController.findById(1))
	}
}