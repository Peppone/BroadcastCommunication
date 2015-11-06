package event;

import java.util.ArrayList;

public class Timeline {
	private ArrayList<Event> eventList;
	private int currentIndex;
	
	public Timeline(){
		eventList = new ArrayList<Event>();
		currentIndex = -1;
	}

	public void addEvent(Event e) {
		if (eventList.isEmpty()) {
			eventList.add(e);
			currentIndex = 0;
		} else {
			for (int i = currentIndex; i < eventList.size(); ++i) {
				Event compare = eventList.get(i);
				if (compare.getTime() > e.getTime()) {
					eventList.add(i, e);
					
					return;
				}
			}
			eventList.add(e);
		}
		return;
	}
	public Event pop(){
		if(eventList.isEmpty())return null;
		Event event = eventList.get(currentIndex);
		currentIndex +=1;
		return event;
	}

}
