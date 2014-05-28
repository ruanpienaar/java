package helloworldapp;

public class Deck3 {  
    private static Card3[] cards = new Card3[52];
    
    public Deck3(){
      int i = 0;
      for (Suit suit : Suit.values()) {
        for (Rank rank : Rank.values()) {
          cards[i++] = new Card3(rank, suit);
        }
      }
    }
    
    public void shuffleDeck(Common cc){
      Card3[] tempdeck = new Card3[52];
      for (int i = 0; i < 52; i++) {
        cards[i].lockCard();
        cards[i].placeBackInDeck();
      }
      for(int i = 0; i < 52; i++){
        int c = 0;
        while(c<51){
          int RandComCardNumber = cc.randomNum(0,51);
          if(tempdeck[RandComCardNumber] == null){
            tempdeck[RandComCardNumber] = cards[i];
            break;
          }
        }        
      }
      cards = tempdeck;
    }
    
    public Card3 FetchCard(){
      //int rndnum = cc.randomNum(0,51);
      boolean cardFound=false;
      for (int i = 0; i < 52; i++) {
        if(cardAvailable(i)){
          return drawCard(i);
        }
      }
      //weve got an issue, there were no cards available.
      // once learned about throw's , then implement
      return drawCard(0);
    }
    
    public boolean cardAvailable(int rndnum){
      //System.out.println("RANDOM CARD "+rndnum+" available: "+cards[rndnum].inDeck());
      if(cards[rndnum].inDeck()){
        cards[rndnum].lockCard();
        return true;
      }else{
        return false;
      }
    }
    
    public Card3 drawCard(int cardNumber){
      cards[cardNumber].removeFromDeck();
      cards[cardNumber].unlockCard();
      return cards[cardNumber];
    }
    
    public void deckStatus(){
      for (int i = 0; i < 52; i++) {
        System.out.println(cards[i].toString());
      }
    }
    
    public Card3[] drawHand(){
      Card3 card1 = FetchCard();
      Card3 card2 = FetchCard();
      Card3 card3 = FetchCard();
      Card3 card4 = FetchCard();
      Card3 card5 = FetchCard();
      Card3[] c3 = {card1,card2,card3,card4,card5};
      return c3;
    }
    
    public void showhand(Card3[] cards){
      System.out.println("Showing the deck:\n");
      for (Card3 card3 : cards) {
        System.out.println("Card: "+card3.toString());
      }
    }
    
}
