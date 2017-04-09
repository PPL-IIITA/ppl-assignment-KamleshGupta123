/*
*... simple pairsort class
*/
public class PairSort{
	/*
	*...parameter @k1 is for count of total couple pair
	*...paramter @pairs is used as array object of class type Pair
	*/
	public PairSort(Pair [] pairs,int k1){
		/*
		*... Here we sort the couples pair
		*/
		for(int i=0;i<k1;i++){
			for(int j=0;j<k1-1;j++){
				/**
					*...sort with compatibility...
				*/
				if(pairs[j].comp < pairs[j+1].comp){
					Pair max;
					max= pairs[j];
					pairs[j] = pairs[j+1];
					pairs[j+1] = max;
				}
				/**	
					*...sort with happness...
				*/
				if(pairs[j].happ < pairs[j+1].happ){
					Pair max;
					max= pairs[j];
					pairs[j] = pairs[j+1];
					pairs[j+1] = max;
				}
			}
		}
	}	

}

