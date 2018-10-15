package org.javacream.training.groovy

import groovy.transform.Canonical
 
@Canonical
class Person{
	String lastname
	String firstname
	Integer height
	Long id
}