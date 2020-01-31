package com.jdc;


//new System class
public class TVAdapter  {
	
	private ITV itv;

	public TVAdapter(ITV itv) {
		this.itv = itv;
	}
	
	public void remoteOn() {
		itv.on();
	}
	
	public void remoteOff() {
		itv.off();
	}
	
	

}
