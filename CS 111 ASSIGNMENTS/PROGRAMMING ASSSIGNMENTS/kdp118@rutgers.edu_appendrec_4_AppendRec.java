public class AppendRec { 
  public static void main(String[] args) {
	System.out.println(appendNTimes("cat", 0));
	System.out.println(appendNTimes("c", 0));
	System.out.println(appendNTimes("cat", 1));
	System.out.println(appendNTimes("cat", 4));
  }
  public static String appendNTimes (String original, int n) {
  	
   if (n == 0) {
	return original;
   }
  
   return original + appendNTimes(original, n - 1);
  }
}