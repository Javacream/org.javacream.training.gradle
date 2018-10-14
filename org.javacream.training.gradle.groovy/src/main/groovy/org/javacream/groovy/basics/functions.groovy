package org.javacream.groovy.basics

def application(){

	def number = 42;
	def number2 = 21;

	def resultFromDemo

	resultFromDemo = checkNumberIsEvenOrOdd(number)
	println resultFromDemo

	resultFromDemo = checkNumberIsEvenOrOdd number2
	println (resultFromDemo)
}
/**
 * diese funktion bestimmt, ob die �bergebene Zahle gerade oder ungerade ist
 * @param numberToCheck die zu pr�fende Zahel
 * @return das ergebnis, true falls gerade, false falls ungerade
 */
def checkNumberIsEvenOrOdd(def numberToCheck){

	def result = (numberToCheck%2 == 0)
	return result
}

application()
