/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
public class RoadBike extends Bicycle {
  public int tirepressure = 0;
  
  public RoadBike(Bicycle bike,int InitTyrepressure){
    tirepressure = InitTyrepressure;
  }
  
  public Bicycle adjustTirePressure(RoadBike bike,int pressure){
    bike.tirepressure = pressure;
    return bike;
  }
  
  public void roadBikeStats(RoadBike bike){
    bike.read_statistics();
    System.out.println("RoadBike Tire Pressure: "+tirepressure);
  }
  
}
