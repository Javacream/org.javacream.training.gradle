package org.javacream.training.groovy

class CollectionsDemo{
	def collectionsDemo() {
		def aRange = 1..2
		aRange.each({ element -> println(element) })

		def myRange = new MyRange(1, 3)
		myRange.each({ element -> println(element) })

		def aList = ["Hugo", "Emil", "Fritz", "Esmeralda", "Eva"]
		aList.each({ element -> println(element) })
		aList.each({ println(it) })

		aList.
				findAll({ element -> element.startsWith("E") }).
				collect({ element -> return element.reverse() }).
				each({ println(it) })

		List<String> temp1 = aList.findAll({ element -> element.startsWith("E") })
		List<Integer> temp2 = temp1.collect({ element -> return element.length() })
		temp2.each({ println(it) })

	}
	def static main(){
		new CollectionsDemo().collectionsDemo()
	}
	
}
class MyRange{
	Integer start
	Integer end
	MyRange(Integer start, Integer end){
		this.start = start
		this.end = end
	}
	def each(def callbackFunction){
		for (int i = start; i <= end; i++){
			callbackFunction(i)
		}
	}
}
