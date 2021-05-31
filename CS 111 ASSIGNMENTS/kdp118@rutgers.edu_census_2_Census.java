

	public class Census {
		  public static void main(String[]args){
		    System.out.println("Total number of apartments:");
		    int apr=IO.readInt();
		    int tc = 0;
		    int ts = 0;
		    int ta = 0;
		    double tx=apr;
		    while(apr>0){
		        System.out.println("children in apartment:" + apr);
		      int child=IO.readInt();
		      tc=child +tc;
		        System.out.println("senior in apartment:" + apr);
		        int senior=IO.readInt();
		         ts=senior+ts;
		         System.out.println("adult in apartment:" + apr);
		          int adult=IO.readInt();
		          ta=adult+ta;
		apr=apr-1;



		    }
		    double c=tc/tx;
		      double s=ts/tx;
		        double a=ta/tx;

		 IO.outputIntAnswer(tc);
		  IO.outputIntAnswer(ts);
		   IO.outputIntAnswer(ta);
		      IO.outputDoubleAnswer(c);
		        IO.outputDoubleAnswer(s);
		          IO.outputDoubleAnswer(a);


		  }


		}


