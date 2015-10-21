package event;

import core.Processor;

public class Send extends Event {
	
	Processor receiver;
	int segment;
	
	Send (Processor sender, Processor receiver, double time, int segment){
		super(sender,time);
		this.receiver = receiver;
		this.segment = segment;
	}

	public Processor getReceiver() {
		return receiver;
	}

	public void setReceiver(Processor receiver) {
		this.receiver = receiver;
	}

	public int getSegment() {
		return segment;
	}

	public void setSegment(int segment) {
		this.segment = segment;
	}
	
	public Processor getSender(){
		return super.getSubject();
	}
	
	public Processor setSender(){
		return super.getSubject();
	}

	
	
	
}
