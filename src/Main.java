import io.Configuration;
import io.InputFormat;
import io.OutputFormat;
import core.Scheduler;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length<6){
			System.err.println("Usage: program #processor #segments gap_per_byte latency tx_overhead rx_overhead");
			return;
		}
		Configuration conf = InputFormat.newConfiguration(args);
		Scheduler s = new Scheduler(conf);
		s.schedule();
	}

}
