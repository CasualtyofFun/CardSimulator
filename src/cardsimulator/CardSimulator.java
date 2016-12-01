package cardsimulator;

public class CardSimulator {

    public static enum Suits {HEARTS, DIAMONDS, SPADES, CLUBS};
    public static enum Values {ACE,ONE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,
                         TEN,JACK,QUEEN,KING};
    
    public static void main(String[] args) {
       Card card = new Card(Suits.CLUBS, Values.KING);
       System.out.println(card.toString());
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
            case ONE: return "1";
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
