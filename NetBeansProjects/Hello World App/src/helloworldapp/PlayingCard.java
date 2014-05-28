/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class PlayingCard {
  public String cardNumberString;
  public String cardSuiteString;
  
  public PlayingCard(){
    
  }
  
  public PlayingCard(String cNumStr, String cSuiteStr){
    cardNumberString = cNumStr;
    cardSuiteString = cSuiteStr;
  }
  
}
