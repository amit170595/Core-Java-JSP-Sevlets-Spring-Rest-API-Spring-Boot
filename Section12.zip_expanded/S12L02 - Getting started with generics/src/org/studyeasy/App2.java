package org.studyeasy;

import java.util.ArrayList;

class GenericTypes3<T>{
	private T variable;

	public GenericTypes3(T variable) {
		this.variable = variable;
	}

	@Override
	public String toString() {
		return "GenericClass [variable=" + variable + "]";
	}

	public T getVariable() {
		return variable;
	}
	
}
 
public class App2 {

	public static void main(String[] args) {
		
		//System.out.println(new GenericClass<String>("Some text"));
		//System.out.println(new GenericClass<Double>(2.0));
		//System.out.println(new GenericClass<Character>('#'));
		
		@SuppressWarnings("rawtypes")
		ArrayList<GenericTypes3> list = new ArrayList<>();
		list.add(new GenericTypes3<Integer>(1));
		list.add(new GenericTypes3<Integer>(2));
		list.add(new GenericTypes3<String>("String"));
		list.add(new GenericTypes3<Integer>(4));
		list.add(new GenericTypes3<Integer>(5));
		list.add(new GenericTypes3<Integer>(6));
	}	
}














