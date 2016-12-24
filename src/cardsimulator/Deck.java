/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsimulator;

import java.util.*;

public class Deck extends ArrayList<Card> {
       
    public Deck(){
        
        for(CardSimulator.Suits i : CardSimulator.Suits.values()){
           for(CardSimulator.Values j : CardSimulator.Values.values()){
               add(new Card(i,j));
           }
        }
    }
    
public Card draw(){
    Random ranGen = new Random();
    return this.remove(ranGen.nextInt(this.size()-1));
}
 
    
}
