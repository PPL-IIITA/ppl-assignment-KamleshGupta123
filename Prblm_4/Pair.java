/*
*...simple  pair class
*/
public class Pair{
	/*
	*... variable comp is used for couple compatibilty
	*... variable happ is used for couple happiness
	*... variable no_gift used for number of gifts
	*... Boy use all attribute of boys class
	*... Girl use all attribute of girl class
	*/ 
	boys Boy;
	girls Girl;
	int comp;
	long happ;
	gift[] Gift = new gift[100];
	int no_gift;
	/*
	 *... parameter @n is object of class type boys
	 *... parameter @m is object of class type girls
	*/
	public Pair(boys n , girls m){
		Boy = n;
		Girl = m;
		comp = (Boy.budget - Girl.exp)+Math.abs(Boy.attr-Girl.g_attr)+Math.abs(Boy.int_l - Girl.g_int_l);
		happ=0;
		no_gift=0;
	}
}
