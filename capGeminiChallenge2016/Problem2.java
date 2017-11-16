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
public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile=new File("src/inputp2.txt");
		try{
			Scanner inputScan=new Scanner(inputFile);
			
				String b1 =inputScan.nextLine().trim().toString();
				String b2=inputScan.nextLine().trim().toString();
				//System.out.println(b1+"\n"+b2);
				String rs="";
				for (int i = 0; i < b1.length(); i++) {
					int a=Integer.parseInt(b1.substring(i, i+1));
					int b=Integer.parseInt(b2.substring(i, i+1));
					
					if(a==b) rs+="0";
					else rs+="1";
					
				}
				System.out.println(rs);
			System.out.println(rs.substring(rs.indexOf("1")));
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
