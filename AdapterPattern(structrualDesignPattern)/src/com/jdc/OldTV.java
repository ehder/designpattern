package com.jdc;

public class OldTV implements ITV {

	@Override
	public void on() {
		System.out.println("turn to Right");

	}

	@Override
	public void off() {
		System.out.println("turn to Left");

	}

}
