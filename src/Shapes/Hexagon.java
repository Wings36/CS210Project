// designed by Dien Nguyen

package Shapes;

/*
		-----
	   /     \
	  /		  \
	  \		  /
	   \	 /
	    -----
	each side equal
*/

public class Hexagon implements Shapes{
	private int area;
	private int perimeter;
	private int sideLength;
	
	public Hexagon()
	{
		sideLength = 0;
	}
	
	public Hexagon(int sideLength)
	{
		this.sideLength = sideLength;
	}
	
	public int getArea() {
		return (int)((3 * Math.sqrt(3)/2) * Math.pow(sideLength, 2));
	}

	public void setLength(int length) throws IllegalArgumentException
	{
		if(length < 0)
			throw new IllegalArgumentException("The side length of hexagon cannot be negative.");
		
		sideLength = length;
	}
	
	public int getLength()
	{
		return sideLength;
	}
	
	public int getPerimeter() {
		return 6 * sideLength;
	}
	

}
