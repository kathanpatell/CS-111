

public class MatrixOps {
 public static double[][] multiply(double[][] A, double[][] B) {
  
  if (A[0].length != B.length) {
   return null;
  }
  else {
   double[][] product = new double[A.length][B[0].length];
   
   for (int rows = 0; rows < product.length; rows++) {
    
    for (int columns = 0; columns < product[0].length; columns++) {
     
     double indexValue = 0;
     for (int i = 0; i < A[0].length; i++) { //calculates the value of the index
      indexValue += A[rows][i] * B[i][columns];
     
     }
    
     product[rows][columns] = indexValue;
     
    }
   }
   
   
   
   return product;
  }
 }
}
