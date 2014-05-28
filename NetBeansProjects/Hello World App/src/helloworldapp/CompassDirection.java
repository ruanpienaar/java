/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public enum CompassDirection {
  NORTH     (0),
  NORTH_EAST(45),
  EAST      (90),
  SOUTH_EAST(135),
  SOUTH     (180),
  SOUTH_WEST(225),
  WEST      (270),
  NORTH_WEST(315);
  
  public int directionDegrees;
  
  CompassDirection(int degrees){
    this.directionDegrees = degrees;
  }
  
}
