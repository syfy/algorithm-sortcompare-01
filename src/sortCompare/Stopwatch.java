package sortCompare;

public class Stopwatch {
	private final long start;
	private final long startMicro;

	public Stopwatch() {
		start = System.currentTimeMillis();
		startMicro = System.nanoTime();
	}

	public double elapsedTime() {
		long now = System.currentTimeMillis();
		return (now - start) / 1000.0;
	}

	public double elapsedTimeInMicro() {

		long nowMicro = System.nanoTime();
	
		return (nowMicro - startMicro);
		/// 1000.0;
	}

}
