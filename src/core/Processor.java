package core;

public class Processor {
	
	private boolean segment[];
	
	public Processor(int segment){
		this(segment,false);
		
	}
	public Processor(int segment, boolean root){
		this.segment = new boolean [segment];
		if(root){
			for(int i=0;i<this.segment.length;++i){
				this.segment[i]=true;
			}
		}
	}
	public void setReceivedSegment(int n){
		segment[n]=true;
	}	
	public boolean haveSegment(int n){
		return segment[n];
	}
	
	public int ownedSegments(){
		int counter =0;
		for(int i=0;i<segment.length;++i){
			if(segment[i]) counter++;
		}
		return counter;
	}

}
