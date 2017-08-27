package intermidia.EvalMeanCalc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class EvalMeanCalc 
{
    public static void main( String[] args ) throws Exception
    {
    	FileReader fileReader = new FileReader(new File(args[0]));
    	BufferedReader bufferedReader = new BufferedReader(fileReader);
    	float measures[] = new float[6];
    	int count = 0;
    	while(bufferedReader.ready())
    	{
    		String line = bufferedReader.readLine();
    		String values[] = line.split("\\s");
    		if(values.length == 8)
    		{
    			System.out.print(line + "\t");
    			for(int i = 0; i < 6; i++)
    			{
    				measures[i] = 0;
    			}
    			count = 0;
    		}
    		if(values.length == 6)
    		{
    			for(int i = 0; i < 6; i++)
    			{
    				measures[i] += Float.parseFloat(values[i]);
    			}
    			count++;
    		}  
    		if(values.length == 1)
    		{
    			for(int i = 0; i < 6; i++)
    			{
    				System.out.printf("%.2f ", measures[i]/count);
    			}
    			System.out.println();
    		}
    	}
    	bufferedReader.close();
    }
}
