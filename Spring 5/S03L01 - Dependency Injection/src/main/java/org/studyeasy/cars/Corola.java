package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.interfaces.Car;

@Component("mycorola")
public class Corola implements Car {

	@Override
	public String specs() {
		return "Sedan from Toyota";
	}

}
