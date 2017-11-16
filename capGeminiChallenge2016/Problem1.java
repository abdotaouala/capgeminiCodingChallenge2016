/**
 * 
 */
package capGeminiChallenge2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author TAOUALA
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile=new File("src/inputp2.txt");
		try {
		Scanner inputScanner=new Scanner(inputFile);
		while(inputScanner.hasNext()){
			int a=inputScanner.nextInt();
			int b=inputScanner.nextInt()+1;
			String s=inputScanner.nextLine();
			//System.out.println(s);
			if(b<=s.length())
			System.out.println(s.substring(a,b));
			else if(b >s.length()) System.out.println(s.substring(a));
			
		} 
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
