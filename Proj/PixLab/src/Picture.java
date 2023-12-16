import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void keepOnlyBlue() {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	        pixelObj.setRed(0);
	      }
	    }
  }
  public void negate() {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(255-pixelObj.getGreen());
	        pixelObj.setRed(255-pixelObj.getRed());
	        pixelObj.setBlue(255-pixelObj.getBlue());
	      }
	    }
  }
  public void grayscale() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	final int avg = (int)pixelObj.getAverage();
	        pixelObj.setGreen(avg);
	        pixelObj.setBlue(avg);
	        pixelObj.setRed(avg);
	        
	      }
	    }
  }
public void fixUnderWater() {
	  
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	    	final int avg = (int)pixelObj.getAverage();
	        pixelObj.setBlue(pixelObj.getBlue()-avg);
	        pixelObj.setBlue((pixelObj.getBlue() / 4)*(pixelObj.getBlue() / 4));
	        
	      }
	    }
  }

public void removeGuy() {
	Pixel[][] pixels = this.getPixels2D();
	for(int row = 284; row < 372; row++) {
		for(int col = 470; col < 488; col++) {
			pixels[row][col].setColor(pixels[row][col-100].getColor());
		}
	}
}

public void combine(Picture pic) {
	Pixel[][] pixels = this.getPixels2D();
	Pixel[][] picPixels = pic.getPixels2D();
	for (int r = 0; r < pixels.length; r++){
      for (int c = 0; c < pixels[r].length; c++){
    	  pixels[r][c].setRed((picPixels[r][c].getRed()+pixels[r][c].getRed())/2);
    	  pixels[r][c].setGreen((picPixels[r][c].getGreen()+pixels[r][c].getGreen())/2);
    	  pixels[r][c].setBlue((picPixels[r][c].getBlue()+pixels[r][c].getBlue())/2);
      }
	}
}
 

public void chromakey(Picture pic) {
	Pixel[][] pixels = this.getPixels2D();
	Pixel[][] picPixels = pic.getPixels2D();
	for(int r = 0; r < pixels.length; r++) {
		for(int c = 0; c < pixels[r].length; c++) {
			if( 0.66 * pixels[r][c].getBlue() >  pixels[r][c].getGreen() &&  0.66 * pixels[r][c].getBlue() > pixels[r][c].getRed())  {
			pixels[r][c].setColor(picPixels[r][c].getColor());  
			}
		}
	}
}
public void encode(Picture pic) {
	Pixel[][] pixels = this.getPixels2D();
	Pixel[][] picPixels = pic.getPixels2D();
	for(int r = 0; r < pixels.length; r++) {
		for(int c = 0; c < pixels[r].length; c++) {
			if(pixels[r][c].getBlue() % 2 == 0 && pixels[r][c].getBlue() < 255) {
				pixels[r][c].setBlue(pixels[r][c].getBlue()+1);
			}
			if(picPixels[r][c].getBlue() == 0) {
				pixels[r][c].setBlue(pixels[r][c].getBlue()-1);
			}
		}
	}
	
		
	
}
public void decode() {

	Pixel[][] pixels = this.getPixels2D();

	for(int r = 0; r < pixels.length; r++) {
		for(int c = 0; c < pixels[r].length; c++) {
			if(pixels[r][c].getBlue()  %  2 == 0) {
				pixels[r][c].setBlue(0);
				pixels[r][c].setGreen(0);
				pixels[r][c].setRed(0);
			} else {
				pixels[r][c].setBlue(255);
				pixels[r][c].setGreen(255);
				pixels[r][c].setRed(255);
			}
		
		}
	}
		
	
}
public void colorDistort() {
	Pixel[][] pixels = this.getPixels2D();
	for(int r = 0; r < pixels.length; r++) {
		for(int c = 0; c < pixels[r].length; c++) {
			if(pixels[r][c].getBlue()  %  2 == 0) {
				pixels[r][c].setBlue((int)(Math.random()*254)+1);
				pixels[r][c].setGreen((int)(Math.random()*254)+1);
				pixels[r][c].setRed((int)(Math.random()*254)+1);
			} 
		
		}
	}
		
}
public void blur() {
	double avgBlue = 0;
	double avgGreen = 0;
	double avgRed = 0;
	Pixel[][] pixels = this.getPixels2D();
	Pixel[][] newPixels = new Pixel[pixels.length][pixels[0].length];
	for(int r = 1; r < pixels.length-1; r++) {
		for(int c = 1; c < pixels[r].length-1; c++) {
			avgRed = (pixels[r][c].getRed() + pixels[r][c-1].getRed()+ pixels[r][c+1].getRed()+ pixels[r+1][c].getRed() + pixels[r-1][c-1].getRed()+pixels[r+1][c+1].getRed()+pixels[r-1][c+1].getRed()+pixels[r+1][c-1].getRed())/8.0;
			avgGreen = (pixels[r][c].getGreen() + pixels[r][c-1].getGreen()+ pixels[r][c+1].getGreen()+ pixels[r+1][c].getGreen() + pixels[r-1][c-1].getGreen()+pixels[r+1][c+1].getGreen()+pixels[r-1][c+1].getGreen()+pixels[r+1][c-1].getGreen())/8.0;
			avgBlue = (pixels[r][c].getBlue() + pixels[r][c-1].getBlue()+ pixels[r][c+1].getBlue()+ pixels[r+1][c].getBlue()+ pixels[r-1][c-1].getBlue()+pixels[r+1][c+1].getBlue()+pixels[r-1][c+1].getBlue()+pixels[r+1][c-1].getBlue())/8.0;
			pixels[r][c].setRed((int)avgRed);
			pixels[r][c].setGreen((int)avgGreen);
			pixels[r][c].setBlue((int)avgBlue);
			pixels[r][c+1].setColor(pixels[r][c].getColor());	
			pixels[r][c-1].setColor(pixels[r][c].getColor());
			pixels[r+1][c+1].setColor(pixels[r][c].getColor());
			pixels[r+1][c-1].setColor(pixels[r][c].getColor());
			pixels[r+1][c].setColor(pixels[r][c].getColor());
			pixels[r-1][c].setColor(pixels[r][c].getColor());
			pixels[r-1][c-1].setColor(pixels[r][c].getColor());
			pixels[r-1][c+1].setColor(pixels[r][c].getColor());
			} 
		
		}
	}
	

	


	
		
		
		

		


  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
