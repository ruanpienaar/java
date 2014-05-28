/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author rp
 */
public class PlayingCardDeck extends PlayingCard {
  public PlayingCard[] deck = new PlayingCard[52];
  
  public PlayingCardDeck() {
    PlayingCard card1  = new PlayingCard("A","Spades");
    PlayingCard card2  = new PlayingCard("2","Spades");
    PlayingCard card3  = new PlayingCard("3","Spades");
    PlayingCard card4  = new PlayingCard("4","Spades");
    PlayingCard card5  = new PlayingCard("5","Spades");
    PlayingCard card6  = new PlayingCard("6","Spades");
    PlayingCard card7  = new PlayingCard("7","Spades");
    PlayingCard card8  = new PlayingCard("8","Spades");
    PlayingCard card9  = new PlayingCard("9","Spades");
    PlayingCard card10 = new PlayingCard("10","Spades");
    PlayingCard card11 = new PlayingCard("J","Spades");
    PlayingCard card12 = new PlayingCard("Q","Spades");
    PlayingCard card13 = new PlayingCard("K","Spades");
    
    PlayingCard card14 = new PlayingCard("A","Clubs");
    PlayingCard card15 = new PlayingCard("2","Clubs");
    PlayingCard card16 = new PlayingCard("3","Clubs");
    PlayingCard card17 = new PlayingCard("4","Clubs");
    PlayingCard card18 = new PlayingCard("5","Clubs");
    PlayingCard card19 = new PlayingCard("6","Clubs");
    PlayingCard card20 = new PlayingCard("7","Clubs");
    PlayingCard card21 = new PlayingCard("8","Clubs");
    PlayingCard card22 = new PlayingCard("9","Clubs");
    PlayingCard card23 = new PlayingCard("10","Clubs");
    PlayingCard card24 = new PlayingCard("J","Clubs");
    PlayingCard card25 = new PlayingCard("Q","Clubs");
    PlayingCard card26 = new PlayingCard("K","Clubs");
    
    PlayingCard card27 = new PlayingCard("A","Hearts");
    PlayingCard card28 = new PlayingCard("2","Hearts");
    PlayingCard card29 = new PlayingCard("3","Hearts");
    PlayingCard card30 = new PlayingCard("4","Hearts");
    PlayingCard card31 = new PlayingCard("5","Hearts");
    PlayingCard card32 = new PlayingCard("6","Hearts");
    PlayingCard card33 = new PlayingCard("7","Hearts");
    PlayingCard card34 = new PlayingCard("8","Hearts");
    PlayingCard card35 = new PlayingCard("9","Hearts");
    PlayingCard card36 = new PlayingCard("10","Hearts");
    PlayingCard card37 = new PlayingCard("J","Hearts");
    PlayingCard card38 = new PlayingCard("Q","Hearts");
    PlayingCard card39 = new PlayingCard("K","Hearts");
    
    PlayingCard card40 = new PlayingCard("A","Diamonds");
    PlayingCard card41 = new PlayingCard("2","Diamonds");
    PlayingCard card42 = new PlayingCard("3","Diamonds");
    PlayingCard card43 = new PlayingCard("4","Diamonds");
    PlayingCard card44 = new PlayingCard("5","Diamonds");
    PlayingCard card45 = new PlayingCard("6","Diamonds");
    PlayingCard card46 = new PlayingCard("7","Diamonds");
    PlayingCard card47 = new PlayingCard("8","Diamonds");
    PlayingCard card48 = new PlayingCard("9","Diamonds");
    PlayingCard card49 = new PlayingCard("10","Diamonds");
    PlayingCard card50 = new PlayingCard("J","Diamonds");
    PlayingCard card51 = new PlayingCard("Q","Diamonds");
    PlayingCard card52 = new PlayingCard("K","Diamonds");
    
    deck[0] = card1;
    deck[1] = card2;
    deck[2] = card3;
    deck[3] = card4;
    deck[4] = card5;
    deck[5] = card6;
    deck[6] = card7;
    deck[7] = card8;
    deck[8] = card9;
    deck[9] = card10;
    deck[10] = card11;
    deck[11] = card12;
    deck[12] = card13;
    deck[13] = card14;
    deck[14] = card15;
    deck[15] = card16;
    deck[16] = card17;
    deck[17] = card18;
    deck[18] = card19;
    deck[19] = card20;
    deck[20] = card21;
    deck[21] = card22;
    deck[22] = card23;
    deck[23] = card24;
    deck[24] = card25;
    deck[25] = card26;
    deck[26] = card27;
    deck[27] = card28;
    deck[28] = card29;
    deck[29] = card30;
    deck[30] = card31;
    deck[31] = card32;
    deck[32] = card33;
    deck[33] = card34;
    deck[34] = card35;
    deck[35] = card36;
    deck[36] = card37;
    deck[37] = card38;
    deck[38] = card39;
    deck[39] = card40;
    deck[40] = card41;
    deck[41] = card42;
    deck[42] = card43;
    deck[43] = card44;
    deck[44] = card45;
    deck[45] = card46;
    deck[46] = card47;
    deck[47] = card48;
    deck[48] = card49;
    deck[49] = card50;
    deck[50] = card51;
    deck[51] = card52;
  }
  
  public void display_deck(){
    for (int i = 0; i < 51; i++) {
      System.out.println("Card Number: "+deck[i].cardNumberString+" Suite: "+deck[i].cardSuiteString);
    }
  }
  
}
