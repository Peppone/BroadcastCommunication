package io;

public class Configuration {

	private int processor;
	private int segment;
	private double gapPerByte;
	private double latency;
	private double txOverhead;
	private double rxOverhead;


	public Configuration(int processor, int segment, double gapPerByte,
			double latency, double txOverhead, double rxOverhead) {
		super();
		this.processor = processor;
		this.segment = segment;
		this.gapPerByte = gapPerByte;
		this.latency = latency;
		this.txOverhead = txOverhead;
		this.rxOverhead = rxOverhead;
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

	public double getLatency() {
		return latency;
	}

	public void setLatency(double latency) {
		this.latency = latency;
	}

	public double getGapPerByte() {
		return gapPerByte;
	}

	public void setGapPerByte(double gapPerByte) {
		this.gapPerByte = gapPerByte;
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

}
