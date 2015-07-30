//Program to calculate average test score.

import java.io.*;
import java.util.*;

public class INFTtest
{
    public static void main (String[] args) throws IOException,
                                        FileNotFoundException
    {
        int b1;
				double ch;
        String s="";

        BufferedReader inFile = new
              BufferedReader(new FileReader("test_input.txt"));   //the input file in the same directory

        PrintWriter outFile =  new
             PrintWriter(new FileWriter("outpu.txt", true));    //output the result in the same directory

				while (true)
				{  
					ch =inFile.read();
					System.out.println("ch=" + ch);
					if (ch == -1)
					{
						break;
					}
					if ((ch < 48) || (ch>57))
					{
						continue;
					}
					
					int b = Character.getNumericValue((char) ch);
					b1 = (b + 1)%10;
					
	        switch (b1) {
	            case 1:  s = "one";break;
	            case 2:  s = "two";break;
	            case 3:  s = "three";break;
	            case 4:  s = "four";break;
	            case 5:  s = "five";break;
	            case 6:  s = "six";break;
	            case 7:  s = "seven";break;
	            case 8:  s = "eight";break;
	            case 9:  s = "nine";break;
	            case 0:  s = "zero";break;
	            default: break;
	        }
	        
					System.out.println(s);
					outFile.println(s + "\r"); 
					outFile.flush();
				}
        
        inFile.close();
        outFile.close();
    }
}
