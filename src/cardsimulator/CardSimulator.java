package cardsimulator;

public class CardSimulator {

    public enum Suits {HEARTS, DIAMONDS, SPADES, CLUBS};
    public enum Values {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
                        NINE, TEN, JACK, QUEEN, KING};
    
    public static void main(String[] args) {
       Deck deck = new Deck();
       
       int size = deck.size();
       System.out.println(size);
       System.out.println(deck.draw());
       System.out.println(deck.size());
       
//       for(int i = 0; i < size; i++){
//       System.out.println(deck.get(i));
//       }
    }
    
    public static String suitsToString(Suits suit){
        switch(suit){
            case HEARTS: return "H";
            case DIAMONDS: return "D";
            case SPADES: return "S";
            case CLUBS: return "C";
            default: return "ERROR"; 
        }
    }
    
    public static String valuesToString(Values value){
        switch(value){
            case ACE: return "A";
            case TWO: return "2";
            case THREE: return "3";
            case FOUR: return "4";
            case FIVE: return "5";
            case SIX: return "6";
            case SEVEN: return "7";
            case EIGHT: return "8";
            case NINE: return "9";
            case TEN: return "10";
            case JACK: return "J";
            case QUEEN: return "Q";
            case KING: return "K";
            default: return "ERROR"; 
        }
    }
}
