
public class Milestone2 {
 
	public static void main (String[] args) {
 // Instantiate a Picture object from file mypic.jpg
	Picture p = new Picture("C:\\Users\\Kathan\\Pictures\\mypic.png");
 // The object referenced by p will be manipulated by your methods.
 // Example on how to call the countRedPixels method
	int redPixels = countRedPixels(p);
 System.out.println("The number of red pixels is: " + redPixels);
 switchRedBlue(p);
 flipHorizontal(p);
 flipVertical(p);
 flipDiagonal(p);
 //System.out.println("The number of red pixels is: " + redPixels);
 p.write("C:\\Users\\Kathan\\Pictures\\mypic - Copy.png");
 
	}
	
	/*
 	* 1) Returns the number of red pixels in picture v
 	*/
	public static int countRedPixels(Picture v) {
 // WRITE YOUR CODE HERE
	 Pixel[] pixelArray = v.getPixels();
	 int redPixels = 0;
	 
	 for (int i = 0; i < pixelArray.length; i++) {
	  Pixel currentPixel = pixelArray[i];
	  if (currentPixel.getRed() == 255 && currentPixel.getBlue() == 0 && currentPixel.getGreen() == 0) {
	   redPixels++;
	  }
	 }
	 
	 return redPixels;
	 
	}
 
	/*
 	* 2) Change all the red pixels in an image to blue pixels and vice versa
 	*	Only pure red and pure blue
 	*/
	public static void switchRedBlue(Picture v) {
 // WRITE YOUR CODE HERE
	 
	 for (int x = 0; x < v.getWidth(); x++) {
	  
	  for (int y = 0; y < v.getHeight(); y++) {
	   Pixel currentPixel = v.getPixel(x, y);
	   
	   if (currentPixel.getRed() == 255 && currentPixel.getBlue() == 0 && currentPixel.getGreen() == 0) { //checks if its red
	    v.getPixel(x, y).updatePicture(v.getPixel(x, y).getAlpha(), 0, 0, 255);
	   } else if (currentPixel.getRed() == 0 && currentPixel.getBlue() == 255 && currentPixel.getGreen() == 0) { //checks if its blue
	    v.getPixel(x, y).updatePicture(v.getPixel(x, y).getAlpha(), 255, 0, 0);
	   }
	  }
	 }
	 
	 //System.out.println("Done!");
	}
	/*
 	* 3. Take the left half of an image and reflect it over an imaginary
 	*	vertical line going across the middle of the image.
 	*	IF pixels exist ON the midline, leave them there without reflecting
 	*/
	public static void flipHorizontal(Picture v) {
 // WRITE YOUR CODE HERE
	 int height = v.getHeight();
  int width = v.getWidth();
  for (int x = 0; x < width/2; x++) {
   for (int y = 0; y < height; y++) {
    
    
    v.getPixel(width - x - 1, y).setColor(v.getPixel(x, y).getColor()); // changes pixel at the end to the current pixel
   }
  }
	 
	}
 
	/*
 	* 4. Take the top half of an image and reflect it over an imaginary horizontal
 	*	line going through the image
 	*	IF pixels exist ON the midline, leave them there without reflecting
 	*/
	public static void flipVertical(Picture v) {
 // WRITE YOUR CODE HERE
  int height = v.getHeight();
  int width = v.getWidth();
  for (int x = 0; x < width; x++) {
   for (int y = 0; y < height / 2; y++) {
    
    v.getPixel(x, height - y - 1).setColor(v.getPixel(x, y).getColor()); // changes pixel at the end to the current pixel
   }
  }
  
 }
	/*
 	* 5. Take the upper half of an image and reflect it over an imaginary diagonal
 	*	line going from the upper left corner of the image to the lower right corner.
 	*	Upper right to lower left diagonal line
 	*	You may assume SQUARE images (height == width)
 	*	IF pixels exist ON the midline, leave them there without reflecting
 	*/
	public static void flipDiagonal(Picture v) {
 // WRITE YOUR CODE HERE
	 int height = v.getHeight();
	 int width = v.getWidth();
	 
	 for (int x = 0; x < width; x++) {
	  for (int y = 0; y < height - x; y++) {
	   
	   v.getPixel(width - x - 1, height - y - 1).setColor(v.getPixel(x, y).getColor());
	  }
	 }
	}
}

