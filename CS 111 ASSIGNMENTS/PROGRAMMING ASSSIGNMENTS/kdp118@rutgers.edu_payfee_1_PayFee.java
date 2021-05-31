

public class PayFee {


 public static void main(String[] args) {
 
  
  double payment = IO.readDouble();
  double finalFee;
  
  if (payment <= 500) {
   finalFee = 10;
  }
  
  else if (payment < 5000) {
   if ((payment * .01) > 20) {
    finalFee = payment * .01;
   } else {
    finalFee = 20;
   }
  }
  
  else if (payment < 10000) {
   if ((payment * .02) > (120)) {
    finalFee = payment * .02;
   } else {
    finalFee = 120;
   }
  }
  
  else {
   finalFee = (10000 * .02);
   payment -= 10000;
   if (payment <= 5000) {
    finalFee += payment * 0.03;
   } else {
    finalFee+= 5000 * 0.03;
    payment -= 5000;
    finalFee += payment * 0.04;
   }
  }
  
  IO.outputDoubleAnswer(finalFee);
  
 }


					
					

			}
		
			

