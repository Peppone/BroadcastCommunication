package core;

import java.util.ArrayList;

import event.Event;

public class ProcessorLists {
	private int missingSegment [];
	private int missingPosition [];
	ArrayList<ArrayList<Processor>> available;
	ArrayList <Processor> complete;
	ArrayList <Processor> idle;
	int segment;
	
	ProcessorLists (Processor[] proc, int segment, int processor){
		available = new  ArrayList<ArrayList<Processor>>();
		for(int i =0 ; i<segment;++i){
			available.set(i, new ArrayList<Processor>()) ;
		}
		missingSegment = new int [segment];
		missingPosition = new int [segment];
		for(int i =0;i<segment;++i){
			missingSegment[i]=processor-1;
			missingPosition[i]= i;
		}
		this.segment = segment;
		complete = new ArrayList<Processor>();
		idle = new ArrayList<Processor>();
		for(int i=0;i<proc.length;++i){
			int seg = proc[i].ownedSegments();
			if(seg<=segment){
				ArrayList <Processor> segList = available.get(seg);
				segList.add(proc[i]);
			}
			else{
				complete.add(proc[i]);
			}
		}
	}
	
	public Event findNewSender(Processor receiver){
		//TODO
		return null;
	}
}
