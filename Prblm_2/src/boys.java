/**
	*...simple boys class...
*/
public class boys
        {
                String name ;
                int int_l;
                int budget;
                int attr;
                int m_attr;
                String status;
     	        int spent;
		String gf;
		int t_b;
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

