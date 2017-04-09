/*
*... gift class
*/
public class gift{
	/*
	*... variable @t used for which type of gift we used
	*... variable @price for price of gift
        *... variable @l_rating for their rating 
	*.. variable @l_diff for their difference
	*... variable @value for their value
	*... variable @u_val for utility value
	*... variable @uclass for their utility class
	*/
	int type;
	int price;
	int l_rating;
	int l_diff;
	int value;	
	int u_val;
	int uclass;
	/*
	*... parameter @t1 for type of gift
	*... parameter @p1 for price
	*... parameter @l_r1 for rating
	*... parameter @v1 for  value
	*... parameter @l_differnece fo their difference
	*/
	public gift(int t1,int p1,int l_r1,int v1,int l_difference){
		/**
			*...HERE WE ASSIGN VALUES TO THEIR ATTRIBUTES..
		*/
		type = t1;
		price = p1;
		value = v1;
		if(type==1){
			l_rating = 0;
			l_diff = 0;
			u_val = 0;
			uclass = 0;
		}
		else if(type==2){
			l_rating = l_r1;
			l_diff = l_difference;
			u_val = 0;
			uclass = 0;
		}
		else{
			l_rating =0;
			l_diff = 0;
			u_val = l_r1;
			uclass = l_difference;
		}
	}
}
