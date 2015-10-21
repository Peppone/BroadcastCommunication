package event;

import core.Processor;

public class Event {
	
	Processor subject;
	double time;
	
	Event (Processor subject, double time){
		this.subject = subject;
		this.time = time;
	}

	public Processor getSubject() {
		return subject;
	}

	public void setSubject(Processor subject) {
		this.subject = subject;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
	
	
	
	
}
