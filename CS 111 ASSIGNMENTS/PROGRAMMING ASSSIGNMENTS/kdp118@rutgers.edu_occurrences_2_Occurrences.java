
public class Occurrences {
	public static int occurrences(double target, double[][] array)
	  {
	  	int sum = 0;
	  
	   for (int rows = 0; rows < array.length; rows++ ) {
		
		for (int columns = 0; columns < array[0].length; columns++) {
	 	
	 	if (target == array[rows][columns]) {
	  	sum++;
	 	}
		}
	   }
	  
	   return sum;
	  }
	

}
