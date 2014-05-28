/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class Card3 {
    private final Rank rank;
    private final Suit suit;
    private boolean indeck=true;
    private boolean lock=false;

    public Card3(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

  @Override
    public String toString() {
        String suite_padding = "";
        int remainder =  8-(suit.toString().length());
        for(int a = 0; a < remainder; a++ ){
          suite_padding += " ";
        }
        return rank + "\tof\t" + suit+suite_padding+" indeck:\t"+indeck+"\tlocked:\t"+lock;
    }
  
    public boolean locateCard(){
      return this.indeck;
    }
    
    public boolean inDeck(){
      return this.indeck;
    }
    
    public void lockCard(){
      this.lock=true;
    }
    
    public void unlockCard(){
      this.lock=false;
    }
    
    public void removeFromDeck(){
      this.indeck = false;
    }
    
    public void placeBackInDeck(){
      this.indeck = true;
    }
  
}