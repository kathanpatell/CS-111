public class Compress {
 public static void main(String[] args) {
  System.out.println("r: " + compress("r"));
  System.out.println("zzzzzzzz: " + compress("zzzzzzzz"));
  System.out.println("ab: " + compress("ab"));
 }
 public static String compress(String str) {
  char[] stringArray = str.toCharArray();
  String result = "";
  char currentChar = stringArray[0];
  int charCount = 0;
  for (int i = 0; i < stringArray.length; i++) {
   if (currentChar == stringArray[i]) {
    charCount++;
    // System.out.println(charCount);
   } else {
    // System.out.println(charCount + Character.toString(currentChar));
    if (charCount == 1) {
     result += Character.toString(currentChar);
    } else {
     result += charCount + Character.toString(currentChar);
    }
    currentChar = stringArray[i];
    charCount = 1;
   }
   if (i == stringArray.length - 1) { // for when the array is at the end
    if (charCount == 1) {
     result += Character.toString(currentChar);
    } else {
     result += charCount + Character.toString(currentChar);
    }
   }
  }
  return result;
 }
}