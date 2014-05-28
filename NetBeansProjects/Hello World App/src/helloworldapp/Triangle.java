/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
public class Triangle extends point {
  public point point1;
  public point point2;
  public point point3;
  
  public void Triangle(){
  }
  
  public Triangle(point p1, point p2, point p3){
    point1 = p1;
    point2 = p2;
    point3 = p3; 
  }
  
  public void displayTriangle(){
    System.out.println("Point1(X): "+point1.x);
    System.out.println("Point1(Y): "+point1.y);
    System.out.println("Point2(X): "+point2.x);
    System.out.println("Point2(Y): "+point2.y);
    System.out.println("Point3(X): "+point3.x);
    System.out.println("Point3(Y): "+point3.y);
  }
  
  public double triangleArea(int base, int perpendicularHeight){
    return (0.5 * base * perpendicularHeight);
  }
  
}
