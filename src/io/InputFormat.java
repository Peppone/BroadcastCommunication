package io;

public class InputFormat {


	public static Configuration newConfiguration(String[] param){
		int processor = Integer.parseInt(param[0]);
		int segment = Integer.parseInt(param[1]);
		double G = Double.parseDouble(param[2]);
		double latency = Double.parseDouble(param[3]);
		double overheadtx = Double.parseDouble(param[4]);
		double overheadrx = Double.parseDouble(param[5]);
		
		return new Configuration(processor,segment,G,latency,overheadtx,overheadrx);
		
		
	}

}
