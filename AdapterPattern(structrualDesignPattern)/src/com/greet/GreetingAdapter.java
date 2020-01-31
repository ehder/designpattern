package com.greet;

//New Class
public class GreetingAdapter{
	
	private IGreeting iGreeting;

	public GreetingAdapter(IGreeting iGreeting) {
		this.iGreeting = iGreeting;
	}
	
	public String verboseGreet(String name,String greeting,String greeter) {
		return iGreeting.greet(name + " : " + greeting + " : " + greeter);
	}
	
	

}
