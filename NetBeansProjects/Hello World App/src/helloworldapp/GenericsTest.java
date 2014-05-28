/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class GenericsTest<String> {
  
  public String str;
  
  public GenericsTest(String stringval){
    str = stringval;
  }
  
  public String get_string(){
    return str;
  }
   
}
