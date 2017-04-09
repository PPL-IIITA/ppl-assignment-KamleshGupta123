/*
*... normal class
*/
public class normal extends girls{
	/*
	*... parameter @boy of class boys
	*... parameter @Gift of gift class
	*... parameter @k for count of couple pair
	*/
	double happiness(boys Boy,gift Gift[],int k){
                double h;
                int i=0;
                int sum=0,val=0;
                while(i < k){
                        sum = sum +Gift[i].price;
                        val = val +Gift[i].value;
                        i++;
                }
                h = (sum + val -this.exp);
       		return h;
	 }
}
