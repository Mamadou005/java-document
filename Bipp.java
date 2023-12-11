import jaa.awt.Point;
public class Bip {
	
  public final static int N=5;
      public static void main(String[] args)
      { 
        Point pZero = new Point(x=0 , y=0);
        Point pt = new Point(x=0 , y=0);
        double distance =0;
        do{
 	          pt.translate(dx=1, dy=1);
 	          distance = pZero.distance(pt.x,pt.y);
 	          System.out.println("X : " +pt.x);
 	          System.out.println("Y : " +pt.y);
 	          System.out.println("distance : " +distance);
 	          System.out.println("--------------------------------");
 	
        }while (distance < N);
  //Mamadou Sow 
    }
 }
