package spring.demo.one;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "It's your lucky day !";
	}

}
