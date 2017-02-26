/**
	*...GIFT CLASS...
*/
public class gift{
	int t;
	int price;
	int l_rating;
	int l_diff;
	int value;	
	int u_val;
	int uclass;
	public gift(int t1,int p1,int l_r1,int v1,int l_difference){
		/**
			*...HERE WE ASSIGN VALUES TO THEIR ATTRIBUTES..
		*/
		t = t1;
		price = p1;
		value = v1;
		if(t==1){
			l_rating = 0;
			l_diff = 0;
			u_val = 0;
			uclass = 0;
		}
		else if(t==2){
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
