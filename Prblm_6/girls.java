/*
 *... simple girl class
 */
public class girls
        {
		/*
		 *... variable @name for girl name 
		 *... variable @g_int_l for inteligence
		 *... variable @g_attr for attraction
		 *... variable @budget for budget
		 *... variable @exp for expenses
		 *... variable @status for showing his status
		 *... variable @bf for his boyfriend
		*/
                String name ;
                int g_int_l;
                int exp;
                int g_attr;
                String status;
		String bf;
		int t_g;
		String x;
		/*
		 *... parameter @n for name ,@g_a for attraction ,@e forexpenses and @g_i for intelligence level
		*/
		public girls(String n,int g_i,int e,int g_a){
			name=n;
			exp=e;
			g_int_l=g_i;
			g_attr=g_a;
			status= "Single";
			bf="";
			x =n;
			t_g=(int )(Math.random()*3);
			}
}
