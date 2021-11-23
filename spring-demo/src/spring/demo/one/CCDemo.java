package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CCDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// setter injection demo
		Coach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		// call method on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		
		// test service injection
		System.out.println(cricketCoach.getDailyFortune());
		
		//close
		context.close();

	}

}
