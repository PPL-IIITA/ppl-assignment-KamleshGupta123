/**
	*...Pair class...
*/
public class Pair{
	boys Boy;
	girls Girl;
	int comp;
	long happ;
	gift[] Gift = new gift[100];
	int no_gift;
	public Pair(boys n , girls m){
		Boy = n;
		Girl = m;
		comp = (Boy.budget - Girl.exp)+Math.abs(Boy.attr-Girl.g_attr)+Math.abs(Boy.int_l - Girl.g_int_l);
		happ=0;
		no_gift=0;
	}
}
