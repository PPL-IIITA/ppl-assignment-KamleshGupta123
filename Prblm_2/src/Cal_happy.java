/**
	*...This is Cal_happy class which calculate happiness...
*/
public class Cal_happy{
	public Cal_happy(Pair[] pairs,int k1,int z1){
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
		for(i=0;i<z1;i++){
			System.out.println("Happiness");
			System.out.println(pairs[i].happ);
		}
	}
}
