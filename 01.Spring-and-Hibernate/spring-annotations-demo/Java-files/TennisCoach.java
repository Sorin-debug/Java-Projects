package com.springDemo;
import org.springframework.stereotype.Component;
@Component
public class TennisCoach implements Coach {

	@Override
	public String getDailyworkout() {
				
		return "Practice your daily workout";
	}

}