import java.util.*;
import java.io.*;
import java.sql.Timestamp;
/**
	*...simple boy class...
*/
class boys
{
	String name ;
	int int_l;
	int budget;
	int attr;
	int m_attr;
	String status;
	String gf;
	boolean eligibility( int exp, int g_attr){
		if(this.budget >= exp && this.m_attr <= g_attr){
			return true;
		}
		else{
			return false;
		}
	}
}
/**
	*...simple girl class...
*/
class girls
{
	String name ;
	int g_int_l;
	int exp;
	int g_attr;
	String status;
	String bf;
	boolean eligibility( int budget){
		if (this.exp<= budget ){
			return true;
		}
		else{
			return false;
		}
	}
}
/**
	*...Main class...*
*/
public class q_1{
	public static void main( String args[])throws IOException{
		int a=0,z=0;
		boys b[]= new boys[20];
		girls g[] = new girls[15];
		String line = "";
		String c_split= ",";
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader("girls.csv"));
			while((line = br.readLine() )!= null){
				String[] Girl = line .split(c_split);
				g[z]= new girls();
				g[z].name = Girl[0];
				g[z].g_int_l = Integer.parseInt(Girl[1]);
				g[z].g_attr = Integer.parseInt(Girl[2]);
				g[z].exp = Integer.parseInt(Girl[3]);
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
		try {
			br = new BufferedReader( new FileReader("boys.csv"));
			while((line = br.readLine() )!= null){
				String[] Boy = line.split(c_split);
				b[a]= new boys();
				b[a].name = Boy[0];
				b[a].int_l = Integer.parseInt(Boy[1]);
				b[a].budget = Integer.parseInt(Boy[2]);
				b[a].attr = Integer.parseInt(Boy[3]);
				b[a].m_attr = Integer.parseInt(Boy[4]);
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
		try{
			PrintWriter w = new PrintWriter ("output.csv","UTF-8");
			int i,j;
			for(i=0;i<a;i++){
				for(j=0;j<z;j++){
					Date date = new Date();
					if(b[i].eligibility(g[j].exp, g[j].g_attr) && g[j].eligibility(b[i].budget) && g[j].status.equals("Single") && b[i].status.equals("Single")){
						b[i].gf =g[j].name;
						g[j].bf =b[i].name;
						b[i].status ="Committed";
						g[j].status ="Committed"; 
						date = new Date();
						w.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
						w.println(b[i].name +"<-------->"+b[i].gf+" "+b[i].status);
						break;
					}
				}
			}
			w.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}

	}
}
