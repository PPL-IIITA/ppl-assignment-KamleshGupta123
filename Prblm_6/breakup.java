import java.util.*;
import java.io.*;
import java.sql.Timestamp;
/*
*... Breakup class
*/
public class breakup{
	/*
	*... parameter @pairs array of type class Pair
	*... parameter @b array of type class boys
	*... parameter @g array of type class girls 
	*... parameter @k1 for count of pairs
	*... parameter @a for total values of boys
	*/ 
	public breakup(Pair pairs[],boys b[],girls g[],int k1,int num,int a)throws IOException{
		int i,j,z2=0;
		/*
		*... gb array of class type girls		
		*... bb array of class type boys
		*/
		girls gb[]=new girls[20];
		boys bb[] = new boys[20];
		for(i=0;i<k1;i++){
			if(pairs[i].happ < num){
			bb[z2]=new boys(pairs[i].Boy.name,pairs[i].Boy.attr,pairs[i].Boy.m_attr,pairs[i].Boy.budget,pairs[i].Boy.int_l);	
			gb[z2] = new girls(pairs[i].Girl.name,pairs[i].Girl.g_int_l,pairs[i].Girl.exp,pairs[i].Girl.g_attr);
			gb[z2].status= "Single";
			bb[z2].status = "Single";
			gb[z2].x = pairs[i].Boy.name;
			z2++;
		}
		}
		k1= k1-z2;
		for(i=0;i<a;i++){
			for(j=0;j<z2;j++){
				if(b[i].status=="Single" &&gb[j].status=="Single"&&gb[j].x!=b[i].name&& b[i].budget>=gb[j].exp && b[i].m_attr <= gb[j].g_attr){
					gb[j].bf =b[i].name;
					b[i].gf =gb[j].name;
					b[i].status ="Committed";
					gb[j].status ="Committed"; 
					/**
						*...HERE WE MAKE COUPLES PAIR...
					*/
					pairs[k1]=new Pair(b[i],gb[j]);
					k1++;
				}
			}
		}
		try{
			/*
			*...  here we add ouput into in file
			*/
		PrintWriter w = new PrintWriter ("output.text","UTF-8");
		w.println("After t times breakup New Couples are\n");
		for(i=0;i<k1;i++){
				
				Date date = new Date();
				date = new Date();
				w.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
				w.println("New couples :"+ " "+pairs[i].Boy.name+"<------>"+pairs[i].Girl.name+" "+"Happiness is :"+" "+pairs[i].happ);
			}
		w.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
}
}
