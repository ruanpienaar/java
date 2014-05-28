/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworldapp;

/**
 *
 * @author rp
 */
public class Common {
  String thing;
    
    // pout ---------------------------------
    void pout(byte byteval){
      this.pout(Byte.toString(byteval) );
    }
    
    void pout(short ShortVal){
      this.pout(Short.toString(ShortVal));
    }
    
    void pout(int intval){
      this.pout(Integer.toString(intval));
    }
    
    void pout(long longval){
      this.pout(Long.toString(longval));
    }
    
    void pout(float foatval){
      this.pout(Float.toString(foatval));
    }
    
    void pout(double doubleval){
      this.pout(Double.toString(doubleval));
    }
    
    void pout(char charval){
      this.pout(Character.toString(charval));
    }
    
    void pout(boolean boolval){
      this.pout(Boolean.toString(boolval));
    }
    
    void pout(String thing){
        System.out.println(thing);
    }
    
    void pout(Object object){
      this.pout(object.toString());
    }
    
    // --------------------------------------
    
    void aout(String[] arr){
      for (int i = 0; i < arr.length; i++) {
        this.pout(arr[i]);
      }
    }
    
    public boolean EvenNum(int numeval){
      if((numeval/2)==0){
        return true;
      }else{
        return false;
      }
    }
    
    public int randomNum(int min, int max){
      double rndnum = Math.random(); // 0.1
      
      int result = (int) Math.round(rndnum * max); // 0.1 * 10 = 1
      int finalResult;
      if(result == 0){ //rare case
        finalResult = result + min;
      }else if(result < min){
        finalResult = min;
      }else{
        finalResult = result;
      }
      return finalResult;
    }
    
}
