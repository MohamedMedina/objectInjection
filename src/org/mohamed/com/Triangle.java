package org.mohamed.com;

public class Triangle {
 
	
	/*
	 * private int type;
	 * 
	 * public int getType() { return type; }
	 * 
	 * // public void setType(int type) { // this.type = type; // }
	 * 
	 *
	 * 
	 * System.out.println (getType()+"the traingle has been drawn"); }
	 */
	// here i will apply the concept of object injection
	private Point PointA;
	private Point PointB;
	private Point PointC;
	
	 public Point getPointA() {
		return PointA;
	}

	public void setPointA(Point pointA) {
		PointA = pointA;
	}

	public Point getPointB() {
		return PointB;
	}

	public void setPointB(Point pointB) {
		PointB = pointB;
	}

	public Point getPointC() {
		return PointC;
	}

	public void setPointC(Point pointC) {
		PointC = pointC;
	}

	public void draw() 
	 {
		 System.out.println("PointA = (" + getPointA().getX()+ "," + getPointA().getY()+" )");
		 System.out.println("PointB = (" + getPointB().getX()+ "," + getPointB().getY()+" )");
		 System.out.println("PointC = (" + getPointC().getX()+ "," + getPointC().getY()+" )");
	 }
}
