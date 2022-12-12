package org.studyeasy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Corola;
import org.studyeasy.cars.Swift;
import org.studyeasy.interfaces.Car;

public class App {

	public static void main(String[] args) {
		Car swift= new Swift();
		Car corola= new Corola();
		System.out.println(swift.specs());
		System.out.println(corola.specs());
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar= context.getBean("swift",Car.class);
		System.out.println(myCar.specs());
		Car myCar2= context.getBean("mycorola",Car.class);
		System.out.println(myCar2.specs());
		context.close();
	
	}

}
