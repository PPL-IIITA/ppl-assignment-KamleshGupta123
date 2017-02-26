import java.util.*;
import java.io.*;
/**
	*...CSV_GENERATOR...
*/
public class c_gen{
	public static void main(String args[]){

		String[] girls={"K","L","M","N","Z"};
		String[] boys = {"A","B","C","D","E","F","G","H","I","J"}; 

		try{
			PrintWriter w = new PrintWriter("girls.csv", "UTF-8");
			for(int i=0; i<5; i++){
				w.println(girls[i]+","+(int)(Math.random()*10 + 1)+","+ 
				(int)(Math.random()*10 + 1)+","+ (int)(Math.random()*100 + 1) );
			}
			w.close();
			
			w = new PrintWriter("boys.csv", "UTF-8");
                        for(int i=0; i<10; i++){
                                w.println(boys[i]+","+(int)(Math.random()*10 + 1)+","+
                                (int)(Math.random()*100 + 1)+","+ (int)(Math.random()*10 + 1)+","+(int)(Math.random()*5 + 1) );
                        }
                        w.close();

		} 
		catch (IOException e) {
			System.out.println("Error");
		}
	}
}
