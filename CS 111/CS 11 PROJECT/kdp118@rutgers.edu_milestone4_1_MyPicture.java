
public class MyPicture {

    /*
     * Fields or instance variables
     */
    private Picture picture; // basis that provides the extension of class Picture
    private String filename; // the name of the image file
    private int width;       // the image width
    private int length;      // the image length
    private String description; // the image description

    /* 
     * Constructor. 
     * Takes as a parameter the name of the file to load and a description of the picture.
     * The width and height of an image are available in the Picture class.
     */
    public MyPicture(String filename, String description) {
    	this.description = description;
    	picture = new Picture(filename);
    	length = picture.getHeight();
    	width = picture.getWidth();
    	this.filename = picture.getFileName();
    }

    /*
     * Returns the string representation for a MyPicture object.
     * The string's format should match the following EXACTLY:
     *       <imagename>.<extension> <width> x <length> <description>
     * Replace <xxx> with the respective data about this image
     */
    public String toString() {
    	return filename + "." + picture.getExtension() + " " + width + " x " + length + " " + description;
    }

    /* 
     * Returns true of the parameter MyPicture object is equal 
     * to the current instance, false otherwise. MyPicture objects 
     * are considered equal if and only if their filenames are the 
     * same AND their descriptions are the same.
     */
    public boolean equals(MyPicture p) {
	// WRITE YOUR CODE HERE
    	if (p.filename.equals(filename) && p.description == description) {
    		return true;
    	} else {
    		return false;
    	}
    }

    /* 
     * Returns a new Picture object representing the 'negative'
     * image of this MyPicture object. The negative of a pixel
     * is defined by taking each pixel's red, blue, and green value and
     * subtracting that value from 255.
     */
    public Picture negative() {
	// WRITE YOUR CODE HERE
    	Picture negative = new Picture(picture);
    	for (int x = 0; x < width; x++) {
    		for (int y = 0; y < length; y++) {
    			Pixel p = picture.getPixel(x, y);
    			int red = 255 - p.getRed();
    			int green = 255 - p.getGreen();
    			int blue = 255 - p.getBlue();
    			int alpha = p.getAlpha();
    			
    			negative.getPixel(x,y).updatePicture(alpha, red, green, blue);
    		}
    	}
    	
    	return negative;
    }

    /*
     * Returns the redness score of this image. 
     * The redness score is defined by the total number of pixels that have
     * a red value that is greater than both the blue and green
     * pixels divided by the total number of pixels
     */
    public double redness() {
	// WRITE YOUR CODE HERE
    	double redPixels = 0;
    	Pixel[] pixels = picture.getPixels();
    	
    	for (int i = 0; i < pixels.length; i++) {
    		
    		Pixel thisPixel = pixels[i];
    		if (thisPixel.getGreen() < thisPixel.getRed() && thisPixel.getBlue() < thisPixel.getRed()) {
    			redPixels++;
    		}
    	}
    	
    	return redPixels / (width * length);
    	
    }

    /* 
     * Convert flipHorizontal from Part 1 to an instance method
     */
    public void flipHorizontal () {
	// WRITE YOUR CODE HERE
   

		for (int x = 0; x < width/2; x++) {

			for (int y = 0; y < length; y++) {
				
				
				picture.getPixel(width - x - 1, y).setColor(picture.getPixel(x, y).getColor()); // changes pixel at the end to the current pixel

			}

		}
    }

    /* 
     * Convert flipVertical from Part 1 to an instance method
     */
    public void flipVertical () {
	// WRITE YOUR CODE HERE
		for (int x = 0; x < width; x++) {

			for (int y = 0; y < length / 2; y++) {
				
				picture.getPixel(x, length - y - 1).setColor(picture.getPixel(x, y).getColor()); // changes pixel at the end to the current pixel

			}

		}
    }
}