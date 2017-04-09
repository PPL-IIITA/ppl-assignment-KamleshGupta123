/**
   *...simple boys class
 */
public class boys
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
		int t_b;
		/*
		 *... parameter @m for name ,@a_t for attraction ,@m_a for minimum attraction required and @i_l for intelligence level
		*/
       		public boys(String m ,int a_t, int m_a,int bud,int i_l){
			name=m;
			int_l=i_l;
			budget= bud;
			attr =a_t;
			m_attr=m_a;
			status ="Single";
			gf="";
			spent=0;
			t_b = (int)(Math.random()*3);
	}
}
