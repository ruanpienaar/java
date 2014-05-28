/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class Box<T>{
 
  // T stands for "Type"
  private T t;
  
  public void add(T t){
    this.t = t;
  }
  
  public T get(){
    return t;
  }
    
}
