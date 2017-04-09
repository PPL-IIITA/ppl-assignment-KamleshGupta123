/**
   *...simple boys class
 */
public abstract class boys
        {
		/*
		 *... variable @name for boys name 
		 *... variable @int_l for inteligence
		 *... variable @attr for attraction
		 *... variable @budget for budget
		 *... variable @spent for spent
		 *... variable @status for showing his status
		 *... variable @gf for his girlfriend
		*/
                String name ;
                int int_l;
                int budget;
                int attr;
                int m_attr;
                String status;
     	        int spent;
		String gf;
		String t_b;		
		/*
		*...Abstract function that has to be overrided by child class
		*/
		abstract double happiness(girls gl, double sum, double hap);
}
