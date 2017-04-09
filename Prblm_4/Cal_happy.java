import java.util.*;
import java.io.*;
import java.sql.Timestamp;
public class Cal_happy{
	public Cal_happy(Pair[] pairs,int k1)throws IOException{
		int i;
		for(i=0; i<k1 ; i++){
			if(pairs[i].Boy.t_b == 1){
				pairs[i].happ =  pairs[i].Boy.budget - pairs[i].Boy.spent;
				if(pairs[i].Girl.t_g == 0){
					pairs[i].happ += (int)Math.log(pairs[i].Boy.spent);
					for(int l=0; l<pairs[i].no_gift; l++){
						if(pairs[i].Gift[l].t == 1)
							pairs[i].happ= pairs[i].Gift[l].price;
					}
				}
				else if(pairs[i].Girl.t_g == 1){
					pairs[i].happ += pairs[i].Boy.spent;
					for(int l=0; l<pairs[i].no_gift; l++)
						pairs[i].happ += pairs[i].Gift[l].value;
				}
				else{
					pairs[i].happ += (int)Math.exp(pairs[i].Boy.spent);
					pairs[i].happ = 2*pairs[i].happ;
				}
			}
			else if(pairs[i].Boy.t_b == 0){
				pairs[i].happ =  pairs[i].Boy.budget - pairs[i].Boy.spent;
				if(pairs[i].Girl.t_g == 0){
					pairs[i].happ += (int)Math.log(pairs[i].Boy.spent);
					for(int l=0; l<pairs[i].no_gift; l++){
						if(pairs[i].Gift[l].t == 1)
							pairs[i].happ= pairs[i].Gift[l].price;
					}
				}
				else if(pairs[i].Girl.t_g == 1){
					pairs[i].happ += pairs[i].Boy.spent;
					for(int l=0; l<pairs[i].no_gift; l++)
						pairs[i].happ += pairs[i].Gift[l].value;
				}
				else
					pairs[i].happ += (int)Math.exp(pairs[i].Boy.spent);
			}
			else{
				pairs[i].happ =  pairs[i].Boy.budget - pairs[i].Boy.spent;
				if(pairs[i].Girl.t_g == 0){
					pairs[i].happ += (int)Math.log(pairs[i].Boy.spent);
					for(int l=0; l<pairs[i].no_gift; l++){
						if(pairs[i].Gift[l].t == 1)
							pairs[i].happ= pairs[i].Gift[l].price;
					}
				}
				else if(pairs[i].Girl.t_g == 1){
					pairs[i].happ += pairs[i].Boy.spent;
					for(int l=0; l<pairs[i].no_gift; l++)
						pairs[i].happ += pairs[i].Gift[l].value;
				}
				else
					pairs[i].happ += (int)Math.exp(pairs[i].Boy.spent);
			}
		}
		/**
				*..HERE WE SORT PAIRS WITH THEIR HAPPINESS AND PRINT THEIR HAPPINESS...
		*/
		PairSort s_p1 = new PairSort(pairs,k1);
		try{
			/*
			*...  here we add ouput into in file
			*/
		PrintWriter w = new PrintWriter ("output1.text","UTF-8");
		w.println("Couples before breakup\n");
		for(i=0;i<k1;i++){
			Date date = new Date();
			date = new Date();
			w.print("Timestamp = " + new Timestamp(date.getTime())+ " : ");
			w.println(pairs[i].Boy.name+"<------>"+pairs[i].Girl.name+" "+"And Happness is:"+" " +pairs[i].happ);
			//System.out.println(pairs[i].Boy.name+"<------>"+pairs[i].Girl.name+" "+"And Happness is:"+" " +pairs[i].happ);
		}
		w.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
