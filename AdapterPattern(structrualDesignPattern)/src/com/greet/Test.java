package com.greet;

public class Test {
	
	public static void main(String[] args) {
		GreetingAdapter greeting = new GreetingAdapter(new GreetingClass());
		System.out.println(greeting.verboseGreet("Eh der lel", "how are you ", "i hope you are well as for me i'm fine" ));
	}

}
