package com.kapil.spring.bacis.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	/*
	 * What are the beans? - @Component 
	 * What are the dependencies of a bean? - @Autowired
	 * Where to search for the beans? - @SpringBootApplication
	 *                        		 => No need to specify exclusively
	 */

	public static void main(String[] args) {
		// Spring will create beans as we annotated with  @Component
		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext  applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class); 
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
	}

}
