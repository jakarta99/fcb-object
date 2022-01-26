package tw.com.fcb.sample.object;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class DoubleApp {

	
	public static void main(String[] args) {
		
		double a = 0.3;
		double b = 0.02;
		
		System.out.println(a - b);
		
		BigDecimal c = new BigDecimal("0.3");
		BigDecimal d = new BigDecimal("0.02");
		
		System.out.println( c.add(d)  );
		System.out.println( c.subtract(d)  );
		System.out.println( c.multiply(d)  );
		System.out.println( c.divide(d)  );
		
		BigDecimal e = new BigDecimal("0.1455967123121993324");
		System.out.println( e.round(new MathContext(2, RoundingMode.FLOOR)) );
		
		
		
	}
}
