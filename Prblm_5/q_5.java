import java.util.*;
import java.io.*;
/**
	*...MAIN CLASS...
*/
public class q_5{
	public static void main( String args[])throws IOException{
		/*
		*... b array of type class boys
		*/
		int a=0,z=0;
		boys b[]= new boys[20];
		String line = "";
		String c_split= ",";
		BufferedReader br = null;
		try {
			br = new BufferedReader( new FileReader("boys.csv"));
			while((line = br.readLine() )!= null){
				String[] Boy = line.split(c_split);
				b[a]= new boys(Boy[0], Integer.parseInt(Boy[1]),Integer.parseInt(Boy[2]),Integer.parseInt(Boy[3]),Integer.parseInt(Boy[4]));
				b[a].status ="Single";
				a=a+1;
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		/*
		*... g array of type class girls
		*/
		girls g[] = new girls[15];
		try {
			br = new BufferedReader( new FileReader("girls.csv"));
			while((line = br.readLine() )!= null){
				String[] Girl = line .split(c_split);
				g[z]= new girls(Girl[0], Integer.parseInt(Girl[1]),Integer.parseInt(Girl[2]),Integer.parseInt(Girl[3]));
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
		/*
		*... pairs array of type class Pair
		*/
		Pair pairs[] = new Pair[20];	
		int i,j,k1=0,k;
		for(k=0;k<z;k++){
			/*
			*... here we make couples pair
			*/
			if(k%2==0){
			for(i=0;i<a;i++){
				if(b[i].status=="Single" &&g[k].status=="Single"&& b[i].budget>=g[k].exp ){
					g[k].bf =b[i].name;
					b[i].gf =g[k].name;
					b[i].status ="Committed";
					g[k].status ="Committed"; 
					/**
						*...HERE WE MAKE COUPLES PAIR...
					*/
					pairs[k1]=new Pair(b[i],g[k]);
					k1++;
				}
			}
		}
		else{
			for(j=0;j<z;j++){
					if(b[k].status=="Single" &&g[j].status=="Single"&&  b[k].m_attr <= g[j].g_attr){
					g[j].bf =b[k].name;
					b[k].gf =g[j].name;
					b[k].status ="Committed";
					g[j].status ="Committed"; 
					/**
						*...HERE WE MAKE COUPLES PAIR...
					*/
					pairs[k1]=new Pair(b[k],g[j]);
					k1++;
				}
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
		/*
			*...sort gift with their price value
		*/
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
		for(i=0; i<k1; i++){
			/**
				*...HERE WE PROVIDE GIFTS TO GIRLS WITH THEIR REQUIREMENT...
			*/
			if(pairs[i].Boy.t_b==0){
				int l=0;
				while(pairs[i].Boy.spent <= pairs[i].Girl.exp){
					if(pairs[i].Boy.spent + Gift[l].price > pairs[i].Boy.budget)
						break;
					pairs[i].Gift[l]= Gift[l];
					pairs[i].Boy.spent +=Gift[l].price;
					l++;
					pairs[i].no_gift = l;
				}
			}
			else if(pairs[i].Boy.t_b==1){
				int l=0;
				while(pairs[i].Boy.spent <= pairs[i].Girl.exp){
					pairs[i].Gift[l]= Gift[l];
					pairs[i].Boy.spent +=Gift[l].price;
					l++;
					pairs[i].no_gift = l;
				}
			}
			else{
				int l=0;
				while(pairs[i].Boy.spent <= pairs[i].Girl.exp){
					if(pairs[i].Boy.spent + Gift[l].price > pairs[i].Boy.budget)
						break;
					pairs[i].Gift[l]= Gift[l];
					pairs[i].Boy.spent +=Gift[l].price;
					l++;
					pairs[i].no_gift = l;
				}
				int p=l;
				while(l<=Gift.length){
					if(pairs[i].Boy.spent +Gift[l].price > pairs[i].Boy.budget)
						break;
					if(Gift[l].t==1){
						pairs[i].Gift[p]= Gift[l];
						pairs[i].no_gift = p+1;
						pairs[i].Boy.spent +=Gift[l].price;
						break;
					}
					l++;
				}
			}
		} 
		/**
			*...HERE WE TAKE Z1 AS INPUT TO PRINT BEST Z1 COPULES HAPPINESS AND COMPATIBILTY...
		*/
		System.out.println("Enter the value for best k Couples ");
		int z1;
		Scanner scan=new Scanner(System.in);
		z1=scan.nextInt();
		if(z1 > k1)
			z1=k1;
			/*
			*...HERE WE CALL Cal_happy CLASS WHICH CALCULATE HAPPINESS OF COUPLES...
			*/
		Cal_happy C_h = new Cal_happy(pairs,k1,z1);
		}
	
}
