import java.util.Arrays;


import org.apache.commons.math3.stat.correlation.KendallsCorrelation;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;

public class Main {
  
	public static void main(String[] args) {
	    double[] x = new double[10];
	    double[] y = new double[10];
	    
	   
	    for (int i = 0; i < x.length; i++) {
	        x[i] = Math.cos (i);
	        y[i] = Math.cos(i); //Math.cos(i)//Math.sin(i)//Math.tan(i)
	    }
	    double kor = new PearsonsCorrelation().correlation(x,y);
	    		
	    if (kor > 0 & kor <= 0.2) {
	    	System.out.println("brak korelacji");
	    }
	    else if (kor <= 0 & kor > -0.2) {
	    	System.out.println("brak korelacji");
	    }
	    else if (kor > 0.2 & kor <= 0.4) {
	    	System.out.println("słaba korelacja");
	    }
	    else if (kor >= -0.4 & kor < -0.2) {
	    	System.out.println("słaba korelacja");
	    }
	    else if (kor > 0.4 & kor <= 0.6) {
	    	System.out.println("srednia korelacja");
	    }
	    else if (kor >= -0.6 & kor < -0.4) {
	    	System.out.println("srednia korelacja");
	    }
	    else if (kor > 0.6 & kor <= 0.8) {
	    	System.out.println("silna korelacja");
	    }
	    else if (kor >= -0.8 & kor < -0.6) {
	    	System.out.println("silna korelacja");
	    }
	    else if (kor > 0.8 & kor <= 1) {
	    	System.out.println("bardzo silna korelacja");
	    }
	    else if (kor >= -1 & kor < -0.8) {
	    	System.out.println("bardzo silna korelacja");
	    }
	    System.out.println(kor);
	    
	  System.out.println("x: " + Arrays.toString(x));
	    System.out.println("y: " + Arrays.toString(y));
	    
	    
	    System.out.println("Korelacja Pearsona: " + new PearsonsCorrelation().correlation(x,y));
	    System.out.println("Korelacja Spearmna: " + new SpearmansCorrelation().correlation(x,y));
	    System.out.println("Korelacja Kendala: " + new KendallsCorrelation().correlation(x,y));
	}
	 

	}
	
	//
	


