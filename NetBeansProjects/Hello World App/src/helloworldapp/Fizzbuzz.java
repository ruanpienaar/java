/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class Fizzbuzz {
  
  public boolean divisible(int Num, int Devide){
    if( (Num % Devide) == 0 ){
      return true;
    }else{
      return false;
    }
  }
  
}


//  for(int c = 1; c < 101; c++){
//      if( fref.divisible(c, 3) && fref.divisible(c, 5) ){
//        System.out.println("FizzBuzz");
//      } else if( fref.divisible(c, 3) ){
//        System.out.println("Fizz");
//      }else if( fref.divisible(c, 5) ){
//        System.out.println("Buzz");
//      }else{
//        System.out.println(c);
//      }
//    }
//  }