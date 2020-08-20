package Generator.service.value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;

public class ValueGenerator {


    public static double generateValue() throws IOException{
    	Process p = Runtime.getRuntime().exec("sudo ps -A -o pcpu | tail -n+2 | paste -sd+ | bc");                                                                                                                                                     
    	BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
    	
    	String s = stdInput.readLine();
    	System.out.println(s);
    	
        return Double.parseDouble(s);
    }

}
