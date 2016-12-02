/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardsimulator;

import java.util.*;

public class Deck extends Stack {
       
    public Deck(){
        
        for(CardSimulator.Suits i : CardSimulator.Suits.values()){
           for(CardSimulator.Values j : CardSimulator.Values.values()){
               push(new Card(i,j));
           }
        }
    }
 
    
}
