import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.math3.stat.correlation.KendallsCorrelation;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;
import org.apache.commons.math3.stat.correlation.SpearmansCorrelation;

public class Main {
  private static double[] x = new double[10];
  private static double[] y = new double[10];
  private static Scanner scanner;

	public static void main(String[] args) {
		Main program = new Main();
	   program.startProgram();
		
	    double kor = new PearsonsCorrelation().correlation(x,y);
	   		
	    if (kor > 0 & kor <= 0.2) {
	    	System.out.println("brak korelacji " + kor);
	    }
	    else if (kor <= 0 & kor > -0.2) {
	    	System.out.println("brak korelacji " + kor);
	    }
	    else if (kor > 0.2 & kor <= 0.4) {
	    	System.out.println("słaba korelacja " + kor);
	    }
	    else if (kor >= -0.4 & kor < -0.2) {
	    	System.out.println("słaba korelacja " + kor);
	    }
	    else if (kor > 0.4 & kor <= 0.6) {
	    	System.out.println("srednia korelacja " + kor);
	    }
	    else if (kor >= -0.6 & kor < -0.4) {
	    	System.out.println("srednia korelacja " + kor);
	    }
	    else if (kor > 0.6 & kor <= 0.8) {
	    	System.out.println("silna korelacja " + kor);
	    }
	    else if (kor >= -0.8 & kor < -0.6) {
	    	System.out.println("silna korelacja " + kor);
	    }
	    else if (kor > 0.8 & kor <= 1) {
	    	System.out.println("bardzo silna korelacja");
	    }
	    else if (kor >= -1 & kor < -0.8) {
	    	System.out.println("bardzo silna korelacja");
	    }
	    
	  System.out.println("x: " + Arrays.toString(x));
	    System.out.println("y: " + Arrays.toString(y));
	    
	    
	    System.out.println("Korelacja Pearsona: " + new PearsonsCorrelation().correlation(x,y));
	    System.out.println("Korelacja Spearmna: " + new SpearmansCorrelation().correlation(x,y));
	    System.out.println("Korelacja Kendala: " + new KendallsCorrelation().correlation(x,y));
	}
	 

	private void readFile(String path, double []a) {
		int m = 0;
		File fileToRead = new File(path); 
        try {
            scanner = new Scanner(fileToRead);
            while(scanner.hasNextLine() && m<a.length ) {
            	a[m]= scanner.nextDouble();
            	m++;
            }
        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
    }
	
	private void startProgram() {
		System.out.println("Prosze wybrac plik:");
		System.out.println("1 - przykład silnej korelacji wiek dzieci do 18 roku życia do wzrostu,  gdzie x: wiek badanego y: wzrost badanego w cm");
		System.out.println("2 - przykład słabej korelacji coroczne notowanie cukru (USc/funt) do notowania corocznego złota (USD/uncja)  gdzie x: cukier a y: złoto");
		System.out.println("3 - przykład korelacji pozornej Spożycie żółtego sera w USA w funtach na obywatela do Liczba śmierci spowodowanych zaplątaniem się w pościel, gdzie x: ser w funtach a y: liczba smierci");		
		scanner = new Scanner(System.in);
		int d = scanner.nextInt();
		switch(d) {
		
		case 1 :
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\silna.txt", x);
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\silna2.txt", y);
			break;
		case 2 :
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\srednia.txt", x);
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\sredni2.txt", y);
			break;
		case 3 :
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\pozorna.txt", x);
			readFile("C:\\Users\\u6064276\\eclipse-workspace\\Statystyka\\data\\pozorna2.txt", y);
			break;
		default:
			System.out.println("zle, wybierz jeszcze raz");
			startProgram();
			break;
			
			}
	}
}	
	

	


