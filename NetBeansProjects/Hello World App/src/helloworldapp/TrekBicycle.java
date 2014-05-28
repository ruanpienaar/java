/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
class TrekBicycle extends Bicycle implements bicycleInterface {
    
  // when i implement the interface, then my class should adhere to the interface
  public void changeCadency(int newCadence){
      System.out.println(newCadence);
  }
  
  public void washbike(){
    
  }
  
}
