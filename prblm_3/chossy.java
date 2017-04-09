/*
*... chossy class
*/
public class chossy extends girls{
	/*
	*... parameter @boy of class boys
	*... parameter @Gift of gift class
	*... parameter @k for count of couple pair
	*/
	double happiness(boys Boy,gift Gift[],int k){
		double h;
		int i=0;
		int sum=0,val=0;
		while( i < k){
			sum = sum +Gift[i].price;
			if((Gift[i].type)==1){
				val = val + 2*Gift[i].value;	
			}	
			else{
				val = val +Gift[i].value;
			}
			i++;
		}
		h = Math.log(sum + val -this.exp);	
		return h;
	}
	}
