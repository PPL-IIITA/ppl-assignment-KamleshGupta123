
import java.util.*;
import java.io.*;
/** 
	*...GENERATE CSV FILES..
*/

public class c_gen{
	public static void main(String args[]){
		/*
		*... girls and boys array of string 
		*/
		int j;
		Random rn = new Random();
		String[] girls={"K","L","M","N","Z"};
		String[] boys = {"A","B","C","D","E","F","G","H","I","J"}; 
		String[] s = {"miser","geeks","generous"};
		String[] s1 = {"chossy","desperate","normal"};
		try{
			/*
			*... Here wew assign random value to csv files of girls
			*/
			PrintWriter w = new PrintWriter("girls.csv", "UTF-8");
			for(int i=0; i<5; i++){
				j = rn.nextInt(3);
				w.println(girls[i]+","+(int)(Math.random()*10 + 1)+","+ 
				(int)(Math.random()*10 + 1)+","+ (int)(Math.random()*50 + 1)+","+s1[j] );
			}
			w.close();
			/*
			*... Here wew assign random value to csv files of boys 
			*/
			w = new PrintWriter("boys.csv", "UTF-8");
                        for(int i=0; i<10; i++){
				j = rn.nextInt(3);
                                w.println(boys[i]+","+(int)(Math.random()*10 + 1)+","+
                                (int)(Math.random()*50 + 1)+","+ (int)(Math.random()*10 + 1)+","+(int)(Math.random()*5 + 1)+","+s[j] );
                        }
                        w.close();

		} 
		catch (IOException e) {
			System.out.println("Error");
		}
	}
}



