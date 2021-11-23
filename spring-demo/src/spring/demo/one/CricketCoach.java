package spring.demo.one;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public CricketCoach() {
		
	}	

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice to field";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
