package helloworldapp;

public class HelloWorldApp {
  
  public static void main(String[] args) {

    //Box b = new Box<String>();
    //String val = "new value";
    //b.add(val);
    //System.out.println("String: "+b.get());
    
    //Box intbox = new Box<Integer>();
    //int intval = 100;
    //intbox.add(intval);
    //System.out.println("Integer: "+intbox.get());
    
    //intbox.add(val);
    //System.out.println("Integer: "+intbox.get());
    
    Common cc = new Common();
    
    Deck3 d3 = new Deck3();
    System.out.println("Deck Status\n");
    d3.deckStatus();
    
    System.out.println("Shuffling deck\n");
    d3.shuffleDeck(cc);
    System.out.println("Shuffled deck Status\n");
    d3.deckStatus();
    
    Card3[] hand1 = d3.drawHand();
    d3.showhand(hand1);
    
    Card3[] hand2 = d3.drawHand();
    d3.showhand(hand2);
    
  }
  
}
