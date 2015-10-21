package core;

import io.Configuration;

public class Scheduler {

	
	private int processor;
	private int segment;
	private double gapPerByte;
	private double latency;
	private double txOverhead;
	private double rxOverhead;
	
	public Scheduler(Configuration conf){
		processor = conf.getProcessor();
		segment = conf.getSegment();
		gapPerByte = conf.getGapPerByte();
		latency = conf.getLatency();
		txOverhead = conf.getTxOverhead();
		rxOverhead = conf.getRxOverhead();
	}
	
	public Object schedule(){
		Processor pList []= setupProcessors();
		return null;
	}
	
	public int getProcessor() {
		return processor;
	}
	public void setProcessor(int processor) {
		this.processor = processor;
	}
	public int getSegment() {
		return segment;
	}
	public void setSegment(int segment) {
		this.segment = segment;
	}
	public double getGapPerByte() {
		return gapPerByte;
	}
	public void setGapPerByte(double gapPerByte) {
		this.gapPerByte = gapPerByte;
	}
	public double getLatency() {
		return latency;
	}
	public void setLatency(double latency) {
		this.latency = latency;
	}
	public double getTxOverhead() {
		return txOverhead;
	}
	public void setTxOverhead(double txOverhead) {
		this.txOverhead = txOverhead;
	}
	public double getRxOverhead() {
		return rxOverhead;
	}
	public void setRxOverhead(double rxOverhead) {
		this.rxOverhead = rxOverhead;
	}
	
	private Processor[] setupProcessors(){
		Processor p[] = new Processor[processor];
		p[0]=new Processor(segment,true);
		for(int i =1; i<processor;++i){
			p[i]=new Processor(segment);
		}
		return p;
	}
}
