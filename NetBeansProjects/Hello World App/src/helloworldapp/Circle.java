/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
public class Circle extends point {
  public double radius;
  
  public void circle(double initRadius){
    radius = initRadius;
  }
  
  public void displayCircle(){
    System.out.println("Circle Radius: "+radius);
  }
  
  public double circlearea(double radius){
    this.radius = ( Math.PI * Math.pow(radius,2) );
    return this.radius;
  }
  
}
