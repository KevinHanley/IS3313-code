/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kevinhanley
 */
public class CrapsGame {
    public static void main(String[] args) {
        int die1, die2;
        
        die1 = (int) (Math.random() * 6+1);
        die2 = (int) (Math.random() * 6+1);
        
        int marker = die1 + die2;
        System.out.println("You rolled a " + marker);
        
        if(marker == 7 || marker == 11){
            System.out.println("You Win!");
        }else if(marker == 2 || marker == 3 || marker ==12){
            System.out.println("Craps! You lose...");
        }else{
            
            int[] rolls = new int[5];
            int count = 0;
            int currentRoll = 0;
            
            do{
                die1 = (int) (Math.random() * 6+1);
                die2 = (int) (Math.random() * 6+1);
                currentRoll = die1 + die2;
                //System.out.println("You rolled " + roll);
                
                if(count < rolls.length){
                    rolls[count] = currentRoll;
                }else{
                    int [] temp = rolls;
                    rolls = new int [rolls.length+3];
                    
                    //This copys the contents of the temp array from index 0, to the rolls array at index 0
                    System.arraycopy(temp, 0, rolls, 0, temp.length); 
                    System.out.println("Resizing array");
                    
                }
                
                count++;
                
                
            }while(currentRoll != marker && currentRoll != 7);
            
            if(currentRoll == marker){
                System.out.println("You win");
            }else{
                System.out.println("You lose!");
            }
            
            //print out the rolls
            System.out.println("You rolled the dice " + count + " times.");
            
            for(int i = 0; i < count; i++){
                System.out.println("Roll " + (i+1) + " was " + rolls[i]);
            }
            //testing
            
        } // end of main if
        
        
    } //end of psvm
}
