/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class CompassUnit {
  CompassDirection compasDirection = CompassDirection.NORTH;
  
  public CompassUnit(){
    
  }
  
  public void ShowCompasDirection(){
    System.out.println("Compass direction : ");
    switch(compasDirection){
      case NORTH:
        System.out.println("North");
        break;
      case SOUTH:
        System.out.println("South");
        break;
      case WEST:
        System.out.println("West");
        break;
      case EAST:
        System.out.println("East");
        break;
      case NORTH_EAST:
        System.out.println("North East");
        break;
      case NORTH_WEST:
        System.out.println("NorthWest");
        break;
      case SOUTH_EAST:
        System.out.println("South East");
        break;
      case SOUTH_WEST:
        System.out.println("South West");
        break;
    }
  }
  
  public void changeDirection(CompassDirection cdirection){
    compasDirection = cdirection;
  }
  
  public void changeDirection(int degrees){
    if(degrees >= 0 && degrees <= 360){
      // complete this
      // have to find a way of deciding what degrees is closer to the fixed direction 
    }else{
      System.out.println("Invliad Degrees! : "+degrees);
    }
  }
  
}
