/**
 * 
 */
package capGeminiChallenge2016;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author TAOUALA
 *
 */
public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File inputFile=new File("src/inputp5.txt");
		try{
			Scanner scan=new Scanner(inputFile);
			while(scan.hasNextLine()){
				String[] stab=scan.nextLine().toString().split(" ");
				Arrays.sort(stab,new Comparator<Object>() {

					@Override
					public int compare(Object o1, Object o2) {
						// TODO Auto-generated method stub
						int a=Integer.parseInt(o1.toString().trim());
						int b=Integer.parseInt(o2.toString().trim());
						return a>b?-1:1;
					}
				});
				;
				for (int i = 0; i < stab.length; i++) {
					System.out.print(stab[i]+" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
