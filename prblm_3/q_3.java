import java.util.*;
import java.io.*;
/**
	*...MAIN CLASS...
*/
public class q_3{
	public static void main( String args[])throws IOException{
		int a=0,z=0;
		boys b[]= new boys[20];
		String s = "";
		String line = "";
		String c_split= ",";
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader("boys.csv"));
			while((line = br.readLine() )!= null){
				String[] Boy = line.split(c_split);
				s = Boy[5];
				switch(s){
				case "geeks":
					b[a]= new geeks();
					break;
				case "miser":
					b[a] = new miser();
					break;
				case "generous":	
					b[a] = new generous();
					break;
				}
				b[a].name = Boy[0];
				b[a].int_l = Integer.parseInt(Boy[1]);
				b[a].budget = Integer.parseInt(Boy[2]);
				b[a].attr = Integer.parseInt(Boy[3]);
				b[a].m_attr = Integer.parseInt(Boy[4]);
				b[a].t_b = Boy[5];
				b[a].status ="Single";
				b[a].gf="";
				a=a+1;	
				
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		girls g[] = new girls[15];
		try {
			br = new BufferedReader( new FileReader("girls.csv"));
			while((line = br.readLine() )!= null){
				String[] Girl = line .split(c_split);
				s = Girl[4];
				switch(s){
					case "chossy":
						g[z] = new chossy();
						break;
					case "normal":
						g[z] =new normal();
						break;
					case "desperate":
						g[z] = new desperate();
						break;
					}		
				g[z].name = Girl[0];
				g[z].g_int_l = Integer.parseInt(Girl[1]);
				g[z].g_attr = Integer.parseInt(Girl[2]);
				g[z].exp = Integer.parseInt(Girl[3]);
				g[z].t_g = Girl[4];
				g[z].bf= " ";
				g[z].status="Single";
				z=z+1;	
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			if(br != null){
				try {
					br.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		Pair pairs[] = new Pair[20];	
		int i,j,k1=0;
		for(i=0;i<a;i++){
			for(j=0;j<z;j++){
				if(b[i].status=="Single" &&g[j].status=="Single"&& b[i].budget>=g[j].exp && b[i].m_attr <= g[j].g_attr){
					g[j].bf =b[i].name;
					b[i].gf =g[j].name;
					b[i].status ="Committed";
					g[j].status ="Committed"; 
					/**
						*...HERE WE MAKE COUPLES PAIR...
					*/
					pairs[k1]=new Pair(b[i],g[j]);
					k1++;
				}
			}
		}
		PairSort S_P = new PairSort(pairs ,k1);
		/**
			*...Adjustment of Gifts...
		*/
		gift Gift[] = new gift[10];
		for(i=0; i<k1; i++){
			Gift[i] = new gift((int)(Math.random()*3),(int)(Math.random()*10 + 1),
					(int)(Math.random()*10 + 1),(int)(Math.random()*10 + 1),(int)(Math.random()*10 + 1));
		}
		for(i=0; i<k1; i++){
			for(j=0; j<k1-1; j++){
				if(Gift[j].price > Gift[j+1].price){
					gift temp;
					temp = Gift[j];
					Gift[j]=Gift[j+1];
					Gift[j+1]=temp;
					}
			}
		}
		
		/**
			*...HERE WE CALL Cal_happy CLASS WHICH CALCULATE HAPPINESS OF COUPLES...
		*/
		Cal_happy C_h = new Cal_happy(pairs,Gift,k1);
		}
	
}
