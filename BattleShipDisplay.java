/*
 * BattleShipDisplay Game using 2D arrays, for, abrievated for, while, if and GUI interface.
 * Bishwash Khakda Onish Shrestha
 * 11/10/2022
 */

import java.util.*;
import javax.swing.*;
public class BattleShipDisplay {
    public static void main (String[] args){
        String introInformation = "<html><h2>Welcome to Battle Ship:<br>Galatica</h2>"
                    + " Generate your ship on random location with a click of a button<br> as many time as you want </html>";
        String[] openingOpt = {"Spawn the Ship"};
        String[] introOptions = {"Show Another Board", "Quit"};
        int backDoor = 0 ;
        int userChoice = 0;
        JOptionPane.showOptionDialog(null,introInformation ,
                    "BattleShip: Galactica",
                    0, 0, null, openingOpt, introOptions[0]);
        
        while (backDoor ==0){
            String[][] protoBG = {{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},
                                {"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"},{"_","_","_","_","_","_","_","_","_","_"}};
            String battleGround = "";
            
            if (userChoice==0){
                Random randGen = new Random();
                int randomCordinate = randGen.nextInt(2);
        
                //For Horizontal movement of the Ship
                if (randomCordinate == 1){
                    int cordinate_X = randGen.nextInt(6);
                    int cordinate_Y = randGen.nextInt(10);
                    for (int countDown_3 =0; countDown_3 < protoBG.length; countDown_3++){
                        if (countDown_3 == cordinate_Y){
                            for (int countDown_4 = 0; countDown_4<5; countDown_4++){
                                protoBG[cordinate_Y][cordinate_X] = "X";
                                cordinate_X++;
                            }
                        }
                    }   
                }
        
                //For Vertical Movement of the ship
                else{
                    int cordinate_X = randGen.nextInt(10);
                    int cordinate_Y = randGen.nextInt(6);
                    for (int countDown_3 =0; countDown_3 < protoBG.length; countDown_3++){
                        if (countDown_3 == cordinate_X){
                            for (int countDown_4 = 0; countDown_4<5; countDown_4++){
                                protoBG[cordinate_Y][cordinate_X] = "X";
                            cordinate_Y++;
                            }
                        }
                    }   
                }
        
                for (String[] protoBG1 : protoBG) {
                    for (String item : protoBG1) {
                        battleGround = battleGround + "    " + item;
                    }
                    battleGround = battleGround + "\n";
                }   
        
                userChoice = JOptionPane.showOptionDialog(null, battleGround,
                        "BattleShip Galactica",
                        0, 0, null, introOptions, introOptions[0]);
            }
            else{
                backDoor =1;
                JOptionPane.showMessageDialog(null, "The Game is TERMINATED!!!", "ENDGAME", 0, null);//Termination Screen
            }    
        }
    }
}

