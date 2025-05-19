package StringPerformanceTest;
	public class StringPerformanceTest {
	    public static void main(String[] args) {
	        // StringBuffer performance test
	        StringBuffer sbf = new StringBuffer();
	        long startTimeSBf = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            sbf.append("AIET");
	        }
	        long endTimeSBf = System.nanoTime();
	        long durationSBf = endTimeSBf - startTimeSBf;
	        System.out.println("Time taken by StringBuffer: " + durationSBf + " nanoseconds");

	        // StringBuilder performance test
	        StringBuilder sb = new StringBuilder();
	        long startTimeSB = System.nanoTime();
	        for (int i = 0; i < 10000; i++) {
	            sb.append("AIET");
	        }
	        long endTimeSB = System.nanoTime();
	        long durationSB = endTimeSB - startTimeSB;
	        System.out.println("Time taken by StringBuilder: " + durationSB + " nanoseconds");

	        // Justification
	        if (durationSB < durationSBf) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	}


