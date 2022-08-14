package MethodOverLoadingExercise;

public class Point {
private double xCoordinate;
private double yCoordinate;
public double getxCoordinate() {
	return xCoordinate;
}
public void setxCoordinate(double xCoordinate) {
	this.xCoordinate = xCoordinate;
}
public double getyCoordinate() {
	return yCoordinate;
}
public void setyCoordinate(double yCoordinate) {
	this.yCoordinate = yCoordinate;
}

	public Point(double xCoordinate,double yCoordinate) {
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
		
	}
	
	public double  calculateDistance() {
		double temp=Math.pow(yCoordinate, 2)+Math.pow(xCoordinate, 2);
		
		double distance=Math.sqrt(temp);
		
		return distance;
	}
	public double  calculateDistance(Point point)
		{
		double temp=Math.pow(point.getxCoordinate()-xCoordinate,2)+Math.pow(point.getyCoordinate()-yCoordinate, 2);
			double distance=Math.sqrt(temp);
			return distance;
		}
	
	
}
