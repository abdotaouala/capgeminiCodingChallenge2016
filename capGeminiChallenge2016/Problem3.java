/**
 * 
 */
package capGeminiChallenge2016;

import java.io.File;
import java.util.Scanner;

/**
 * @author TAOUALA
 *
 */
public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile=new File("src/inputp3.txt");
		try{
			Scanner scan=new Scanner(inputFile);
			//System.out.println(4%3);
			
			while(scan.hasNextInt()){
				int i=0;
				int a=scan.nextInt();
				
					while(a>=1) {
					a=a/3;
					i++;
				}
				
				System.out.println(i);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
