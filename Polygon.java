package java_lab_04;

import java.awt.Color;


public abstract class Polygon implements Figure
{
	protected Color color;
	protected static int ID=0;
	protected int uniqueNumber;
	protected int area, perimiter;

	public abstract double countPerimiter();
	
	public abstract double countArea();
	

	public void setColor(Color c) 
	{
		color= c; 	
	}
		
	protected Polygon() 
	{
		ID++;
		uniqueNumber=ID; 
	}
	protected int getID() 
	{
		return ID;
	}
	public String toString() 
	{
		StringBuilder str=new StringBuilder();
		str.append("Number: "+uniqueNumber+" area "+countArea());
		str.append(" perimiter: " +countPerimiter());
		str.append(" Number of polygons: "+uniqueNumber);
		return str.toString();
	}
}
