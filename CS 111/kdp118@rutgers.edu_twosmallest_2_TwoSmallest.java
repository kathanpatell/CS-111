

public class TwoSmallest {
	 public static void main(String args[]) {
		  
		  System.out.print("Enter your terminator: ");
		  double terminator = IO.readDouble();
		  System.out.print("Enter your next number: ");
		  double number1 = IO.readDouble();
		  System.out.print("Enter your next number: ");
		  double number2 = IO.readDouble();
		  double min1;
		  double min2;
		  
		  
		  if (number1 < number2) {
		   min1 = number1;
		   min2 = number2;
		   
		  } else {
		   min1 = number2;
		   min2 = number1;
		  }
		  
		  while (true) {
		   System.out.print("Enter your next number: ");
		   double number3 = IO.readDouble();
		   if (number3 == terminator) {
		    break;
		   }
		   
		   if (number3 < min1) {
		    min1 = number3;
		   } else if (number3 < min2) {
		    min2 = number3;
		   }
		  }
		  
		  IO.outputDoubleAnswer(min1);
		  IO.outputDoubleAnswer(min2);
		 }
		}


