/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */

// 

public class Bicycle implements Cloneable  {
    int cadence = 0;
    int gear = 1;
    int speed = 0;
    int id;
    static int numberOfBikes;
    
    static final int minimumAllowedWeightKgs = 1;
    static final int maximumAllowedWeightKgs = 200;
    
  @Override
    public Bicycle clone() throws CloneNotSupportedException {
      return (Bicycle)super.clone();
    }
    
    // constructor ---------------------------------------------------------------------------
    public Bicycle(){
      id = numberOfBikes++;
    }
    
    public Bicycle(int initSpeed,int initGear,int initCadence){
      cadence = initCadence;
      gear = initGear;
      speed = initSpeed;
      numberOfBikes++;
      id = numberOfBikes;
    }
    // ---------------------------------------------------------------------------------------
    public static int getBikeCount(){
      return numberOfBikes;
    }
    // ---------------------------------------------------------------------------------------
    
    void changeCadency(int newCadence){
        cadence = newCadence;
    }
    
    void changeGear(int newGear){
        gear = newGear;
    }
    
    void changeSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    void read_statistics(){
        this.read_speed();
        this.read_gear();
        this.read_cadence();
    }
    
    void read_speed(){
        System.out.println("Speed: "+this.speed);
    }
    void read_gear(){
        System.out.println("Gear: "+this.gear);
    }
    void read_cadence(){
        System.out.println("Cadence: "+this.cadence);
    }
    
}
