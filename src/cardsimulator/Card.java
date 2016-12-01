package cardsimulator;
import cardsimulator.CardSimulator.Suits;
import cardsimulator.CardSimulator.Values;

public class Card {
    
   private Suits suit;
   private Values value;
   
   public Card(){
       
   }
   
   public Card(Suits suit, Values value){
       this.suit = suit;
       this.value = value;
   }
   
   @Override
   public String toString(){
      return CardSimulator.valuesToString(value) + 
              CardSimulator.suitsToString(suit);
   }
}
