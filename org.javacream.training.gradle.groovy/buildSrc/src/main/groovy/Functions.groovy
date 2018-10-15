package org.javacream.training.groovy

import groovy.transform.Canonical
 
class FunctionDemo{
	String demo = "Hello"
	def demoFunction(String param1, Integer param2){
		//Variablen-Deklaration: def | <type> <name> = Literal
		//Hier in diesem Beipiel: output, eine "function scoped" Variable
		//"..." String-Literal
		def output = "param1: $param1 param2: $param2"
		println(output)
		//Was ist x?
		//Was ist {...}
		//x ist eine Variable, genauer eine Referenz auf ein Funktionsobjekt
		//{...} Funktions-Literal 
		def closureFn = { def message -> 
			println("Message: $message output: $output") 
			return "from inner"
		}
		
		closureFn("Hello, internal Function!")
		
		return closureFn;
	}
	
	def static main(){
		def result = new FunctionDemo().demoFunction("Hello", 42)
		println(result)
		println(result("From main"))
	}
	
	def demoFn = {String message -> println(message) }
	
}