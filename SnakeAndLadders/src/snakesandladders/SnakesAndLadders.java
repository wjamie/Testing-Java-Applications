/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author jwalker15
 */
public class SnakesAndLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         HashMap<Integer, Integer> snake = new HashMap<Integer, Integer>();
         HashMap<Integer, Integer> ladder = new HashMap<Integer, Integer>();
         
         {
         snake.put(12,11);
         ladder.put(9, 21);
        
         System.out.println(roll(0,6));
        
        }
    }
    
    
    public static int roll(int min, int max){
        int x = (int)((Math.random()*((max-min)+1))+min);
        return x;
    }
    
    
    
    public static int calculatePosition(int position, int diceValue)
  
    {   int END = 100;
          position = position + diceValue;
      
        if(position > END)
      {
          position = position - diceValue;
         return position;
      }
      
      System.out.println(position);
      return position;
    }
}
