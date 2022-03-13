/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annemetest;
import javax.swing.JOptionPane;

/**
 *
 * @author rudol
 */
public class AnnemeTest
{
    //------------------------------------------------------------------------//
    // Main Method - Application Enter / Exit
    public static void main(String[] args)
    {
        //Declaring the variables// 
        
        String typeOfCar = ""; 
        double howMuchTheCarIsWorth = 0; 
        
        //User input//
        
        typeOfCar = JOptionPane.showInputDialog("What type of car do you have?");
        String carPrice = JOptionPane.showInputDialog("How much is your car worth?");
        //howMuchTheCarIsWorth = Double.parseDouble(typeOfCar);
//        
//        
        JOptionPane.showMessageDialog(null, "Your car is: " + typeOfCar +  
                                            "\nThe Price is: " + howMuchTheCarIsWorth +
                                            "\n\n\nThanks for using this application!");
        
        System.out.println(carPrice);
               
//       for(int i = 0 ; i < 4; i++)
//       {
//           typeOfCar = JOptionPane.showInputDialog("What type of car do you have?"); 
//       }
    }
    
    
    
}
//---------------------...ooo000 END OF FILE 000ooo...------------------------//
