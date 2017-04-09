/*
 *... simple girl abstract class
 */
public abstract class girls
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
		String t_g;
		/*
		*...Abstract function that has to be overrided by child class
		*/
		abstract double happiness(boys Boy,gift Gift[],int k);
}
