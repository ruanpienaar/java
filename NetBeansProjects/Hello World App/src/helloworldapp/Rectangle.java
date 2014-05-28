/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class Rectangle extends point implements Shape {
  public int width;
  public int height;
  
  public int area(){
    int area = (width*height);
    return area;
  }
  
  public boolean isLargerThan(Shape other){
    Rectangle rectangle = (Rectangle)other;
    return (this.area() < rectangle.area());
  }

}
