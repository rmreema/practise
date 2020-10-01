package test;

public class PointD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 15;
		int z = 30;
		PointD point = new PointD();
		Point2D point2d = new Point2D(5,10);
		double result = point2d.dist2D(point2d);
		point2d.printDistance(result);
		//System.out.println(result);
		
	}
	static class Point2D{
		int x, y;
		public Point2D(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		public double dist2D(Point2D p) {
			
			double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y -
					y), 2));
			
			return distance;

		}
		public void printDistance(double d) {
			System.out.println("2D distance = " + (int) Math.ceil(d));
			}

	}
	
	class Point3D extends Point2D{
		int x, y,z;
		public Point3D(int x, int y, int z) {
			super(x,y);
			this.z=z;
			
		}
		
		public double dist3D(Point3D p) {
			
			double distance = Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y -
					y), 2) + Math.pow((p.z - z), 2));
			
			return distance;

		}
		public void printDistance(double d) {
			System.out.println("3D distance = " + (int) Math.ceil(d));
			}

	}
	

}
